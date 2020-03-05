package animacion;
//ABSTRACT BUILDER
public abstract class PersonajeBuilder {
    protected Personaje personaje;
    
    public Personaje getPersonaje(){
        return personaje;
    }
    
    public void crearNuevoPersonaje(){
        personaje = new Personaje();
    }
    
    public abstract void arriba();
    public abstract void abajo();
    public abstract void derecha();
    public abstract void izquierda();
    public abstract void atacaArriba();
    public abstract void atacaAbajo();
    public abstract void atacaDerecha();
    public abstract void atacaIzquierda();
    public abstract void atacaArribaX();
    public abstract void atacaArribaY();
    public abstract void atacaAbajoX();
    public abstract void atacaAbajoY();
    public abstract void atacaIzquierdaX();
    public abstract void atacaIzquierdaY();
    public abstract void atacaDerechaX();
    public abstract void atacaDerechaY();
}
