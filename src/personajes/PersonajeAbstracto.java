package personajes;


import armaduras.ArmaduraAbstracta;
import armas.ArmaAbstracta;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class PersonajeAbstracto {

    int vida;
    int escudo;
    int ataque;
    double cadencia;
    double velocidadMov;
    double regenVida;
    double distancia_atq;
    
    ArmaAbstracta arma;            //
    ArmaduraAbstracta armadura;
    

    abstract void setVida(int nuevaVida);

    abstract void setEscudo(int nuevoEscudo);

    abstract void setAtaque(int nuevoAtaque);

    abstract void setCadencia(double cadencia);

    abstract void setVelocidadMov(double nuevaVelocidad);
    
    abstract void setregenVida(double regenvida);

    abstract void setDistancia_ataque(double distancia_ataque);

    abstract void setArma(ArmaAbstracta arma);

    abstract void setArmadura(ArmaduraAbstracta armadura);

    

    public PersonajeAbstracto(int ref) {

    }

}
