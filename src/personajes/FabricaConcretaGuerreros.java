package personajes;




public class FabricaConcretaGuerreros extends FabricaAbstractaPersonaje {



	@Override
	PersonajeAbstracto getPersonaje(int ref) {
		return new Guerrero(ref);
	
	}

}
