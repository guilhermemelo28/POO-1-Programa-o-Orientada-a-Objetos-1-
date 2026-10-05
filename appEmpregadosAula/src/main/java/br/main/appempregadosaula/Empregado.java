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
public class Empregado {
    protected String nome;
    protected String cpf;
    protected String endereco;
    protected Scanner input;
    
    public Empregado(){
        nome = "";
        cpf = "";
        endereco = "";
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
        input = new Scanner(System.in);
        System.out.print("Digite o nome:");
        nome = input.next();
        System.out.print("Digite o CPF:");
        cpf = input.next();
        System.out.print("Digite o endereço:");
        endereco = input.next();
    }
    
    
}
