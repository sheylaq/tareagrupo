/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author user
 */
public class Farmacia extends Hospital {
 public Farmacia(){
    establecerColor("Cafe");
    establecernpisos(3);
    establecerDimensiones("34mx43m");
    establecerNombre("Farmaceutica Villa Cristi");
}
    @Override
    public String direccion() {
        return "Colonia Villa Cristiana";
        } 

}
