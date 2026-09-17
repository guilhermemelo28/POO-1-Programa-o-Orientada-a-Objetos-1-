/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.br.appvetor2d;

import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class AppVetor2D {

    public static void main(String[] args)
{
    double x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o x do primeiro vetor:"));
    double y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o y do primeiro vetor:"));
    double x2 = Double.parseDouble( JOptionPane.showInputDialog("Digite o x do segundo vetor:"));
    double y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o y do segundo vetor:"));
        Vetor2D vet1 = new Vetor2D(x1, y1);
        Vetor2D vet2 = new Vetor2D(x2, y2);   
        Vetor2D vet3 = new Vetor2D();
        vet3 = vet1.projecao(vet2);
        
        System.out.println("O produto escalar entre os vetores eh de: "+(vet1.prodescalar(vet2)));
        System.out.println("O modulo do vet1 eh:  "+vet1.modulo());
        System.out.println("O modulo do vet2 eh:  "+vet2.modulo());
        System.out.println("O angulo entre os vetores eh de: "+vet1.angulodoisvet(vet2));
        System.out.println("O vetor projecao eh de: ( "+ vet3.getX() +"," + vet3.getY() +  " )");
        
    }
}
