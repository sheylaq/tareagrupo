/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo5;

import helpers.Farmacia;
import helpers.Laboratorio;

/**
 *
 * @author user
 */
public class Modulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Farmacia farmacia = new Farmacia();
        Laboratorio laboratorio = new Laboratorio();
                  System.out.println("------------------------------\n");
                  System.out.println("          Laboratorio\n");
                  laboratorio.info();
                 System.out.println("Direccion: "+ laboratorio.direccion());

                   System.out.println("------------------------------\n");
                  System.out.println("          Farmacia\n");
                   farmacia.info();
                   System.out.println("Direccion: "+ farmacia.direccion());
                   System.out.println("------------------------------\n");

    }
    
}
