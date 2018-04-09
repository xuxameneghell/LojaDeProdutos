/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;
import br.com.satc.enums.LojaSapato;
import br.com.satc.objeto.Produtos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luana.159917
 */
public class LojaProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 JOptionPane.showInputDialog("Mostre a lista de sapatos");
   ArrayList<Produtos> produtos = new ArrayList<>();
   for(LojaSapato produto : LojaSapato.values()){
   produtos.add(new Produtos(produto.getNome(), produto.getDescricao(), produto.getStatus(), produto.getValor(), produto.getId()));
   
 }
    }
}
       
    