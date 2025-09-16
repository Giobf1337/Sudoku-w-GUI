package src;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;

public class GamePanel extends JPanel{
    JPanel gameFrame = new JPanel();

    GamePanel(){
        JTextField[][] cells = new JTextField[9][9];

        // gameboard/grid preferences
        this.setPreferredSize(new Dimension(300, 250));
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(new GridLayout(3,3,1,1));

        // ### Formating cell's input
        MaskFormatter mask = null;
        try {
            mask = new MaskFormatter("#");
            mask.setValidCharacters("123456789");
        } catch (java.text.ParseException e) {
            e.getStackTrace();
        }

        // grid-input creation
        for (int i = 0; i < 9; i++){
            JPanel subPanel = new JPanel(new GridLayout(3,3));
            this.add(subPanel);
            for (int row = 0; row < 3; row++){
                for (int col = 0; col < 3; col ++){
                    JFormattedTextField cell = new JFormattedTextField(mask);
                    cell.setColumns(1);
                    cell.setHorizontalAlignment(JTextField.CENTER);
                    cell.setPreferredSize(new Dimension(6,6));
                    cell.setHorizontalAlignment(JTextField.CENTER);
                    cell.setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, Color.lightGray));
                    cell.setFont(new Font("Arial", Font.BOLD, 16));

                    subPanel.add(cell);
                    cells[row][col] = cell;
                }
            }
            if (i<3){
                subPanel.setName("topCell"+i);
            } if (i>=3 && i<6){
                subPanel.setName("middleCell"+i);
            } else {
                subPanel.setName("bottomCell"+i);
            }

        }
    }
}
