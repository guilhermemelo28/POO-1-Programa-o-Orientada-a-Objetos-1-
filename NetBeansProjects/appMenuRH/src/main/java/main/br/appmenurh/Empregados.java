/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appmenurh;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Empregados {
    
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected Scanner input;
   
    public Empregados(){
        nome = "";
        cpf = "";
        endereco = "";
        this.input = new Scanner(System.in);
        
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    

    public void inserirDadosEmpregados(){
   
        System.out.println("Digite seu nome: " + (nome = input.next()));
       
        System.out.println("Digite seu cpf: " + (cpf = input.next()));
       
         System.out.println("Digite seu endereco: " +(endereco = input.next()) );
        
        
    }
}
