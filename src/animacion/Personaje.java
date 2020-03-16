package animacion;
//CLASE PRODUCTO

import prototype.ClonPersonaje;

public class Personaje implements ClonPersonaje{
    private String arriba = "";
    private String abajo = "";
    private String izquierda = "";
    private String derecha = "";
    private String atacaArriba = "";
    private String atacaAbajo = "";
    private String atacaDerecha = "";
    private String atacaIzquierda = "";
    private int spriteMoverX;
    private int spriteMoverY;
    private int numSpritesMov;
    private int spriteAtacaArribaX;
    private int spriteAtacaArribaY;
    private int numSpritesAtaque;
    private int spriteAtacaAbajoX;
    private int spriteAtacaAbajoY;
    private int spriteAtacaIzquierdaX;
    private int spriteAtacaIzquierdaY;
    private int spriteAtacaDerechaX;
    private int spriteAtacaDerechaY;
    private int incxArribaUno;
    private int incyArribaUno;
    private int incxArribaDos;
    private int incyArribaDos;
    private int incxAbajoUno;
    private int incyAbajoUno;
    private int incxAbajoDos;
    private int incyAbajoDos;
    private int incxDerechaUno;
    private int incyDerechaUno;
    private int incxDerechaDos;
    private int incyDerechaDos;
    private int incxIzquierdaUno;
    private int incyIzquierdaUno;
    private int incxIzquierdaDos;
    private int incyIzquierdaDos;

    public Personaje() {
    }

    public int getIncxArribaUno() {
        return incxArribaUno;
    }

    public int getIncxAbajoUno() {
        return incxAbajoUno;
    }

    public void setIncxAbajoUno(int incxAbajoUno) {
        this.incxAbajoUno = incxAbajoUno;
    }

    public int getIncyAbajoUno() {
        return incyAbajoUno;
    }

    public void setIncyAbajoUno(int incyAbajoUno) {
        this.incyAbajoUno = incyAbajoUno;
    }

    public int getIncxAbajoDos() {
        return incxAbajoDos;
    }

    public void setIncxAbajoDos(int incxAbajoDos) {
        this.incxAbajoDos = incxAbajoDos;
    }

    public int getIncyAbajoDos() {
        return incyAbajoDos;
    }

    public void setIncyAbajoDos(int incyAbajoDos) {
        this.incyAbajoDos = incyAbajoDos;
    }

    public int getIncxDerechaUno() {
        return incxDerechaUno;
    }

    public void setIncxDerechaUno(int incxDerechaUno) {
        this.incxDerechaUno = incxDerechaUno;
    }

    public int getIncyDerechaUno() {
        return incyDerechaUno;
    }

    public void setIncyDerechaUno(int incyDerechaUno) {
        this.incyDerechaUno = incyDerechaUno;
    }

    public int getIncxDerechaDos() {
        return incxDerechaDos;
    }

    public void setIncxDerechaDos(int incxDerechaDos) {
        this.incxDerechaDos = incxDerechaDos;
    }

    public int getIncyDerechaDos() {
        return incyDerechaDos;
    }

    public void setIncyDerechaDos(int incyDerechaDos) {
        this.incyDerechaDos = incyDerechaDos;
    }

    public int getIncxIzquierdaUno() {
        return incxIzquierdaUno;
    }

    public void setIncxIzquierdaUno(int incxIzquierdaUno) {
        this.incxIzquierdaUno = incxIzquierdaUno;
    }

    public int getIncyIzquierdaUno() {
        return incyIzquierdaUno;
    }

    public void setIncyIzquierdaUno(int incyIzquierdaUno) {
        this.incyIzquierdaUno = incyIzquierdaUno;
    }

    public int getIncxIzquierdaDos() {
        return incxIzquierdaDos;
    }

    public void setIncxIzquierdaDos(int incxIzquierdaDos) {
        this.incxIzquierdaDos = incxIzquierdaDos;
    }

    public int getIncyIzquierdaDos() {
        return incyIzquierdaDos;
    }

    public void setIncyIzquierdaDos(int incyIzquierdaDos) {
        this.incyIzquierdaDos = incyIzquierdaDos;
    }

    public void setIncxArribaUno(int incxArribaUno) {
        this.incxArribaUno = incxArribaUno;
    }

    public int getIncyArribaUno() {
        return incyArribaUno;
    }

    public void setIncyArribaUno(int incyArribaUno) {
        this.incyArribaUno = incyArribaUno;
    }

    public int getIncxArribaDos() {
        return incxArribaDos;
    }

    public void setIncxArribaDos(int incxArribaDos) {
        this.incxArribaDos = incxArribaDos;
    }

    public int getIncyArribaDos() {
        return incyArribaDos;
    }

    public void setIncyArribaDos(int incyArribaDos) {
        this.incyArribaDos = incyArribaDos;
    }

    public int getSpriteAtacaAbajoX() {
        return spriteAtacaAbajoX;
    }

    public void setSpriteAtacaAbajoX(int spriteAtacaAbajoX) {
        this.spriteAtacaAbajoX = spriteAtacaAbajoX;
    }

    public int getSpriteAtacaAbajoY() {
        return spriteAtacaAbajoY;
    }

    public void setSpriteAtacaAbajoY(int spriteAtacaAbajoY) {
        this.spriteAtacaAbajoY = spriteAtacaAbajoY;
    }

    public int getSpriteAtacaIzquierdaX() {
        return spriteAtacaIzquierdaX;
    }

    public void setSpriteAtacaIzquierdaX(int spriteAtacaIzquierdaX) {
        this.spriteAtacaIzquierdaX = spriteAtacaIzquierdaX;
    }

    public int getSpriteAtacaIzquierdaY() {
        return spriteAtacaIzquierdaY;
    }

    public void setSpriteAtacaIzquierdaY(int spriteAtacaIzquierdaY) {
        this.spriteAtacaIzquierdaY = spriteAtacaIzquierdaY;
    }

    public int getSpriteAtacaDerechaX() {
        return spriteAtacaDerechaX;
    }

    public void setSpriteAtacaDerechaX(int spriteAtacaDerechaX) {
        this.spriteAtacaDerechaX = spriteAtacaDerechaX;
    }

    public int getSpriteAtacaDerechaY() {
        return spriteAtacaDerechaY;
    }

    public void setSpriteAtacaDerechaY(int spriteAtacaDerechaY) {
        this.spriteAtacaDerechaY = spriteAtacaDerechaY;
    }

    public int getNumSpritesAtaque() {
        return numSpritesAtaque;
    }

    public void setNumSpritesAtaque(int numSpritesAtaque) {
        this.numSpritesAtaque = numSpritesAtaque;
    }

    public int getSpriteAtacaArribaX() {
        return spriteAtacaArribaX;
    }

    public void setSpriteAtacaArribaX(int spriteAtacaArribaX) {
        this.spriteAtacaArribaX = spriteAtacaArribaX;
    }

    public int getSpriteAtacaArribaY() {
        return spriteAtacaArribaY;
    }

    public void setSpriteAtacaArribaY(int spriteAtacaArribaY) {
        this.spriteAtacaArribaY = spriteAtacaArribaY;
    }

    public int getNumSpritesMov() {
        return numSpritesMov;
    }

    public void setNumSpritesMov(int numSpritesMov) {
        this.numSpritesMov = numSpritesMov;
    }

    public int getSpriteMoverX() {
        return spriteMoverX;
    }

    public void setSpriteMoverX(int spriteMoverX) {
        this.spriteMoverX = spriteMoverX;
    }

    public int getSpriteMoverY() {
        return spriteMoverY;
    }

    public void setSpriteMoverY(int spriteMoverY) {
        this.spriteMoverY = spriteMoverY;
    }
    
    public String getAtacaArriba() {
        return atacaArriba;
    }

    public void setAtacaArriba(String atacaArriba) {
        this.atacaArriba = atacaArriba;
    }

    public String getAtacaAbajo() {
        return atacaAbajo;
    }

    public void setAtacaAbajo(String atacaAbajo) {
        this.atacaAbajo = atacaAbajo;
    }

    public String getAtacaDerecha() {
        return atacaDerecha;
    }

    public void setAtacaDerecha(String atacaDerecha) {
        this.atacaDerecha = atacaDerecha;
    }

    public String getAtacaIzquierda() {
        return atacaIzquierda;
    }

    public void setAtacaIzquierda(String atacaIzquierda) {
        this.atacaIzquierda = atacaIzquierda;
    }
    
    public String getArriba() {
        return arriba;
    }

    public void setArriba(String arriba) {
        this.arriba = arriba;
    }

    public String getAbajo() {
        return abajo;
    }

    public void setAbajo(String abajo) {
        this.abajo = abajo;
    }

    public String getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(String izquierda) {
        this.izquierda = izquierda;
    }

    public String getDerecha() {
        return derecha;
    }

    public void setDerecha(String derecha) {
        this.derecha = derecha;
    }
    
    @Override
    public ClonPersonaje clonar() {
        Personaje personaje = null;
        try{
            personaje = (Personaje) clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return personaje;
    }

}
