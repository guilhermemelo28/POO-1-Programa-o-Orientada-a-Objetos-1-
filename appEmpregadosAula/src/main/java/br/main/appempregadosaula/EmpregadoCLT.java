/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.main.appempregadosaula;

import java.util.Scanner;

/**
 *
 * @author sdc.daniel
 */
public class EmpregadoCLT extends Empregado{
    private Double sBrutoCLT;

    public EmpregadoCLT(){
        super();
        sBrutoCLT=0.0;
    }
    
    public Double getsBrutoCLT() {
        return sBrutoCLT;
    }

    public void setsBrutoCLT(Double sBrutoCLT) {
        this.sBrutoCLT = sBrutoCLT;
    }
        
    public void inserirDadosCLT(){
        input = new Scanner(System.in);
        super.inserirDadosEmpregados();
        System.out.print("Digite o salario bruto:");
        sBrutoCLT = input.nextDouble();       
    }
    
    public Double sLCLT(){
        if(sBrutoCLT<=5000)
            return sBrutoCLT*0.85;
        else
            return sBrutoCLT*0.725;
    }
}
