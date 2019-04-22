
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class PersonajeAbstracto {
	
	String Especialidad;
	String Vida;
	String Escudo;
	String Ataque;
        String Velocidad;
        String Clase;
        String Arma;
        ImageIcon arma1;
        ImageIcon armadura;
        
        
	abstract void setEspecialidad(String nuevaEspecialidad);
	abstract void setVida(String nuevaVida);
	abstract void setEscudo(String nuevoEscudo);
	abstract void setAtaque(String nuevoAtaque);
        abstract void setVelocidad(String nuevaVelocidad);
        abstract void setClase(String nuevaClase);
        abstract void setArma(String nuevaArma);
        abstract void setarma1(ImageIcon nuevaarma1);
        abstract void setarmadura(ImageIcon nuevaarmadura);

       public PersonajeAbstracto(int ref){
		
	}

}
