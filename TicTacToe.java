import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TicTacToe{
    
    public static void main(String[] args){
        JFrame frame = new JFrame("Tic Tac Toe");
        JPanel board = new JPanel(); 
        JButton tile = new JButton();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        board.add(new JButton("")); 
        board.add(new JButton("")); 
        board.add(new JButton("")); 
        board.add(new JButton("")); 
        board.add(new JButton("")); 
        board.add(new JButton("")); 
        board.add(new JButton("")); 
        board.add(new JButton("")); 
        // board.add(new JButton("")); 

        // var b = new JButton();
        // b.addActionListener(new ActionListener() {

        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         // TODO Auto-generated method stub
        //         b.setText("Yo");
        //     }
            
        // });


        board.add(newButton());


        board.setLayout(new GridLayout(3,3));
        frame.add(board);
        frame.setVisible(true);

    }

    public void Click(ActionEvent event){
        System.out.println("X");
    }

    public static JButton newButton() {
        JButton b = new JButton();
        b.addActionListener(e -> {
            if (b.getText().equals("yo")) {
                b.setText("");
            }
            else {
                b.setText("yo");
            }
        });
        return b;
    }
    

    


}