
import armaduras.ArmaduraAbstracta;
import armas.ArmaAbstracta;
import personajes.FabricaAbstractaPersonaje;
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
public abstract class PersonajeBuilder {

    protected PersonajeAbstracto personaje;
    protected FabricaAbstractaPersonaje fabrica;

    public abstract void fabricarNuevoPersonaje();

    
    public abstract void construirArma(ArmaAbstracta arma);
    public abstract void construirArmadura(ArmaduraAbstracta arma);
    
    public PersonajeAbstracto getPersonaje() { 
        return personaje; 
    }
}
