
import armas.ArmaAbstracta;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class PersonajeAbstracto {

    String especialidad;
    int vida;
    int escudo;
    int ataque;
    double cadencia;
    double velocidadMov;
    double regenVida;
    double distancia_atq;
    String clase;
    ArmaAbstracta Arma;            //
    ImageIcon arma1;        //
    ImageIcon armadura;

    abstract void setEspecialidad(String nuevaEspecialidad);

    abstract void setVida(int nuevaVida);

    abstract void setEscudo(int nuevoEscudo);

    abstract void setAtaque(int nuevoAtaque);

    abstract void setCadencia(double cadencia);

    abstract void setVelocidadMov(double nuevaVelocidad);
    
    abstract void setregenVida(double regenvida);

    abstract void setDistancia_ataque(double distancia_ataque);

    abstract void setClase(String nuevaClase);

    abstract void setArma(ArmaAbstracta nuevaArma);

    abstract void setarma1(ImageIcon nuevaarma1);

    abstract void setarmadura(ImageIcon nuevaarmadura);

    

    public PersonajeAbstracto(int ref) {

    }

}
