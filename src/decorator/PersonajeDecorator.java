package decorator;

import animacion.Personaje;

public abstract class PersonajeDecorator extends Personaje{
    private Personaje personaje;

    public PersonajeDecorator(Personaje personaje) {
        this.personaje = personaje;
    }
    
    public Personaje getPersonaje(){
        return this.personaje;
    }
    public void setPersonaje(Personaje personaje){
        this.personaje = personaje;
    }
    
    public String getArriba() {
        return getPersonaje().getArriba();
    }
    
    public String getAbajo() {
        return getPersonaje().getAbajo();
    }

    public String getIzquierda() {
        return getPersonaje().getIzquierda();
    }

    public String getDerecha() {
        return getPersonaje().getDerecha();
    }

    public String getAtacaIzquierda() {
        return getPersonaje().getAtacaIzquierda();
    }

    public String getAtacaDerecha() {
        return getPersonaje().getAtacaDerecha();
    }

    public String getAtacaAbajo() {
        return getPersonaje().getAtacaAbajo();
    }

    public String getAtacaArriba() {
        return getPersonaje().getAtacaArriba();
    }

    public int getSpriteMoverY() {
        return getPersonaje().getSpriteMoverY();
    }

    public int getSpriteMoverX() {
        return getPersonaje().getSpriteMoverX();
    }

    public int getNumSpritesMov() {
        return getPersonaje().getNumSpritesMov();
    }

    public int getSpriteAtacaArribaY() {
        return getPersonaje().getSpriteAtacaArribaY();
    }

    public int getSpriteAtacaArribaX() {
        return getPersonaje().getSpriteAtacaArribaX();
    }

    public int getNumSpritesAtaque() {
        return getPersonaje().getNumSpritesAtaque();
    }

    public int getSpriteAtacaDerechaY() {
        return getPersonaje().getSpriteAtacaDerechaY();
    }

    public int getSpriteAtacaDerechaX() {
        return getPersonaje().getSpriteAtacaDerechaX();
    }

    public int getSpriteAtacaIzquierdaY() {
        return getPersonaje().getSpriteAtacaIzquierdaY();
    }

    public int getSpriteAtacaIzquierdaX() {
        return getPersonaje().getSpriteAtacaIzquierdaX();
    }

    public int getSpriteAtacaAbajoY() {
        return getPersonaje().getSpriteAtacaAbajoY();
    }

    public int getSpriteAtacaAbajoX() {
        return getPersonaje().getSpriteAtacaAbajoX();
    }

    public int getIncyArribaDos() {
        return getPersonaje().getIncyArribaDos();
    }

    public int getIncxArribaDos() {
        return getPersonaje().getIncxArribaDos();
    }

    public int getIncyArribaUno() {
        return getPersonaje().getIncyArribaUno();
    }

    public int getIncyIzquierdaDos() {
        return getPersonaje().getIncyIzquierdaDos();
    }

    public int getIncxIzquierdaDos() {
        return getPersonaje().getIncxIzquierdaDos();
    }

    public int getIncyIzquierdaUno() {
        return getPersonaje().getIncyIzquierdaUno();
    }

    public int getIncxIzquierdaUno() {
        return getPersonaje().getIncxIzquierdaUno();
    }

    public int getIncyDerechaDos() {
        return getPersonaje().getIncyDerechaDos();
    }

    public int getIncxDerechaDos() {
        return getPersonaje().getIncxDerechaDos();
    }

    public int getIncyDerechaUno() {
        return getPersonaje().getIncyDerechaUno();
    }

    public int getIncxDerechaUno() {
        return getPersonaje().getIncxDerechaUno();
    }

    public int getIncyAbajoDos() {
        return getPersonaje().getIncyAbajoDos();
    }

    public int getIncxAbajoDos() {
        return getPersonaje().getIncxAbajoDos();
    }

    public int getIncyAbajoUno() {
        return getPersonaje().getIncyAbajoUno();
    }

    public int getIncxArribaUno() {
        return getPersonaje().getIncxArribaUno();
    }

    public int getIncxAbajoUno() {
        return getPersonaje().getIncxAbajoUno();
    }
}
