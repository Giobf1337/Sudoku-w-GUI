import javax.swing.*;
import java.awt.*;

public class index {
    public static void main(String[] args) {



        ImageIcon image = new ImageIcon("img/sudoku-2-1.png");

//        JLabel label = new JLabel();
//        label.setText("Ace's Sudoku");
//        label.setIcon(image);
//
//        label.setVerticalTextPosition(JLabel.BOTTOM);
//        label.setVerticalAlignment(JLabel.CENTER);
//        label.setBounds(0, 0, 200, 200);
        JLabel titleLabel = new JLabel();
        titleLabel.setText("TITLE");
        titleLabel.setVerticalTextPosition(JLabel.CENTER);

        JLabel buttonsLabel = new JLabel();
        buttonsLabel.setText("Menu Buttons");
//        buttonsLabel.setVerticalTextPosition(JLabel.CENTER);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.gray);
        titlePanel.setBounds(220, 80, 350, 100);
        titlePanel.add(titleLabel);

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.gray);
        menuPanel.setBounds(315, 200, 150, 350);
        menuPanel.add(buttonsLabel);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(800,700);
        frame.setVisible(true);
        frame.add(titlePanel);
        frame.add(menuPanel);



    }
}
