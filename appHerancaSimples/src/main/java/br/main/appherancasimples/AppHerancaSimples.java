/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.main.appherancasimples;

/**
 *
 * @author sdc.daniel
 */
public class AppHerancaSimples {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Daniel","04304405616","11/05/80",1138299);
        a1.imprimeAluno();
        
        Funcionario f1 = new Funcionario();
        f1.lerDados();
        f1.setCargo("Diretor");
        f1.setSalario(15.000);
        f1.setDataAdmissao("01/01/2026");
        f1.imprimeFuncionario();
    }
}
