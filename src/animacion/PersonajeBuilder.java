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
    public abstract int atacaArribaX();
    public abstract int atacaArribaY();
    public abstract int atacaAbajoX();
    public abstract int atacaAbajoY();
    public abstract int atacaIzquierdaX();
    public abstract int atacaIzquierdaY();
    public abstract int atacaDerechaX();
    public abstract int atacaDerechaY();
}
