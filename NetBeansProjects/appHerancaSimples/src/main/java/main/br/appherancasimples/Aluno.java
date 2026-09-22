/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appherancasimples;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Aluno extends Pessoa{

    
    private Integer matricula;
    
    public Aluno(){
       super("","","");
       matricula = 0;
    }
    
    public Aluno(String nome, String cpf, String datanasc, Integer matricula){
        super(nome,cpf,datanasc);
        this.matricula = matricula;
    }
    public Aluno(Integer matricula){
        this.matricula = matricula;
    }
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    
     public void imprimeAluno(){
        super.imprimePessoa();
         System.out.println(" Matricula: " +matricula);
        
     }
}

    

    
    

