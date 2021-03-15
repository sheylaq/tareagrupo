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
public abstract class Hospital {
    private String color;
    private String dimensiones; 
    int npisos;
    
    
    public Hospital(){
      
    }
    abstract String direccion();
    
}
