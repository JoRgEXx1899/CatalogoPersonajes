


public class FabricaConcretaOrcos extends FabricaAbstractaPersonaje {

	@Override
	PersonajeAbstracto getPersonaje(int ref) {
		
		return new Orcos(ref);
	}

}

