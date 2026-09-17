/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appcontroledeproduto;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Produto {
    
    //Atributos
   private String nome = JOptionPane.showInputDialog("Digite"
        + " o nome do produto :");
   private Double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite"
        + " quantidade do preco do produto"));;
   private Integer qtdestoque = Integer.parseInt(JOptionPane.showInputDialog("Digite"
        + " quantidade do produto:"));;
   private Integer controlestoque = qtdestoque;
   
   //Construtores
   public void Produto(){
        nome = "";
        preco = 0.0;
        qtdestoque = 0;
   }
   
   public void Produto(String nome, Double preco, Integer qtdestoque){
       this.nome = nome;
       this.preco = preco;
       this.qtdestoque = qtdestoque;
       
   }
   
   //Getters e Setters
   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtdestoque() {
        return qtdestoque;
    }

    
    public void setQtdestoque(Integer qtdestoque) {
        this.qtdestoque = qtdestoque;
    }
    
    //Metodos
    public void Consulta(){
        
 
        System.out.println("Nome do produto:  " + nome + "\nPreco: R$ " + preco +
        " \nQuantidade no estoque: " + qtdestoque);
        

    }
     
    public void AddEstoque(){
        int qtdnova  = Integer.parseInt(JOptionPane.showInputDialog("Digite"
        + " quantidade do produto para adicionar:"));
        
         controlestoque += qtdnova;
        System.out.println("Foram adicionados: "+ qtdnova + " o novo estoque eh de: " + controlestoque);
    }
    
    public void RemoveEstoque(){
        int qtdnovaretira  = Integer.parseInt(JOptionPane.showInputDialog("Digite"
        + "quantidade do produto para retirar:"));
        
         controlestoque -= qtdnovaretira;
        System.out.println(" Foram removidos: "+ qtdnovaretira + " o novo estoque eh de: " + controlestoque);
    }
    
    
    public void Consulta2(){
        
        if(controlestoque >= 0)
        {
            System.out.println("Nome do produto:  " + nome + "\nPreco: R$ " + preco +
            " \nQuantidade no estoque: " + controlestoque);
            ValorTotal(controlestoque);
        }
        else{
            System.out.println(" Estamos com falta do produto ;( ");
        }
    }
    
    public void ValorTotal(Integer controleestoque){
        System.out.println(" Valor do total do estoque: R$" +(preco * controlestoque));
    }
    
}
