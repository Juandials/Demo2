package animacion;
//CLASE DIRECTOR
public class Animacion {
    private PersonajeBuilder personajeBuilder;

    public void moverse() {
        personajeBuilder.crearNuevoPersonaje();
        personajeBuilder.arriba();
        personajeBuilder.abajo();
        personajeBuilder.derecha();
        personajeBuilder.izquierda();
        personajeBuilder.atacaArriba();
        personajeBuilder.atacaAbajo();
        personajeBuilder.atacaDerecha();
        personajeBuilder.atacaIzquierda();
        personajeBuilder.spriteMoverX();
        personajeBuilder.spriteMoverY();
        personajeBuilder.numSpritesMov();
        personajeBuilder.spriteAtacaArribaX();
        personajeBuilder.spriteAtacaArribaY();
        personajeBuilder.numSpritesAtaque();
        personajeBuilder.spriteAtacaAbajoX();
        personajeBuilder.spriteAtacaAbajoY();
        personajeBuilder.spriteAtacaIzquierdaX();
        personajeBuilder.spriteAtacaIzquierdaY();
        personajeBuilder.spriteAtacaDerechaX();
        personajeBuilder.spriteAtacaDerechaY();
        personajeBuilder.incxArribaUno();
        personajeBuilder.incyArribaUno();
        personajeBuilder.incxArribaDos();
        personajeBuilder.incyArribaDos();
        personajeBuilder.incxAbajoUno();
        personajeBuilder.incyAbajoUno();
        personajeBuilder.incxAbajoDos();
        personajeBuilder.incyAbajoDos();
        personajeBuilder.incxDerechaUno();
        personajeBuilder.incyDerechaUno();
        personajeBuilder.incxDerechaDos();
        personajeBuilder.incyDerechaDos();
        personajeBuilder.incxIzquierdaUno();
        personajeBuilder.incyIzquierdaUno();
        personajeBuilder.incxIzquierdaDos();
        personajeBuilder.incyIzquierdaDos();
    }
    
    
    
    public void SetPersonajeBuilder(PersonajeBuilder pb){
        personajeBuilder = pb;
    }
    
    public Personaje getPersonaje(){
        return personajeBuilder.getPersonaje();
    }
}
