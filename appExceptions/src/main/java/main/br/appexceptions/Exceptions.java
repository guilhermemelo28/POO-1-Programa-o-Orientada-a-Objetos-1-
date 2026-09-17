/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.br.appexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class Exceptions {
    public void exemploExcecao(){
    
    int numer[] = {4, 8, 16, 32, 65, 128,256};
    int denom[] = {2, 0 , 4 ,4 ,0 ,8};
    
    for(int i = 0; i < numer.length; i++)
        {
          try{
              System.out.println(numer[i]+ "/"+ denom[i] + 
              "eh" + numer[i] / denom[i]);
              
            }
          catch(ArithmeticException ex){
              System.out.println("Erro ao dividir por zero!");
            }
          catch(ArrayIndexOutOfBoundsException ex){
              System.out.println("Posicao do vetor inexistente!");
          }
          
        }
       
    }
        
    public void throws01() throws Exception{
        //try {
            System.out.println("Inicio Metodo 1");
            //Chamando metodo 2 para gerar ENCADEAMENTO
            throws02();
        //} catch (Exception ex) {
            //System.out.println("Erro de formato de dado");
        //}
        
        System.out.println("Fim do metodo 1");
    }
    
    public void throws02() throws Exception{
        System.out.println("Inicio metodo 2");
        Integer idade = 0;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite"
        + "uma idade:"));
        System.out.println("Idade informada:"   +idade);
        System.out.println("Fim Metodo 2");
        
    }
    
    public void lerarquivoTXT(){
            BufferedReader reader = null;
        try {
            String file = "fileTest.txt";
            reader = new BufferedReader (new FileReader (file));
            String currentLine = reader.readLine();
            System.out.println("Dados:"+currentLine);
                    
        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo nao encontrado");
        } catch (IOException ex) {
            System.out.println("Erro ao acessar o arquivo");
        }
        finally{
            if(reader != null)
            {
                try {
                    reader.close();
                } catch (IOException ex) {
                    System.out.println("Erro ao fechar o arquivo");
                }
            }
        }
        
        
            
    }
}
