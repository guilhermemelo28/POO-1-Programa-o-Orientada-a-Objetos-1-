/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appvetor2d;

/**
 *
 * @author Guilherme
 */
public class Vetor2D {

     //Atributos
    private double x;
    private double y;
    
    
    
    //Construtores
    public  Vetor2D(){
        x = 0.0;
        y = 0.0;
    }
    
    public  Vetor2D(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    
    
    //Getters e Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

   
    public void setY(double y) {
        this.y = y;
    }
    
    //Metodos
    
    public double prodescalar(Vetor2D segund){
        return this.x * segund.x + this.y * segund.y;
    }
    
    public double modulo(){
        double modulo = Math.sqrt((this.x * this.x) + (this.y * this.y));
        return modulo;
    }
    
    public double angulodoisvet(Vetor2D segundo){
            double prod = prodescalar(segundo);
            double modulo1 = modulo();
            double modulo2 = segundo.modulo();
            
            if(modulo1 == 0 || modulo2 == 0)
            {
                throw new IllegalArgumentException("Nao eh possivel calcular o angulo com um vetor nulo! ;(");
            }
            double result = prod/(modulo1*modulo2);
            double angulo = Math.acos(result);
            return angulo;
    }
    
    
    public Vetor2D projecao(Vetor2D segundo){
        
        double px = (prodescalar(segundo)/(segundo.modulo()* segundo.modulo())) * segundo.x;
        double py = (prodescalar(segundo)/(segundo.modulo()* segundo.modulo())) * segundo.y;
        return  new Vetor2D(px,py);
    }
    
}
