/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsomaabprocedural;

/**
 *
 * @author Guilherme
 */
public class SomaAB {
     //Definir atributos
    private double a;
    private double b;
    
    //Construtores
    public SomaAB(){
        a = 0.0;
        b = 0.0;
    }
    public SomaAB(double x, double y)
    {
        a = x;
        b = y; 
    }
    
    //Getters e Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    
    public void setB(double b) {
        this.b = b;
    }
    
    //Definir Metodos
    public void somaAB()
    {
        
        System.out.println("Soma OO: A + B:"+(a+b));
                
    }
   
}
    

