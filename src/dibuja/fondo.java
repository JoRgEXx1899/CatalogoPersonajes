package dibuja;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;


public class fondo extends JPanel {
    
    private Image img;
    public fondo(Image img){
        this.img=img;
        Dimension dimension=new Dimension(img.getWidth(null),img.getHeight(null));
        this.setPreferredSize(dimension);
        this.setMaximumSize(dimension);
        this.setMinimumSize(dimension);
        this.setSize(dimension);
        this.setLayout(null);
    }    
    
    @Override
    protected void paintComponent (Graphics g){
        g.drawImage(img, 0, 0, null);
        setOpaque(false);
    }
}
