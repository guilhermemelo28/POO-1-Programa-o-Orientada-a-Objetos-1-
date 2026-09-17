/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appnumcomplexo;

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
    
}
