
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Orcos extends PersonajeAbstracto {

    public Orcos(int ref) {
        super(ref);

        if (ref == 1) {
            setEspecialidad("Barbaro");
            setVida("950");
            setEscudo("100");
            setAtaque("230");
            setVelocidad("440");
            setClase("Orcos");
            setArma("Mazo");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/mazo.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho12.png")));
        }

        if (ref == 2) {
            setEspecialidad("Cazador");
            setVida("1000");
            setEscudo("85");
            setAtaque("220");
            setVelocidad("430");
            setClase("Orcos");
            setArma("Rifle de caza");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/rifle.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho13.png")));

        }
        if (ref == 3) {
            setEspecialidad("Asesino");
            setVida("1050");
            setEscudo("80");
            setAtaque("300");
            setVelocidad("435");
            setClase("Orcos");
            setArma("Dagas");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/dagas.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho11.png")));
        }

        if (ref == 4) {
            setEspecialidad("Brujo");
            setVida("1050");
            setEscudo("80");
            setAtaque("300");
            setVelocidad("435");
            setClase("Orcos");
            setArma("Orbe");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/orbe.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/tunica5.png")));
        }

        if (ref == 5) {
            setEspecialidad("Chaman");
            setVida("1050");
            setEscudo("80");
            setAtaque("300");
            setVelocidad("435");
            setClase("Orcos");
            setArma("Bastón con calaveras");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/calavera.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/tunica1.png")));
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
