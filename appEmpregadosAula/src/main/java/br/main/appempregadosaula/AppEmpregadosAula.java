/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.main.appempregadosaula;

import java.util.Scanner;

/**
 *
 * @author sdc.daniel
 */
public class AppEmpregadosAula {
   
    Empregado empregados[] = new Empregado[10];
    Integer index = 0;

    public static void main(String[] args) {
        Integer opcao=0;
        Scanner dados = new Scanner(System.in);
        AppEmpregadosAula operacao = new AppEmpregadosAula();
        
        do{
            System.out.println("Bem vindo ao Menu de Contabilidade "
                    + "e Recursos Humanos");
            System.out.println("[1]-Cadastrar Empregado CLT");
            System.out.println("[2]-CAdastrar Empregado Horista");
            System.out.println("[3]-Imprimir relatório de Empregados");
            System.out.println("[4]-Sair");
            System.out.print("Digite uma opção:");
            opcao = dados.nextInt();
            
            switch (opcao) {
                case 1:
                    operacao.inserirCLT();
                    break;
                case 2:
                    operacao.inserirHorista();
                    break;
                case 3:
                    operacao.imprimirEmpregados();
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }while(opcao!=4);
        
    }
   private void inserirCLT() {
        EmpregadoCLT temp = new EmpregadoCLT();
        temp.inserirDadosCLT();
        empregados[index]=temp;
        index++;
    }

    private void inserirHorista() {
        EmpregadoHorista temp = new EmpregadoHorista();
        temp.inserirDadosHorista();
        empregados[index]=temp;
        index++;
    }

    private void imprimirEmpregados() {

        for(Integer pos=0;pos<index;pos++){
            System.out.println("Nome:"+empregados[pos].getNome());
            System.out.println("CPF:"+empregados[pos].getCpf());
            System.out.println("Endereço:"+empregados[pos].getEndereco());
            //Para as demais informaçoes temos que verificar qual é o tipo
            //de objeto na posição da lista;
            //Verificando se a posição é CLT
            if(empregados[pos] instanceof EmpregadoCLT){
                EmpregadoCLT temp =  (EmpregadoCLT)(empregados[pos]);
                System.out.println("Salario bruto:"+temp.getsBrutoCLT());
                System.out.println("Salario líquido:"+temp.sLCLT());
            }
            //verificando se é horista
            if(empregados[pos] instanceof EmpregadoHorista){
                EmpregadoHorista temp = (EmpregadoHorista)(empregados[pos]);
                System.out.println("Número de horas:"+temp.getnHoras());
                System.out.println("Preço de horas:"+temp.getPrecoH());
                System.out.println("Salário líquido:"+temp.sLH());
            }
                
            
        }
    }
 
    
}
