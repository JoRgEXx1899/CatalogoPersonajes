
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.PageAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import sun.font.TrueTypeFont;

public class CatalogoPersonajes extends JFrame {

    private JPanel contentPane;
    FabricaAbstractaPersonaje fabricador;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CatalogoPersonajes frame = new CatalogoPersonajes();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CatalogoPersonajes() {

        this.setResizable(false);

        setBounds(100, 100, 670, 492);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel lblSeleccioneUnaClase = new JLabel("SELECCIONA UNA CLASE");
        lblSeleccioneUnaClase.setForeground(java.awt.Color.black);
        lblSeleccioneUnaClase.setFont(new Font("Castellar", Font.BOLD, 25));
        lblSeleccioneUnaClase.setBounds(20, 380, 370, 86);
        contentPane.add(lblSeleccioneUnaClase);

        JButton guerbtn = new JButton("Humanos");
        guerbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                fabricador = new FabricaConcretaGuerreros();
                Vista frame = new Vista(fabricador.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
                frame.setVisible(true);

            }

        });
        guerbtn.setBounds(50, 50, 100, 30);
        contentPane.add(guerbtn);

        JButton btnOp = new JButton("Orcos");
        btnOp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fabricador = new FabricaConcretaOrcos();
                Vista frame = new Vista(fabricador.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
                frame.setVisible(true);

            }
        });
        btnOp.setBounds(300, 50, 100, 30);
        contentPane.add(btnOp);

        JButton btnOp_1 = new JButton("Enanos");
        btnOp_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fabricador = new FabricaConcretaEnanos();
                Vista frame = new Vista(fabricador.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
                frame.setVisible(true);

            }
        });
        btnOp_1.setBounds(500, 50, 100, 30);
        contentPane.add(btnOp_1);

        JLabel human = new JLabel("");
        human.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/1humano.png")));
        human.setBounds(30, 103, 370, 350);
        contentPane.add(human);

        JLabel orc = new JLabel("");
        orc.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/orcos.png")));
        orc.setBounds(270, 70, 370, 350);
        contentPane.add(orc);

        JLabel ena = new JLabel("");
        ena.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/enano2.png")));
        ena.setBounds(500, 227, 370, 200);
        contentPane.add(ena);

        JLabel fondo = new JLabel("");
        fondo.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/fondo2.png")));
        fondo.setBounds(0, 0, 670, 492);
        contentPane.add(fondo);

    }
}
