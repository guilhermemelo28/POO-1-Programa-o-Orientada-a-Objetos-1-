/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appsistemadebanco;

/**
 *
 * @author Guilherme
 */
public class ContaBancaria {

    //Definir Atributos
    private Integer numconta;
    private String  titular;
    private Double  saldo = 100.00;
    private Double novosaldo = saldo;
    
    //Definir Construtores
   
    //Construtor sem parametro
    public ContaBancaria (){
        numconta = 0;
        titular = "";
        saldo = 0.0;
        novosaldo = 0.0;
    }
    //COnstrutor com parametro
    public ContaBancaria (String nomedono, Integer nmrcont)
    {
        this.numconta = nmrcont;
        this.titular = nomedono;
        
    }
    //Getters e Setters
    public Integer getNumconta() {
        return numconta;
    }

    public void setNumconta(Integer numconta) {
        this.numconta = numconta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
    public void consultasaldo1()
    {
        
        if(numconta >= 0)
        {
        System.out.println("Nome: "+titular);
        System.out.println("NumConta: "+numconta);
        System.out.println("Saldo: R$ "+novosaldo);
        }
        else{
            System.out.println("Nao existe esse num de conta");
        }
    }
    
    
    public void Depositar(double valorDeposito)
    {
        if(valorDeposito >= 0 && numconta >= 0)
        {
            novosaldo +=  valorDeposito;
            System.out.println("Apos o deposito o novo saldo eh de: R$"+novosaldo);   
        }
    }
    
    public void Sacar(double valorSacar)
    {
        if(valorSacar <= novosaldo && numconta >= 0)
        {
            novosaldo -=  valorSacar;
            System.out.println("Apos o saque novo saldo eh de: R$"+novosaldo);
        }
    
    }
    
    public void consultasaldo()
    {
        
        if(numconta >= 0)
        {
        System.out.println("Nome: "+titular);
        System.out.println("NumConta: "+numconta);
        System.out.println("Saldo: R$ "+novosaldo);
        }
        else{
            System.out.println("Nao existe esse num de conta");
        }
    }
}