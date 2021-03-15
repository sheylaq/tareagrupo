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
    private String color, nombre;
    private String dimensiones; 
    int npisos;
    
    
    public Hospital(){
      
    }
    
    public void establecerColor(String color){
        this.color=color;
    }
     public void establecerNombre(String nombre){
        this.nombre=nombre;
    }
    
      public void establecerDimensiones(String dimensiones){
        this.dimensiones=dimensiones;
    }
       public void establecernpisos(int npisos){
        this.npisos=npisos;
    }
    
       public void info(){
       System.out.println("Nombre: "+ nombre +"\n");
       System.out.println("Color: "+ color +"\n");
       System.out.println("Dimensiones: "+ dimensiones +"\n");
        System.out.println("Pisos: "+ npisos +"\n");
       }
    
    abstract String direccion();
    
}
