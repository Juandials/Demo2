package animacion;
//CONCRETE BUILDER

public class ElfoBuilder extends PersonajeBuilder{

    public ElfoBuilder() {
    }

    @Override
    public void arriba() {
        personaje.setArriba("/assets/sprites_elfo/Elfo_arriba.png");
    }

    @Override
    public void abajo() {
        personaje.setAbajo("/assets/sprites_elfo/Elfo_abajo.png");
    }

    @Override
    public void derecha() {
        personaje.setDerecha("/assets/sprites_elfo/Elfo_derecha.png");
    }

    @Override
    public void izquierda() {
        personaje.setIzquierda("/assets/sprites_elfo/Elfo_izquierda.png");
    }

    @Override
    public void atacaArriba() {
        personaje.setAtacaArriba("/assets/sprites_elfo/Elfo_ataca_arriba.png");
    }

    @Override
    public void atacaAbajo() {
        personaje.setAtacaAbajo("/assets/sprites_elfo/Elfo_ataca_abajo.png");
    }

    @Override
    public void atacaDerecha() {
        personaje.setAtacaDerecha("/assets/sprites_elfo/Elfo_ataca_derecha.png");
    }

    @Override
    public void atacaIzquierda() {
        personaje.setAtacaIzquierda("/assets/sprites_elfo/Elfo_ataca_izquierda.png");
    }

    @Override
    public void spriteMoverX() {
        personaje.setSpriteMoverX(64);
    }

    @Override
    public void spriteMoverY() {
        personaje.setSpriteMoverY(52);
    }

    @Override
    public void numSpritesMov() {
        personaje.setNumSpritesMov(5);
    }

    @Override
    public void spriteAtacaArribaX() {
        personaje.setSpriteAtacaArribaX(64);
    }

    @Override
    public void spriteAtacaArribaY() {
        personaje.setSpriteAtacaArribaY(52);
    }

    @Override
    public void numSpritesAtaque() {
        personaje.setNumSpritesAtaque(6);
    }

    @Override
    public void spriteAtacaAbajoX() {
        personaje.setSpriteAtacaAbajoX(64);
    }

    @Override
    public void spriteAtacaAbajoY() {
        personaje.setSpriteAtacaAbajoY(52);
    }

    @Override
    public void spriteAtacaIzquierdaX() {
        personaje.setSpriteAtacaIzquierdaX(64);
    }

    @Override
    public void spriteAtacaIzquierdaY() {
        personaje.setSpriteAtacaIzquierdaY(52);
    }

    @Override
    public void spriteAtacaDerechaX() {
        personaje.setSpriteAtacaDerechaX(64);
    }

    @Override
    public void spriteAtacaDerechaY() {
        personaje.setSpriteAtacaDerechaY(52);
    }

    @Override
    public void incxArribaUno() {
        personaje.setIncxArribaUno(25);
    }

    @Override
    public void incyArribaUno() {
        personaje.setIncyArribaUno(25);
    }

    @Override
    public void incxArribaDos() {
        personaje.setIncxArribaDos(50);
    }

    @Override
    public void incyArribaDos() {
        personaje.setIncyArribaDos(50);
    }

    @Override
    public void incxAbajoUno() {
        personaje.setIncxAbajoUno(25);
    }

    @Override
    public void incyAbajoUno() {
        personaje.setIncyAbajoUno(25);
    }

    @Override
    public void incxAbajoDos() {
        personaje.setIncxAbajoDos(50);
    }

    @Override
    public void incyAbajoDos() {
        personaje.setIncyAbajoDos(50);
    }

    @Override
    public void incxDerechaUno() {
        personaje.setIncxDerechaUno(25);
    }

    @Override
    public void incyDerechaUno() {
        personaje.setIncyDerechaUno(25);
    }

    @Override
    public void incxDerechaDos() {
        personaje.setIncxDerechaDos(50);
    }

    @Override
    public void incyDerechaDos() {
        personaje.setIncyDerechaDos(50);
    }

    @Override
    public void incxIzquierdaUno() {
        personaje.setIncxIzquierdaUno(25);
    }

    @Override
    public void incyIzquierdaUno() {
        personaje.setIncyIzquierdaUno(25);
    }

    @Override
    public void incxIzquierdaDos() {
        personaje.setIncxIzquierdaDos(50);
    }

    @Override
    public void incyIzquierdaDos() {
        personaje.setIncyIzquierdaDos(50);
    }
    
   
}
