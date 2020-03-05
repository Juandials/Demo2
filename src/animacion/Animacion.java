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
    }
    
    public void atacar(){
        //personajeBuilder.getPersonaje();
        personajeBuilder.atacaIzquierdaX();        
        personajeBuilder.atacaIzquierdaY();
        personajeBuilder.atacaArribaX();
        personajeBuilder.atacaArribaY();
        personajeBuilder.atacaAbajoX();
        personajeBuilder.atacaAbajoY();
        personajeBuilder.atacaDerechaX();
        personajeBuilder.atacaDerechaY();
    }
    public void SetPersonajeBuilder(PersonajeBuilder pb){
        personajeBuilder = pb;
    }
    
    public Personaje getPersonaje(){
        return personajeBuilder.getPersonaje();
    }
}
