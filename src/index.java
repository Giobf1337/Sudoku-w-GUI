package src;

import javax.swing.*;
import java.awt.*;

public class index {
    public static void main(String[] args) {



//        ImageIcon image = new ImageIcon("img/sudoku-2-1.png");

//        label.setText("Ace's Sudoku");

        JButton button = new JButton("Play");
        button.setFocusable(false);
        button.setBounds(30, 20, 250, 30); // revisar posiocionamento de botao X texto.
        button.addActionListener(e -> System.out.println("funfou"));

        JLabel titleLabel = new JLabel("Title - Gio's Sudoku");
        titleLabel.setVerticalTextPosition(JLabel.CENTER);
//        titleLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel buttonsLabel = new JLabel("MENU Buttons");
        buttonsLabel.setVerticalAlignment(JLabel.CENTER);
        buttonsLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.gray);
        titlePanel.setBounds(220, 80, 350, 100);
        titlePanel.add(titleLabel);

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.gray);
        menuPanel.setBounds(295, 200, 200, 350);
        menuPanel.add(buttonsLabel);

        menuPanel.add(button);

        JFrame frame = new JFrame();
        /*
        ToDo: - adjust background IMG; ## NOT YET ##
              - create logo's animation x Title -> main menu screen; ## NOT YET ##
              - redirect/create Layered Pane (panels) from each menu button; ## ALMOST ##

         */
        frame.setTitle("Gio's Sudoku");
//        frame.setIconImage();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(800,700);
        frame.setVisible(true);
        frame.add(titlePanel);
        frame.add(menuPanel);




    }
}
