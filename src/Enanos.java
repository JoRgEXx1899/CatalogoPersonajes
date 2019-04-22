
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Enanos extends PersonajeAbstracto {

    public Enanos(int ref) {
        super(ref);

        if (ref == 1) {
            setEspecialidad("Sacerdote");
            setVida("950");
            setEscudo("130");
            setAtaque("140");
            setVelocidad("460");
            setClase("Enanos");
            setArma("Baston Sangrado");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/baculo.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/tunica4.png")));
        }

        if (ref == 2) {
            setEspecialidad("Paladin");
            setVida("1150");
            setEscudo("140");
            setAtaque("150");
            setVelocidad("410");
            setClase("Enanos");
            setArma("Espadon");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/espadon.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho5.png")));
        }
        if (ref == 3) {
            setEspecialidad("Ballestero");
            setVida("1200");
            setEscudo("135");
            setAtaque("155");
            setVelocidad("420");
            setClase("Enanos");
            setArma("Ballesta");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/ballesta.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho7.png")));
        }
        if (ref == 4) {
            setEspecialidad("Elemental");
            setVida("1250");
            setEscudo("145");
            setAtaque("145");
            setVelocidad("425");
            setClase("Enanos");
            setArma("Báculo");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/bastsar.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho10.png")));
            
        }

        if (ref == 5) {
            setEspecialidad("Luchador");
            setVida("1250");
            setEscudo("145");
            setAtaque("145");
            setVelocidad("425");
            setClase("Enanos");
            setArma("Manoplas");
            setarma1(new ImageIcon(tipo.class.getResource("/resources/armas/manoplas.png")));
            setarmadura(new ImageIcon(tipo.class.getResource("/resources/armaduras/pecho/pecho9.png")));
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
