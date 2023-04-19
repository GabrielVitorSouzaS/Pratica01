/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade3;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float calculo;
        StringBuilder mensagem = new StringBuilder();
        StringBuilder mensagem2 = new StringBuilder();
        
        mensagem.append("Bem vindo ao corvertor de DOLAR \n");
        JOptionPane.showMessageDialog(null, mensagem);
        float dolar = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do DOLAR atualmente: "));
        float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor que você possui em DOLAR "));
        calculo = valor/dolar;
        mensagem2.append("A quantidade de Reais em Dolar que você possui é: R$" + calculo + ",00");
        JOptionPane.showMessageDialog(null, mensagem2);
        System.exit(0);
        
        
    }
    
}
