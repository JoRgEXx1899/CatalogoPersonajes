package personajes;




public class FabricaConcretaEnanos extends FabricaAbstractaPersonaje {

    @Override
	PersonajeAbstracto getPersonaje(int ref) {
		return new Enanos(ref);
	
	}
    
}



