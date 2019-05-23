
import armaduras.ArmaduraAbstracta;
import armas.ArmaAbstracta;
import personajes.PersonajeAbstracto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANIEL
 */
public class Director {

    private PersonajeBuilder personajeBuilder;

    public void personajeBuilder(PersonajeBuilder pb) {
        personajeBuilder = pb;
    }
    public void construirPersonaje(ArmaAbstracta arma,ArmaduraAbstracta armadura){ 
       personajeBuilder.fabricarNuevoPersonaje(); 
       
       personajeBuilder.construirArma(arma);
       personajeBuilder.construirArmadura(armadura);
   }
    public PersonajeAbstracto getPersonaje() { 
       return personajeBuilder.getPersonaje();
   }
}
