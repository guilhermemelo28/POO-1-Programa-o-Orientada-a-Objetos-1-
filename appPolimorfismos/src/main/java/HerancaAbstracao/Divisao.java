/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerancaAbstracao;

/**
 *
 * @author sdc.daniel
 */
public class Divisao extends Operacao{
    public Divisao(){
        super();
    }
    
    public Divisao(Double a, Double b){
        super(a,b);
    }
    
    @Override
    public Double resultado() {
        return valorA/valorB;
    }
    
}
