import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TicTacToe{
    JFrame frame = new JFrame("Tic Tac Toe");
    JPanel board = new JPanel(); 
    JPanel text = new JPanel();
    JLabel statusLabel = new JLabel();
    JPanel banner = new JPanel();
    JButton [][] tile = new JButton[3][3];

    String playerX = "X";
    String playerO = "O";
    String currentPlayer = playerX;
    int turns;

    boolean gameOver = false;
    
    TicTacToe(){
        //setting up the grid 
        frame.setLayout(new BorderLayout());
        board.setLayout(new GridLayout(3,3));
        frame.add(board, BorderLayout.CENTER);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);

        banner.setBackground(Color.WHITE);
        banner.setForeground(Color.WHITE);
        banner.setFont(new Font("Times New Roman", Font.BOLD, 100));
        statusLabel.setHorizontalAlignment(JLabel.CENTER);
        banner.setOpaque(true);

        banner.setLayout(new BorderLayout());
        banner.add(statusLabel, BorderLayout.CENTER);
        frame.add(banner, BorderLayout.NORTH);


        Font textfont = new Font("Times New Roman", Font.BOLD, 100);

        // board.add(new JButton("")); 
        // board.add(new JButton("")); 
        // board.add(new JButton("")); 
        // board.add(new JButton("")); 
        // board.add(new JButton("")); 
        // board.add(new JButton("")); 
        // board.add(new JButton("")); 
        // board.add(new JButton("")); 
        // board.add(new JButton("")); 

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                tile[r][c] = new JButton("");
                tile[r][c].setForeground(Color.BLUE);
                tile[r][c].setFont(textfont);
                tile[r][c].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (gameOver) return;
                        JButton tile = (JButton) e.getSource();
                        if (tile.getText() == "") {
                            tile.setText(currentPlayer);
                            turns++;
                            checkWinner();
                            if (!gameOver) {
                                currentPlayer = currentPlayer == playerX ? playerO : playerX;
                            }
                        }
                    }
                });
                board.add(tile[r][c]);
            }
        }
    }

   public void checkWinner(){
        //horizontal checks each row 
        for (int r = 0; r < 3; r++) {
            if (tile[r][0].getText() == "") continue;

            if (tile[r][0].getText() == tile[r][1].getText() &&
                tile[r][1].getText() == tile[r][2].getText()) {
                for (int i = 0; i < 3; i++) {
                    setWinner(tile[r][i]);
                }
                gameOver = true;
                return;
            }
        }
        //vertical checks each col
        for (int c = 0; c < 3; c++) {
            if (tile[0][c].getText() == "") continue;

            if (tile[0][c].getText() == tile[1][c].getText() &&
                tile[1][c].getText() == tile[2][c].getText() ){
                //tile[2][c].getText() != "") {
                for (int i = 0; i < 3; i++) {
                    setWinner(tile[i][c]);
                }
                gameOver = true;
                return;
            }
        }
        //diagonally
        if (tile[0][0].getText() == tile[1][1].getText() &&
            tile[1][1].getText() == tile[2][2].getText() &&
            tile[0][0].getText() != "") {
            for (int i = 0; i < 3; i++) {
                setWinner(tile[i][i]);
            }
            gameOver = true;
            return;
        }
        //anti-diagonally
        if (tile[0][2].getText() == tile[1][1].getText() &&
            tile[1][1].getText() == tile[2][0].getText() &&
            tile[0][2].getText() != "") {
            setWinner(tile[0][2]);
            setWinner(tile[1][1]);
            setWinner(tile[2][0]);
            gameOver = true;
            return;
        }


        if (turns == 9) {
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    setTie(tile[r][c]);
                }
            }
            gameOver = true;
        }
    }
    

    public void setWinner(JButton tile){
        tile.setForeground(Color.GREEN);
        statusLabel.setText(currentPlayer + " is the winner!");
        
        gameOver = true; 

    }
    public void setTie(JButton tile) {
        tile.setForeground(Color.ORANGE);
        statusLabel.setText("Tie!");
        gameOver = true;
    }

    public static void main(String[] args) {
        TicTacToe tictactoe = new TicTacToe();
    }
    

    


}