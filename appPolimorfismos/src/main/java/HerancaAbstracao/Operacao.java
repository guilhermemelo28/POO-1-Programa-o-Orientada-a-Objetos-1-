/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerancaAbstracao;

/**
 *
 * @author sdc.daniel
 */
public abstract class Operacao {
    protected Double valorA;
    protected Double valorB;
    
    public Operacao(){
        valorA=0.0;
        valorB=0.0;
    }
    
    public Operacao(Double valorA, Double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
    }
    
    public abstract Double resultado();  
    
    public void teste(){
        System.out.println("Viu não fui herdado!");
    }
    
}
