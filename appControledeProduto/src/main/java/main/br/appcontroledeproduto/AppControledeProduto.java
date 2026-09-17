/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.br.appcontroledeproduto;

/**
 *
 * @author Guilherme
 */
public class AppControledeProduto {

    public static void main(String[] args) {
      Produto produt1 = new Produto();
      produt1.Consulta();
      produt1.AddEstoque();
      produt1.RemoveEstoque();
      produt1.Consulta2();
    }
}
