
import armaduras.ArmaduraAbstracta;
import armas.ArmaAbstracta;
import personajes.FabricaConcretaGuerreros;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANIEL
 */
public class PjHumanoBuilder extends PersonajeBuilder {
        
    @Override
    public void fabricarNuevoPersonaje() {
        super.fabrica=new FabricaConcretaGuerreros();
        super.personaje = fabrica.getPersonaje();
    }
    
    @Override
    public void construirArma(ArmaAbstracta arma) {
        super.personaje.setArma(arma);
    }
    
    @Override
    public void construirArmadura(ArmaduraAbstracta arma) {
        super.personaje.setArmadura(arma);
    }
    
}

