package animacion;
//ABSTRACT BUILDER
public abstract class PersonajeBuilder{
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
    public abstract void spriteMoverX();
    public abstract void spriteMoverY();
    public abstract void numSpritesMov();
    public abstract void spriteAtacaArribaX();
    public abstract void spriteAtacaArribaY();
    public abstract void numSpritesAtaque();
    public abstract void spriteAtacaAbajoX();
    public abstract void spriteAtacaAbajoY();
    public abstract void spriteAtacaIzquierdaX();
    public abstract void spriteAtacaIzquierdaY();
    public abstract void spriteAtacaDerechaX();
    public abstract void spriteAtacaDerechaY();
    public abstract void incxArribaUno();
    public abstract void incyArribaUno();
    public abstract void incxArribaDos();
    public abstract void incyArribaDos();
    public abstract void incxAbajoUno();
    public abstract void incyAbajoUno();
    public abstract void incxAbajoDos();
    public abstract void incyAbajoDos();
    public abstract void incxDerechaUno();
    public abstract void incyDerechaUno();
    public abstract void incxDerechaDos();
    public abstract void incyDerechaDos();
    public abstract void incxIzquierdaUno();
    public abstract void incyIzquierdaUno();
    public abstract void incxIzquierdaDos();
    public abstract void incyIzquierdaDos();
}
