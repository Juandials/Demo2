package animacion;
//CONCRETE BUILDER
public class ElfoBuilder extends PersonajeBuilder {
    int Incremento;
    int mxA,myA;
    public ElfoBuilder() {
    }

    @Override
    public void arriba() {
        personaje.setArriba("/assets/Elfo_arriba.png");
    }

    @Override
    public void abajo() {
        personaje.setAbajo("/assets/Elfo_abajo.png");
    }

    @Override
    public void derecha() {
        personaje.setDerecha("/assets/Elfo_derecha.png");
    }

    @Override
    public void izquierda() {
        personaje.setIzquierda("/assets/Elfo_izquierda.png");
    }

    @Override
    public void atacaArriba() {
        personaje.setAtacaArriba("/assets/Elfo_ataca_arriba.png");
    }

    @Override
    public void atacaAbajo() {
        personaje.setAtacaAbajo("/assets/Elfo_ataca_abajo.png");
    }

    @Override
    public void atacaDerecha() {
        personaje.setAtacaDerecha("/assets/Elfo_ataca_derecha.png");
    }

    @Override
    public void atacaIzquierda() {
        personaje.setAtacaIzquierda("/assets/Elfo_ataca_izquierda.png");
    }

    @Override
    public int atacaArribaX() {
        Incremento = personaje.getIncremento();
        personaje.setAtacaArribaX(mxA = (Incremento % 6) * 64);
        return mxA;
    }

    @Override
    public int atacaArribaY() {
        Incremento = personaje.getIncremento();
        personaje.setAtacaArribaX(myA = (Incremento / 6) * 52);
        return myA;
    }

    @Override
    public int atacaAbajoX() {
        return 0;
    }

    @Override
    public int atacaAbajoY() {
        return 0;
    }

    @Override
    public int atacaIzquierdaX() { 
        return 0;
    }

    @Override
    public int atacaIzquierdaY() {
        return 0;
    }

    @Override
    public int atacaDerechaX() {
        Incremento = personaje.getIncremento();
        personaje.setAtacaDerechaX(mxA = (Incremento % 6) * 64);
        return mxA;
    }

    @Override
    public int atacaDerechaY() {
        Incremento = personaje.getIncremento();
        personaje.setAtacaDerechaX(myA = (Incremento / 6) * 52);
        return myA;
    }
    
}
