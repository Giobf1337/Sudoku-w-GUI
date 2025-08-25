import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setTitle("Sudoku with GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); //previne reajuste de tamanho de janela
        this.setSize(420,420); //set x-dimension and y-dimension
        this.setVisible(true);

        ImageIcon image = new ImageIcon("img/sudoku-3.jpg"); //cria uma ImageIcon
        this.setIconImage(image.getImage()); // muda o icon do frame
        this.getContentPane().setBackground(Color.gray);
    }
}
