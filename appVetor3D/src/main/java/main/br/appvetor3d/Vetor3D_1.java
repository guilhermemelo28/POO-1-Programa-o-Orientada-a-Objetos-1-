/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appvetor2d;

/**
 *
 * @author guimelo
 */
public class Vetor3D extends Vetor2D {

    
    private Double z;
    
    public Vetor3D(){
        super();
        z = 0.0;
    }
    
    public Vetor3D(Double x, Double y, Double z){
        super(x,y);
        this.z = z;
    }
    
    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }
    
    public double moduloVetor3D(){
        double modulo = Math.sqrt((getX() * getX()) + (getY() * getY()) + (this.z * this.z));
        return modulo;
    }
    
    public double prodescalar(Vetor3D segund){
        return ((getX() * segund.getX()) + (getY() * segund.getY()) + (this.z * segund.z)) ;
    }
    
}
