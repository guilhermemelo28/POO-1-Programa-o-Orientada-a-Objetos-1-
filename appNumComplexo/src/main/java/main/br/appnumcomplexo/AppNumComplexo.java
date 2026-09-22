/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.br.appnumcomplexo;

/**
 *
 * @author Guilherme
 */
public class AppNumComplexo {

    public static void main(String[] args) {
        NumComplexo n1 = new NumComplexo ();
        n1.setImg(5.5);
        n1.setReal(5.5);
        n1.printcomplexo();
        System.out.println("Modulo: "+n1.modulo());
        System.out.println("Argumento: "+n1.argumento());
        
        NumComplexo n2 = new NumComplexo (5.5,5.5);
        n2.printcomplexo();
        
        System.out.println("Modulo: "+n2.modulo());
        System.out.println("Argumento: "+n2.argumento());
        
        NumComplexo op1 = new NumComplexo ();
        NumComplexo op2 = new NumComplexo ();
        
        op1 = n1.soma(n2);
        op2 = n1.subtracao(n2);
        
        
        op1.printcomplexo();
        op2.printcomplexo();
    }
}
