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
public class Humano extends Personaje{
    public Humano (String ataque){
        super(ataque);
    }    
    public String Descripcion(){
        return "Humano";
    }
}
