
import armaduras.ArmaduraAbstracta;
import armaduras.FabricaArmadura;
import armas.ArmaAbstracta;
import armas.FabricaArma;
import personajes.FabricaConcretaOrcos;
import personajes.FabricaConcretaGuerreros;
import personajes.FabricaConcretaEnanos;
import personajes.FabricaAbstractaPersonaje;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.PageAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import personajes.PersonajeAbstracto;
import sun.font.TrueTypeFont;

public class CatalogoPersonajes extends JFrame {

    private JPanel contentPane;

    FabricaAbstractaPersonaje fabricador;

    Director director = new Director();
    PersonajeBuilder pj_enano = new PjEnanoBuilder(); //BUILDERS
    PersonajeBuilder pj_humano = new PjHumanoBuilder();
    PersonajeBuilder pj_orco = new PjOrcoBuilder();

    FabricaArma fabarma = new FabricaArma();
    FabricaArmadura fabarmadura = new FabricaArmadura();

    ArmaduraAbstracta armadura;
    ArmaAbstracta arma;
    PersonajeAbstracto personaje;

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

        setBounds(100, 100, 1100, 510);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblSeleccioneUnaClase = new JLabel("SELECCIONE LAS PARTES DE SU PERSONAJE");
        lblSeleccioneUnaClase.setForeground(java.awt.Color.black);
        lblSeleccioneUnaClase.setFont(new Font("Castellar", Font.BOLD, 25));
        lblSeleccioneUnaClase.setBounds(20, -10, 700, 86);
        contentPane.add(lblSeleccioneUnaClase);

        JLabel lblVida = new JLabel("Vida:");
        lblVida.setFont(new Font("Brodway", Font.BOLD, 18));
        lblVida.setForeground(java.awt.Color.black);
        lblVida.setBounds(800, 50, 250, 25);
        contentPane.add(lblVida);
        JLabel lblEscudo = new JLabel("Escudo:");
        lblEscudo.setFont(new Font("Brodway", Font.BOLD, 18));
        lblEscudo.setForeground(java.awt.Color.black);
        lblEscudo.setBounds(800, 75, 250, 25);
        contentPane.add(lblEscudo);
        JLabel lblAtaque = new JLabel("Ataque:");
        lblAtaque.setFont(new Font("Brodway", Font.BOLD, 18));
        lblAtaque.setForeground(java.awt.Color.black);
        lblAtaque.setBounds(800, 100, 250, 25);
        contentPane.add(lblAtaque);
        JLabel lblCadencia = new JLabel("Cadencia:");
        lblCadencia.setFont(new Font("Brodway", Font.BOLD, 18));
        lblCadencia.setForeground(java.awt.Color.black);
        lblCadencia.setBounds(800, 125, 250, 25);
        contentPane.add(lblCadencia);
        JLabel lblVM = new JLabel("Vel. de Mov.:");
        lblVM.setFont(new Font("Brodway", Font.BOLD, 18));
        lblVM.setForeground(java.awt.Color.black);
        lblVM.setBounds(800, 150, 250, 25);
        contentPane.add(lblVM);
        JLabel lblRV = new JLabel("Regen. de vida:");
        lblRV.setFont(new Font("Brodway", Font.BOLD, 18));
        lblRV.setForeground(java.awt.Color.black);
        lblRV.setBounds(800, 175, 250, 25);
        contentPane.add(lblRV);
        JLabel lblDistA = new JLabel("Distancia de ataque:");
        lblDistA.setFont(new Font("Brodway", Font.BOLD, 18));
        lblDistA.setForeground(java.awt.Color.black);
        lblDistA.setBounds(800, 200, 250, 25);
        contentPane.add(lblDistA);

        JComboBox<String> Raza;
        Raza = new javax.swing.JComboBox<>();
        Raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Humano", "Orco", "Enano"}));
        Raza.setBounds(20, 50, 100, 30);
        contentPane.add(Raza);

        JLabel imgRaza = new JLabel("");
        imgRaza.setBounds(30, 103, 370, 350);
        contentPane.add(imgRaza);

        Raza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String raza_seleccionada = Raza.getSelectedItem().toString();
                    if (raza_seleccionada == "Humano") {
                        director.personajeBuilder(pj_humano);

                        //fabricador = new FabricaConcretaGuerreros();
                        personaje = director.getPersonaje();
                        imgRaza.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/1humano.png")));
                    } else if (raza_seleccionada == "Orco") {
                        director.personajeBuilder(pj_orco);

                        //fabricador = new FabricaConcretaOrcos();
                        personaje = director.getPersonaje();
                        imgRaza.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/orcos.png")));
                    } else if (raza_seleccionada == "Enano") {
                        director.personajeBuilder(pj_enano);

                        //fabricador = new FabricaConcretaEnanos();
                        personaje = director.getPersonaje();
                        imgRaza.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/enano2.png")));
                    }
                    

                } catch (Exception e) {

                }
            }
        });

        JComboBox<String> Arma;
        Arma = new javax.swing.JComboBox<>();
        Arma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Arco", "Baculo", "Ballesta", "Daga", "Espada", "Espadon", "Manopla", "Mazo"}));
        Arma.setBounds(200, 50, 100, 30);
        contentPane.add(Arma);

        JLabel imgArma = new JLabel("");
        imgArma.setBounds(200, 103, 270, 250);
        contentPane.add(imgArma);

        Arma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg1) {
                try {
                    String item_seleccionado = Arma.getSelectedItem().toString();
                    if (item_seleccionado == "Arco") {
                        arma = fabarma.getArma(1);
                        imgArma.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/arco.png")));
                    } else if (item_seleccionado == "Baculo") {
                        arma = fabarma.getArma(2);
                        imgArma.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/baculo.png")));
                    } else if (item_seleccionado == "Ballesta") {
                        arma = fabarma.getArma(3);
                        imgArma.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/ballesta.png")));
                    } else if (item_seleccionado == "Daga") {
                        arma = fabarma.getArma(4);
                        imgArma.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/daga.png")));
                    } else if (item_seleccionado == "Espada") {
                        arma = fabarma.getArma(5);
                        imgArma.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/espada.png")));
                    } else if (item_seleccionado == "Espadon") {
                        arma = fabarma.getArma(6);
                        imgArma.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/espadon.png")));
                    } else if (item_seleccionado == "Manopla") {
                        arma = fabarma.getArma(7);
                        imgArma.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/manopla.png")));
                    } else if (item_seleccionado == "Mazo") {
                        arma = fabarma.getArma(8);
                        imgArma.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/mazo.png")));
                    }
                    personaje.setArma(arma);
                    
                } catch (Exception e) {

                }
            }

        });

        JComboBox<String> Armadura;
        Armadura = new javax.swing.JComboBox<>();
        Armadura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Ligera", "Pesada", "Tunica"}));
        Armadura.setBounds(500, 50, 100, 30);
        contentPane.add(Armadura);

        JLabel imgArmadura = new JLabel("");
        imgArmadura.setBounds(500, 103, 370, 350);
        contentPane.add(imgArmadura);

        Armadura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    String item_seleccionado = Armadura.getSelectedItem().toString();
                    if (item_seleccionado == "Ligera") {
                        armadura = fabarmadura.getArmadura(2);
                        imgArmadura.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/ligera.png")));
                    } else if (item_seleccionado == "Pesada") {
                        armadura = fabarmadura.getArmadura(1);
                        imgArmadura.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/pesada.png")));
                    } else if (item_seleccionado == "Tunica") {
                        armadura = fabarmadura.getArmadura(3);
                        imgArmadura.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/tunica.png")));
                    }                    
                    personaje.setArmadura(armadura);

                } catch (Exception e) {
                }
            }

        });
        JButton armar = new JButton("Armar");
        armar.setBounds(800, 300, 100, 30);
        contentPane.add(armar);

        armar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                try {
                    director.construirPersonaje(arma, armadura);
                    personaje = director.getPersonaje();
                    lblVida.setText("Vida: " + personaje.getVida());
                    lblEscudo.setText("Escudo: " + personaje.getEscudo());
                    lblAtaque.setText("Ataque: " + personaje.getAtaque());
                    lblCadencia.setText("Cadencia: " + personaje.getCadencia());
                    lblVM.setText("Vel. de Mov.: " + personaje.getVelocidadMov());
                    lblRV.setText("Regen de vida: " + personaje.getRegenVida());
                    lblDistA.setText("Distancia de ataque: " + personaje.getDistancia_atq());
                } catch (Exception e) {

                }
            }
        });

        JLabel fondo = new JLabel("");
        fondo.setIcon(new ImageIcon(CatalogoPersonajes.class.getResource("/resources/fondo2.png")));
        fondo.setBounds(0, 0, 1100, 510);
        contentPane.add(fondo);

    }
}
