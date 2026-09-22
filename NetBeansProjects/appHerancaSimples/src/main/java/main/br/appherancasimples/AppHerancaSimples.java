/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.br.appherancasimples;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Guilherme
 */
public class AppHerancaSimples {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.LerDados();
        p1.imprimePessoa();
        
        Aluno a1 = new Aluno();
        a1.LerDados();
        a1.setMatricula(322521008);
        a1.imprimeAluno();
        
        Professor prof1 = new Professor();
        prof1.LerDados();
        prof1.setDisciplina("POO");
        prof1.setSalario(100.50);
        prof1.imprimeProfessor();
        
        Funcionario func1 = new Funcionario();
        func1.LerDados();
        func1.setCargo("Chefe"); 
        func1.setSalario(20.10);
        func1.setDataAdmissao("22/09/2026"); 
        func1.imprimeFuncionario();
        
  
    }
}
