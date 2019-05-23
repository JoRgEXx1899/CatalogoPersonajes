package personajes;

import armaduras.ArmaduraAbstracta;
import armas.ArmaAbstracta;
import java.awt.Image;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Guerrero extends PersonajeAbstracto {

    public Guerrero() {
        super();
        
        setVida(1200);
        setEscudo(0);
        setAtaque(110);
        setCadencia(0);
        setVelocidadMov(420);
        setregenVida(0);
        setDistancia_ataque(0);
        setRaza("humano");
    }

    @Override
    public void setVida(int nuevaVida) {
        this.vida=nuevaVida;        
    }

    @Override
    public void setEscudo(int nuevoEscudo) {
        this.escudo=nuevoEscudo;
         
    }

    @Override
    public void setAtaque(int nuevoAtaque) {
        this.ataque=nuevoAtaque;
    }

    @Override
    public void setCadencia(double cadencia) {
        this.cadencia=cadencia;
    }

    @Override
    public void setVelocidadMov(double nuevaVelocidad) {
        this.velocidadMov=nuevaVelocidad;
    }

    @Override
    public void setregenVida(double regenvida) {
        this.regenVida=regenvida;
    }

    @Override
    public void setDistancia_ataque(double distancia_ataque) {
        this.distancia_atq=distancia_ataque;
    }

    

    
    @Override
    public void setRaza(String raza) {
        this.raza=raza;
    }


}
