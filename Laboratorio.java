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
public class Laboratorio  extends Hospital{
public Laboratorio(){
    establecerColor("Blanco ");
    establecernpisos(1);
    establecerDimensiones("30mx40m");
    establecerNombre("Paseo Tres Caminos");
}
    @Override
    public String direccion() {
     return "Barrio Las Jaguas";
    }
    
}
