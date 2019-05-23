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
    String raza;
    
    ArmaAbstracta arma;            //
    ArmaduraAbstracta armadura;

    public String getRaza() {
        return raza;
    }

    public int getVida() {
        return vida;
    }

    public int getEscudo() {
        return escudo;
    }

    public int getAtaque() {
        return ataque;
    }

    public double getCadencia() {
        return cadencia;
    }

    public double getVelocidadMov() {
        return velocidadMov;
    }

    public double getRegenVida() {
        return regenVida;
    }

    public double getDistancia_atq() {
        return distancia_atq;
    }

    public ArmaAbstracta getArma() {
        return arma;
    }

    public ArmaduraAbstracta getArmadura() {
        return armadura;
    }
    
    
    public abstract void setVida(int nuevaVida);

    public abstract void setEscudo(int nuevoEscudo);

    public abstract void setAtaque(int nuevoAtaque);

    public abstract void setCadencia(double cadencia);

    public abstract void setVelocidadMov(double nuevaVelocidad);
    
    public abstract void setregenVida(double regenvida);

    public abstract void setDistancia_ataque(double distancia_ataque);

    public void setArma(ArmaAbstracta arma1){
        this.arma=arma1;
        ataque=ataque+arma.getAtaque();
        cadencia+=arma.getCadencia();
        velocidadMov=velocidadMov*arma.getVelocidadMov();
        distancia_atq+=arma.getDistancia_atq();
        regenVida*=arma.getRegenVida();
    }

    public void setArmadura(ArmaduraAbstracta armadura1){
        this.armadura=armadura1;
        vida+=armadura.getVida();
        escudo+=armadura.getEscudo();
        velocidadMov*=armadura.getVelocidadMov();
        regenVida+=armadura.getRegenVida();
    }

    public abstract void setRaza(String raza);

    public PersonajeAbstracto() {

    }

}
