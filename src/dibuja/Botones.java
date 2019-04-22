package dibuja;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;



public class Botones extends JButton {
    public Botones(ImageIcon icon){
        setIcon(icon);
        setMargin(new Insets(0,0,0,0));
        setIconTextGap(0);
        setBorderPainted(false);
        setBorder(null);
        setSize(icon.getImage().getWidth(null),
                icon.getImage().getHeight(null));
    }
}
