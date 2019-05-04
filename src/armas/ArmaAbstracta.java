package armas;

/**
 *
 * @author DANIEL
 */
public abstract class ArmaAbstracta {
    int ataque;
    double cadencia;
    double velocidadMov;
    int distancia_atq;
    double regenVida;

    public abstract void setAtaque(int ataque);

    public abstract void setCadencia(double cadencia);

    public abstract void setVelocidadMov(double velocidadMov);

    public abstract void setDistancia_atq(int distancia_atq);

    public abstract void setRegenVida(double regenVida);
    
    

    public ArmaAbstracta() {
    }
    
}