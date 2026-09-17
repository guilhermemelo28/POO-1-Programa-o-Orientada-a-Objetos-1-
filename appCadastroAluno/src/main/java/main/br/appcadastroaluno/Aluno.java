/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appcadastroaluno;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Aluno {
    
    //Atributos
    private String nome;
    private String matricula;
    private Double p1;
    private Double p2;
    private Double p3;
    
    //Construtores
    public Aluno(){
        nome ="";
        matricula ="";
        p1 = 0.0;
        p2 = 0.0;
        p3 = 0.0;
        
    }
    
    public Aluno (String nome, String matricula, Double p1, Double p2, Double p3){
        this.nome = nome;
        this.matricula = matricula;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    public Double getP3() {
        return p3;
    }

    
    public void setP3(Double p3) {
        this.p3 = p3;
    }
    
    //Metodos
    
    public void AlunoCadastro(){
        nome = JOptionPane.showInputDialog("Digite"
        + "o nome:");
        matricula = JOptionPane.showInputDialog("Digite"
        + "a matricula:");
        
        
        p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite"
        + "a nota da P1:"));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite"
        + "a nota da P2:"));
        p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite"
        + "a nota da P3:"));
        
        Media(p1,p2,p3);
        
    }
    
    public void Media(Double p1, Double p2, Double p3)
    {
        try{
            if(p1 < 0 || p2 < 0 || p3 < 0)
            {   
                throw new IllegalArgumentException("Nota invalida");
            }
        
            double media = (p1+p2+p3)/3;
            Aprovacao(media,nome,matricula);
            
        }catch(IllegalArgumentException e){
            
            
            System.out.println("Erro ao calcular media " + e.getMessage());   
        }
        
        
    }
    
    public void Aprovacao(Double media,String nome, String matricula){
        
        if(media >= 6)
        {
            System.out.println("O aluno: "+nome +" matricula: " +matricula + " foi aprovado! " );
        }
        else{
        System.out.println("O aluno: "+nome +" matricula: " +matricula  + " foi reprovado! " );
        }
        
        System.out.println("A media do aluno foi de: "+media);
    
    }
}
