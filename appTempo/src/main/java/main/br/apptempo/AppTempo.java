/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.br.apptempo;

/**
 *
 * @author Guilherme
 */
public class AppTempo {

    public static void main(String[] args) {
        Tempo t1 = new Tempo();
        t1.inserirTemp();
        System.out.println("Tempo 1:");
        t1.imprimeHoras();
        
        Tempo t2 = new Tempo();
        t2.inserirTemp();
        System.out.println("Tempo 2:");
        t2.imprimeHoras();
        
        Tempo t3 = new Tempo();
        t3 = t1.adicao(t2);
        System.out.println("Tempo da adicao");    
        t3.imprimeHoras();
        
        Tempo t4 = new Tempo();
        t4 = t1.sub(t2);
        System.out.println("Tempo da subtracao: ");
        t4.imprimeHoras();
    }
}
