/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appherancasimples;

/**
 *
 * @author Guilherme
 */
public class Funcionario extends Pessoa {

    
    private Double salario;
    private String dataAdmissao;
    private String cargo;
    
    public Funcionario(){
        super("","","");
        salario = 0.0;
        dataAdmissao = "";
        cargo = "";
    }
    
    public Funcionario(String nome,String cpf, String datanasc, String cargo, 
            Double salario, String dataAdmissao){
        super(nome,cpf,datanasc);
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void imprimeFuncionario(){
        super.imprimePessoa();
        System.out.println("Cargo: " + cargo + " Salario: " + salario + " Data Admissao: " + dataAdmissao);
    }
    
}
 