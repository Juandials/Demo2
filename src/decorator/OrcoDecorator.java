package decorator;

import animacion.Personaje;

public class OrcoDecorator extends PersonajeDecorator{
    
    public OrcoDecorator(Personaje personaje) {
        super(personaje);
    }
    
    public String getArriba() {
        return getPersonaje().getArriba().replaceAll("arriba", "abajo");
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
        return getPersonaje().getAbajo();
    }

    public String getAtacaArriba() {
        return getPersonaje().getAtacaArriba();
    }
    
}
