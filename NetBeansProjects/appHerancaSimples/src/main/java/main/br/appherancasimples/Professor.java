/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appherancasimples;

/**
 *
 * @author Guilherme
 */
public class Professor extends Pessoa {

    
       private String disciplina;
       private Double salario;
    
       public Professor(){
       super("","","");
       disciplina = "";
       salario = 0.0;
       }
       
       public Professor(String nome, String cpf, String dataNasc, String disciplina, Double salario){
           super("","","");
           this.disciplina = disciplina;
           this.salario = salario;
           
       }
       
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public void imprimeProfessor(){
        super.imprimePessoa();
        System.out.println(" Disciplina ministrada: " + disciplina + " Salario: " + salario);
    }
}
