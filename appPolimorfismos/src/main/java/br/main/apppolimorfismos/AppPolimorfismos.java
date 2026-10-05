/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.main.apppolimorfismos;

import HerancaAbstracao.Operacao;
import HerancaAbstracao.Subtracao;

/**
 *
 * @author sdc.daniel
 */
public class AppPolimorfismos {

    public static void main(String[] args) {
        Operacao calcular = new Subtracao(5.9,12.23);
        System.out.println("Resultado:"+calcular.resultado());
        
        //Soma calcular02 = new Soma(5.9,12.23);
        //System.out.println("Resultado:"+calcular02.resultado());

    }
}
