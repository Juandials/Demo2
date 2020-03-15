/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colisiones;

/**
 *
 * @author judil
 */
public abstract class Personaje {
    private String ataque;
    public Personaje(String ataque){
        this.ataque=ataque;
    }
    public String getataque(){
        return ataque;
    }
    public abstract String Descripcion();
}
