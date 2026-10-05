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
public class EmpregadoHorista extends Empregado {

    private Integer nHoras;
    private Double precoH;
    
    public EmpregadoHorista(){
        super();
        nHoras = 0;
        precoH = 0.0;
    }

    public Integer getnHoras() {
        return nHoras;
    }

    public void setnHoras(Integer nHoras) {
        this.nHoras = nHoras;
    }

    public Double getPrecoH() {
        return precoH;
    }

    public void setPrecoH(Double precoH) {
        this.precoH = precoH;
    }

    public void inserirDadosHorista(){
        input = new Scanner(System.in);
        super.inserirDadosEmpregados();
        System.out.print("Digite o número de horas:");
        nHoras = input.nextInt();
        System.out.print("Digite preço da horas:");
        precoH = input.nextDouble();
    }
    
    public Double sLH(){
        return nHoras*precoH*0.85;
    }
}
