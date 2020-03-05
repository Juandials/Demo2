package animacion;
//CONCRETE BUILDER
public class HumanoBuilder extends PersonajeBuilder{
    int mxA, myA;
    public HumanoBuilder() {
    }

    @Override
    public void arriba() {
        personaje.setArriba("/assets/Humano_arriba.png");
    }

    @Override
    public void abajo() {
        personaje.setAbajo("/assets/Humano_abajo.png");
    }

    @Override
    public void derecha() {
        personaje.setDerecha("/assets/Humano_derecha.png");
    }

    @Override
    public void izquierda() {
        personaje.setIzquierda("/assets/Humano_izquierda.png");
    }

    @Override
    public void atacaArriba() {
        personaje.setAtacaArriba("/assets/Humano_ataca_arriba.png");
    }

    @Override
    public void atacaAbajo() {
        personaje.setAtacaAbajo("/assets/Humano_ataca_abajo.png");
    }

    @Override
    public void atacaDerecha() {
        personaje.setAtacaDerecha("/assets/Humano_ataca_derecha.png");
    }

    @Override
    public void atacaIzquierda() {
        personaje.setAtacaIzquierda("/assets/Humano_ataca_izquierda.png");
    }

    @Override
    public void atacaArribaX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacaArribaY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacaAbajoX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacaAbajoY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacaIzquierdaX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacaIzquierdaY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacaDerechaX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacaDerechaY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
