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
public class AtaqueEscudo extends Personaje{
    private Personaje personaje;
    public AtaqueEscudo (Personaje personaje, String ataqueextra){
        super(ataqueextra);
    }    
    public String Descripcion(){
        return personaje.Descripcion() + " ataque con escudo";
    }
    public String getataque(){
        return personaje.getataque() + super.getataque();
    }
}
