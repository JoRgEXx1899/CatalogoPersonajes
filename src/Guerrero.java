
import java.awt.Image;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Guerrero extends PersonajeAbstracto {

    public Guerrero(int ref) {
        super(ref);

        if (ref == 1) {
            setEspecialidad("Guerero");
            setVida("1300");
            setEscudo("180");
            setAtaque("110");
            setVelocidad("420");
            setClase("Humanos");
            setArma("Espada 2 Manos");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/2manos.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho1.png")));
              
        }

        if (ref == 2) {
            setEspecialidad("Caballero");
            setVida("1150");
            setEscudo("150");
            setAtaque("180");
            setVelocidad("430");
            setClase("Humanos");
            setArma("Doble Espada");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/espaada.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho2.png")));
        }
        if (ref == 3) {
            setEspecialidad("Templario");
            setVida("1500");
            setEscudo("240");
            setAtaque("85");
            setVelocidad("400");
            setClase("Humanos");
            setArma("Espada y Escudo");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/espadayescudo.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho4.png")));
        }
        if (ref == 4) {
            setEspecialidad("Mago");
            setVida("1400");
            setEscudo("150");
            setAtaque("200");
            setVelocidad("410");
            setClase("Humanos");
            setArma("Bastón");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/baculo2.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/tunica2.png")));
        }
        if (ref == 5) {
            setEspecialidad("Arquero");
            setVida("1000");
            setEscudo("100");
            setAtaque("230");
            setVelocidad("450");
            setClase("Humanos");
            setArma("Arco");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/arco.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho3.png")));
        }

    }

    @Override
    void setEspecialidad(String nuevaEspecialidad) {
        Especialidad = nuevaEspecialidad;
    }

    @Override
    void setVida(String nuevaVida) {
        Vida = nuevaVida;
    }

    @Override
    void setEscudo(String nuevoEscudo) {
        Escudo = nuevoEscudo;
    }

    @Override
    void setAtaque(String nuevoAtaque) {
        Ataque = nuevoAtaque;
    }

    @Override
    void setVelocidad(String nuevoVelocidad) {
        Velocidad = nuevoVelocidad;
    }

    @Override
    void setClase(String nuevaClase) {
        Clase = nuevaClase;
    }

    
     @Override
    void setArma(String nuevaArma) {
       Arma = nuevaArma;
    }

     @Override
    void setarma1(ImageIcon nuevaarma1) {
        arma1 = nuevaarma1;
    }
    
    @Override
    void setarmadura(ImageIcon nuevaarmadura) {
        armadura = nuevaarmadura;
    }
   

 }
