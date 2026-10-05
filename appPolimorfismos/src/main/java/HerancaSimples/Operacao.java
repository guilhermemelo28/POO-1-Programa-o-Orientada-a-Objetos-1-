/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerancaSimples;

/**
 *
 * @author sdc.daniel
 */
public class Operacao {
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
    
    public Double resultado(){
        return valorA + 2.5*valorB;
    }
    
}
