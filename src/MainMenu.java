package src;

import javax.swing.*;
import java.awt.*;

/*
    ToDo:
        - Rearenge gameGrid w/ 3x3(3x3)                                     <-- DONE
        - create a random pre-filled grid cells method -> gamePanel
        - segregate/padronizing buttons class n' behavior
        - Make it work! Good luck.

 */

public class MainMenu {
    public static void main(String[] args) {

        // ==== Frame ====
        JFrame frame = new JFrame("Gio's Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(800, 700);
        frame.setLocationRelativeTo(null);

        // ==== Painel com CardLayout (telas) ====
        JPanel cards = new JPanel(new CardLayout());
        //--------------------------------------------

        // ==== MAIN MENU Screen ====
        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.GRAY);
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

        // Espaço acima do título - Gap above title
        menuPanel.add(Box.createVerticalStrut(100));

        // Title
        JLabel titleLabel = new JLabel("GIO's Sudoku");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        menuPanel.add(titleLabel);

        // Gap between title and buttons
        menuPanel.add(Box.createVerticalStrut(50));


        // PLAY button
        JButton playBtn = new Button("Play");
        menuPanel.add(playBtn);
        menuPanel.add(Box.createVerticalStrut(20));

        // Config Button
        JButton configBtn = new Button("Configurações");
        configBtn.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Abrir config..."));
        menuPanel.add(configBtn);
        menuPanel.add(Box.createVerticalStrut(20));

        // Credits Button
        JButton creditsBtn = new Button("Créditos");
        menuPanel.add(creditsBtn);
        menuPanel.add(Box.createVerticalStrut(20));

        // Exit Button
        JButton exitBtn = new Button("Sair");
        exitBtn.addActionListener(e -> {
            int resposta = JOptionPane.showConfirmDialog(frame, "Deseja realmente sair?",
                    "Sair", JOptionPane.YES_NO_OPTION);
            if (resposta == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
        menuPanel.add(exitBtn);

        // -----------------------------

        // ==== Sudoku's Grid ====
        GamePanel gameFrame = new GamePanel();
        JPanel gameWrapper = new JPanel(new FlowLayout(FlowLayout.CENTER, 50, 50));
        gameWrapper.setBackground(Color.GRAY); // fundo para combinar
        gameWrapper.add(gameFrame);

        // ==== CREDITS Screen ====
        JPanel creditsPanel = new JPanel();
        creditsPanel.setBackground(Color.DARK_GRAY);
        creditsPanel.setLayout(new BoxLayout(creditsPanel, BoxLayout.Y_AXIS));
        creditsPanel.add(Box.createVerticalStrut(100));

        JLabel creditsLabel = new JLabel("Créditos: Desenvolvido por Gio");
        creditsLabel.setFont(new Font("Arial", Font.BOLD, 20));
        creditsLabel.setForeground(Color.WHITE);
        creditsLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        creditsPanel.add(creditsLabel);

        creditsPanel.add(Box.createVerticalStrut(50));

        JButton voltarBtn = new Button("Voltar ao menu");
        creditsPanel.add(voltarBtn);

        // -----------------------------
        // ==== Adiciona telas no CardLayout ====
        cards.add(menuPanel, "Menu");
        cards.add(creditsPanel, "Créditos");
//        cards.add(gameFrame, "Jogo");
        cards.add(gameWrapper,"Jogo");

        // Ações mudança de tela \ panel-card changes
        CardLayout cl = (CardLayout) cards.getLayout();
        playBtn.addActionListener(e -> cl.show(cards,"Jogo"));
        creditsBtn.addActionListener(e -> cl.show(cards, "Créditos"));
        voltarBtn.addActionListener(e -> cl.show(cards, "Menu"));

        JTextField texto = new JTextField();
        texto.setColumns(1);

        // -----------------------------
        // Exibe frame
        frame.add(cards);
        frame.setVisible(true);
    }
}
