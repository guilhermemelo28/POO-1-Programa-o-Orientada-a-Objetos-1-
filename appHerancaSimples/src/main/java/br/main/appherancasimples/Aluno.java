/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.main.appherancasimples;

/**
 *
 * @author sdc.daniel
 */
public class Aluno extends Pessoa{
    private Integer matricula;
    
    public Aluno(){
        super("","","");
        matricula = 0;
    }
    
    public Aluno(String x, String y, String z, Integer w){
        super(x,y,z);
        matricula = w;     
    }
    
    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }    
    
    public void imprimeAluno(){
        super.imprimePessoa();
        System.out.println("Matrícula:"+matricula);
    }
}
