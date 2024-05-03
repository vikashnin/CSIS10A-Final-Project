import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConnectFour {

    public static void main(String[] args){
        //CREATING A GRID 
        int tile = 80;
        int rows = 6;
        int cols = 7;

        JFrame frame = new JFrame("Connect Four Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel grid = new JPanel(new GridLayout(rows, cols));

        frame.setSize(700, 600);
        frame.setLayout(new GridLayout(7,7));

        JButton[][] board = new JButton[6][7];

        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         Circle circle = new Circle();
        //         circle.setCenter

                
        //     }
        // }

        

        // frame.add(new JButton("1")); 
        // frame.add(new JButton("2")); 
        // frame.add(new JButton("3")); 
        // frame.add(new JButton("4")); 
        // frame.add(new JButton("6")); 
        // frame.add(new JButton("7")); 
        // frame.add(new JButton("8")); 
        // frame.add(new JButton("9")); 
        // frame.add(new JButton("10")); 
        // frame.add(new JButton("11")); 
        // frame.add(new JButton("12")); 
        // frame.add(new JButton("13")); 
        // frame.add(new JButton("14")); 
        frame.add(grid);
        frame.setVisible(true);

        

        




    }


}