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
    public void atacaArribaX() {
        Incremento = personaje.getIncremento();
        int mxA  = (Incremento % 6) * 64;
        personaje.setAtacaArribaX(mxA);
        System.out.println("ATACANDO ARRIBA X");
    }

    @Override
    public void atacaArribaY() {
        Incremento = personaje.getIncremento();
        int myA = (Incremento / 6) * 52;
        personaje.setAtacaArribaY(myA);
    }

    @Override
    public void atacaAbajoX() {
    }

    @Override
    public void atacaAbajoY() {
    }

    @Override
    public void atacaIzquierdaX() { 
    }

    @Override
    public void atacaIzquierdaY() {
    }

    @Override
    public void atacaDerechaX() {
        Incremento = personaje.getIncremento();
        int mxA = (Incremento % 6) * 64;
        personaje.setAtacaDerechaX(mxA);
    }

    @Override
    public void atacaDerechaY() {
        Incremento = personaje.getIncremento();
        int myA = (Incremento / 6) * 52;
        personaje.setAtacaDerechaY(myA);
    }
    
}
