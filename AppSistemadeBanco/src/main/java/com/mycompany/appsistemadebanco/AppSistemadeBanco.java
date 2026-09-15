/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appsistemadebanco;

/**
 *
 * @author Guilherme
 */
public class AppSistemadeBanco {

    public static void main(String[] args) {
        
        ContaBancaria Teste = new ContaBancaria("Guilherme",400);
       
        Teste.consultasaldo1();
        Teste.Depositar(100.00);
        Teste.Sacar(50.00);
        Teste.consultasaldo();
        
        
    }
}
