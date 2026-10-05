/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerancaSimples;

/**
 *
 * @author sdc.daniel
 */
public class Soma extends Operacao{
    
    public Soma(){
        super();
    }
    
    public Soma(Double a, Double b){
        super(a,b);
    }
    
    @Override
    public Double resultado(){
        return valorA+valorB;
    }
    
}
