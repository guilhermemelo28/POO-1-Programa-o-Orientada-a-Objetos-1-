/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.apptempo;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class Tempo {

    
    private Integer horas;
    private Integer minutos;
    private Integer segundos;
    
    public Tempo(){
        horas = 0;
        minutos = 0;
        segundos = 0;
        
    }
    public Tempo(Integer horas, Integer minutos, Integer segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
        
    }
    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getSegundos() {
        return segundos;
    }

    public void setSegundos(Integer segundos) {
        this.segundos = segundos;
    }
    
    public void inserirTemp(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite as horas: ");
        horas = entrada.nextInt();
        System.out.println("Digite os minutos: ");
        minutos = entrada.nextInt();
        System.out.println("Digite os segundoss: ");
        segundos = entrada.nextInt();
    }
    
    public void imprimeHoras(){
        System.out.println(horas + " : " + minutos + " : " + segundos);
    }
    
    public Tempo adicao (Tempo t1){
        int hresultado = this.horas + t1.horas;
        int mresultado = this.minutos + t1.minutos;
        int segresultado = this.segundos + t1.segundos;
        
        return new Tempo(hresultado,mresultado,segresultado); 
    }
    
      public Tempo sub (Tempo t1){
        int hresultado = Math.abs(this.horas - t1.horas);
        int mresultado = Math.abs(this.minutos - t1.minutos);
        int segresultado = Math.abs(this.segundos - t1.segundos);
        
        return new Tempo(hresultado,mresultado,segresultado); 
      }
    
}
