/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armas;

/**
 *
 * @author DANIEL
 */
public class Daga extends ArmaAbstracta{

    public Daga() {
    super();
        setAtaque(140);
        setCadencia(1.4);
        setVelocidadMov(0.99);
        setDistancia_atq(5);
        setRegenVida(0.07);
    }

    
    @Override
    public void setAtaque(int ataque) {
        this.ataque=ataque;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCadencia(double cadencia) {
        this.cadencia = cadencia;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVelocidadMov(double velocidadMov) {
        this.velocidadMov = velocidadMov;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDistancia_atq(int distancia_atq) {
        this.distancia_atq=distancia_atq;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRegenVida(double regenVida) {
        this.regenVida=regenVida;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
