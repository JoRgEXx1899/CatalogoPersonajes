
import personajes.FabricaAbstractaPersonaje;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class tipo extends JFrame {

    private JPanel contentPane;

    public tipo(String m1, String m2, String m3, String m4, String m5, FabricaAbstractaPersonaje fab) {
        this.setResizable(false);
        setBounds(100, 100, 670, 492);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        //setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblSeleccioneTipo = new JLabel("SELECCIONA UN TIPO");
        lblSeleccioneTipo.setForeground(java.awt.Color.black);
        lblSeleccioneTipo.setFont(new Font("Castellar", Font.BOLD, 25));
        lblSeleccioneTipo.setBounds(20, 350, 370, 86);
        contentPane.add(lblSeleccioneTipo);

        JButton op1 = new JButton("");
        op1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (fab.getPersonaje(1).Clase.equals("Humanos")) {
                    Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
                    frame.setVisible(true);
                }

                if (fab.getPersonaje(1).Clase.equals("Orcos")) {
                    Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
                    frame.setVisible(true);

                }

                if (fab.getPersonaje(1).Clase.equals("Enanos")) {
                    Vista frame = new Vista(fab.getPersonaje(1), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
                    frame.setVisible(true);

                }

            }
        });
        op1.setBounds(500, 100, 100, 30);
        contentPane.add(op1);

        JButton op2 = new JButton("");
        op2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fab.getPersonaje(1).Clase.equals("Humanos")) {
                    Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
                    frame.setVisible(true);

                }

                if (fab.getPersonaje(1).Clase.equals("Orcos")) {
                    Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
                    frame.setVisible(true);

                }
                if (fab.getPersonaje(1).Clase.equals("Enanos")) {
                    Vista frame = new Vista(fab.getPersonaje(2), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
                    frame.setVisible(true);

                }
            }
        });

        op2.setBounds(500, 150, 100, 30);
        contentPane.add(op2);

        JButton op3 = new JButton("");
        op3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fab.getPersonaje(1).Clase.equals("Humanos")) {
                    Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
                    frame.setVisible(true);

                }

                if (fab.getPersonaje(1).Clase.equals("Orcos")) {
                    Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
                    frame.setVisible(true);
                    ;
                }
                if (fab.getPersonaje(1).Clase.equals("Enanos")) {
                    Vista frame = new Vista(fab.getPersonaje(3), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
                    frame.setVisible(true);

                }
            }
        });
        op3.setBounds(500, 200, 100, 30);
        contentPane.add(op3);

        JButton op4 = new JButton("");
        op4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fab.getPersonaje(1).Clase.equals("Humanos")) {
                    Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
                    frame.setVisible(true);

                }

                if (fab.getPersonaje(1).Clase.equals("Orcos")) {
                    Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
                    frame.setVisible(true);

                }

                if (fab.getPersonaje(1).Clase.equals("Enanos")) {
                    Vista frame = new Vista(fab.getPersonaje(4), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
                    frame.setVisible(true);

                }
            }
        });
        op4.setBounds(500, 250, 100, 30);
        contentPane.add(op4);

        JButton op5 = new JButton("");
        op5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fab.getPersonaje(1).Clase.equals("Humanos")) {
                    Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("/resources/1humano.png")));
                    frame.setVisible(true);

                }
                if (fab.getPersonaje(1).Clase.equals("Orcos")) {
                    Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("/resources/orcos.png")));
                    frame.setVisible(true);

                }

                if (fab.getPersonaje(1).Clase.equals("Enanos")) {
                    Vista frame = new Vista(fab.getPersonaje(5), new ImageIcon(tipo.class.getResource("/resources/enano2.png")));
                    frame.setVisible(true);

                }
            }
        });

        op5.setBounds(500, 300, 100, 30);
        contentPane.add(op5);

        op1.setText(m1);
        op2.setText(m2);
        op3.setText(m3);
        op4.setText(m4);
        op5.setText(m5);

        JLabel fondo = new JLabel("");
        fondo.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/fondo2.png")));
        fondo.setBounds(0, 0, 670, 492);
        contentPane.add(fondo);
    }
}
