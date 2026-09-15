    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto1;

/**
 *
 * @author Guilherme
 */
public class Projeto1 {

    public static void main(String[] args) {
        
        Cachorro Rex = new Cachorro(16.7,3,"Tom");
        Cachorro Atila = new Cachorro();
        Cachorro Lulu = new Cachorro();
        
        System.out.println("idade:"+Rex.getIdade());
        
        Rex.setIdade(25);
        System.out.println("idade:"+Rex.getIdade());
        
       
            
    }
}
