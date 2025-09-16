package src;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {
    Dimension buttonSize = new Dimension(300, 50);

    Button(String text){
        this.setText(text);
        this.setFocusable(false);
        this.setBackground(Color.lightGray);
        this.setMaximumSize(buttonSize);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.setBorder(BorderFactory.createEtchedBorder());
    }
}
