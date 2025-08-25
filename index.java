import javax.swing.*;
import java.awt.*;

public class index {
    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setTitle("Sudoku with GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); //previne reajuste de tamanho de janela
        frame.setSize(420,420); //set x-dimension and y-dimension
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("img/sudoku-3.jpg"); //cria uma ImageIcon
        frame.setIconImage(image.getImage()); // muda o icon do frame
        frame.getContentPane().setBackground(Color.gray);
    }
}
