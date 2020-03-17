package decorator;

import animacion.Personaje;

public class HumanoDecorator extends PersonajeDecorator{
    
    public HumanoDecorator(Personaje personaje) {
        super(personaje);
    }

    public String getArriba() {
        return getPersonaje().getArriba().replaceAll("arriba", "arribaDecorado");
    }

    public String getAbajo() {
        return getPersonaje().getAbajo().replaceAll("abajo", "abajoDecorado");
    }

    public String getIzquierda() {
        return getPersonaje().getIzquierda().replaceAll("izquierda", "izquierdaDecorado");
    }

    public String getDerecha() {
        return getPersonaje().getDerecha().replaceAll("derecha", "derechaDecorado");
    }

    public String getAtacaIzquierda() {
        return getPersonaje().getAtacaIzquierda().replaceAll("izquierda", "izquierdaDecorado");
    }

    public String getAtacaDerecha() {
        return getPersonaje().getAtacaDerecha().replaceAll("derecha", "derechaDecorado");
    }

    public String getAtacaAbajo() {
        return getPersonaje().getAtacaAbajo().replaceAll("abajo", "abajoDecorado");
    }

    public String getAtacaArriba() {
        return getPersonaje().getAtacaArriba().replaceAll("arriba", "arribaDecorado");
    }
}
