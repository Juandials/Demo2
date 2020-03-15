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
public class AtaqueEspada extends Personaje{
    private Personaje personaje;
    public AtaqueEspada (Personaje personaje, String ataqueextra){
        super(ataqueextra);
        this.personaje=personaje;
    }    
    public String Descripcion(){
        return personaje.Descripcion() + " ataque con espada";
    }
    public String getataque(){
        return personaje.getataque() + super.getataque();
    }
}
