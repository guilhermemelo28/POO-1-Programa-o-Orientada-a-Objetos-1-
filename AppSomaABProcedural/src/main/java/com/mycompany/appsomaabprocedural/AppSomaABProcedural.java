/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appsomaabprocedural;

/**
 *
 * @author Guilherme
 */
public class AppSomaABProcedural {
    
    public static void main(String[] args) {
        //Procedural:
        somaAB(5.5,2.79);
        
        //Orientada a Objeto:
        SomaAB soma = new SomaAB(3.33,3.33);
        
        soma.somaAB();
    }

    private static void somaAB(double par, double par1) {
     //Procedural
     System.out.println("Soma procedural A + B ="+(par+par1));
     
            }
}
