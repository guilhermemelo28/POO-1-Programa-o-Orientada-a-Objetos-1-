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
public class Pessoa {

    
    protected String nome;
    protected String cpf;
    protected String dataNasc;
    
    public Pessoa(){
        nome = "";
        cpf = "";
        dataNasc = "";
    }
    
    public Pessoa(String nome, String cpf, String dataNasc){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public void LerDados(){
        //Para Dados via console: vcs tem que instanciar um objeto da classe Scanner!
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        nome = entrada.next();
        System.out.print(" Digite o cpf: ");
        cpf = entrada.next();
        System.out.print("Digite a data de nascimento : ");
        dataNasc = entrada.next();
        
        
    }
    public void imprimePessoa(){
        System.out.println("Nome: "+ nome + " CPF: "+ cpf + " Data Nascimento: "+dataNasc); 
    }
    
    
}
