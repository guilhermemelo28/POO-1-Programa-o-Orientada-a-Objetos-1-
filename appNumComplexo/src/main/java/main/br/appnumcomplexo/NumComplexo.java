/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appnumcomplexo;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Guilherme
 */
public class NumComplexo {

    //Atributos
    private Double real;
    private Double img;
   
    //Construtores
    public NumComplexo(){
        real = 0.0;
        img = 0.0;
    }
    
    public NumComplexo(Double real, Double img)
    {
        this.real = real;
        this.img = img;
    }
    
    //Getters e Setters
    public Double getReal() {
        return real;
    }

    public void setReal(Double real) {
        this.real = real;
    }

    public Double getImg() {
        return img;
    }

    public void setImg(Double img) {
        this.img = img;
    }
    
    //Metodos
    
    public Double modulo (){
        Double resultado = 0.0;
        resultado = Math.sqrt(Math.pow(real, 2) + Math.pow(img, 2));
        return resultado;
                
    }
    public Double argumento(){
        Double resultado = 0.0;
        resultado = Math.atan(img/real);
        return resultado;
    }
    
    public NumComplexo soma(NumComplexo n2){
        NumComplexo temp = new NumComplexo();
        temp.setReal(this.real + n2.getReal());
        temp.setImg(this.img + n2.getImg());
        return temp;
    }
    
    public NumComplexo subtracao(NumComplexo n2){
        NumComplexo temp = new NumComplexo();
        temp.setReal(this.real - n2.getReal());
        temp.setImg(this.img - n2.getImg());
        return temp;
    }
    
    public void printcomplexo (){
        System.out.println("Real: "+ real + " Imaginario: " +img );
    }
    
}
