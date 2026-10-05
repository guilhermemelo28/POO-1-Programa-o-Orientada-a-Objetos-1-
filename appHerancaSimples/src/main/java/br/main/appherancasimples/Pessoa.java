/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.main.appherancasimples;

import java.util.Scanner;

/**
 *
 * @author sdc.daniel
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
    
    public Pessoa(String x, String y, String z){
        nome = x;
        cpf = y;
        dataNasc = z;
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

    public void imprimePessoa(){
        System.out.println("Nome:"+nome+" CPF:"+cpf+" Data Nasc:"+dataNasc);
    }
    
    public void lerDados(){
        //Para ler dados via console vcs tem que instanciar
        //um objeto da Classe Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o nome:");
        nome = entrada.next();
        System.out.print("Digite o CPF:");
        cpf = entrada.next();
        System.out.print("Digite a data de nascimento:");
        dataNasc = entrada.next();
    }
}
