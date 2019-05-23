/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personajes;

import armaduras.ArmaduraAbstracta;
import armas.ArmaAbstracta;

/**
 *
 * @author Brayan
 */
public class AdaptadorPersonaje extends PersonajeAbstracto {

    @Override
    public void setArmadura(ArmaduraAbstracta armadura1) {
        super.setArmadura(armadura1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setArma(ArmaAbstracta arma1) {
        super.setArma(arma1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArmaduraAbstracta getArmadura() {
        return super.getArmadura(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArmaAbstracta getArma() {
        return super.getArma(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getDistancia_atq() {
        return super.getDistancia_atq(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getRegenVida() {
        return super.getRegenVida(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getVelocidadMov() {
        return super.getVelocidadMov(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCadencia() {
        return super.getCadencia(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAtaque() {
        return super.getAtaque(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEscudo() {
        return super.getEscudo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getVida() {
        return super.getVida(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRaza() {
        return super.getRaza(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setVida(int nuevaVida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEscudo(int nuevoEscudo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAtaque(int nuevoAtaque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCadencia(double cadencia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
     public void setVelocidadMov(double nuevaVelocidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setregenVida(double regenvida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDistancia_ataque(double distancia_ataque) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRaza(String raza) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
