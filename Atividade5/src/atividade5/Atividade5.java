/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade5;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder mensagem = new StringBuilder();
        StringBuilder mensagem2 = new StringBuilder();
        
        int area;
        
        mensagem.append("Bem vindo\n Iremos calcular a AREA de um losango");
        JOptionPane.showMessageDialog(null, mensagem);
        int dmaior = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sera o valor da diagonal maior?\n"));
        int dmenor = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual sera o valor da diagonal menor?\n"));
        
        area = (dmaior * dmenor)/2;
        
        mensagem2.append("O valor da area do seu losango é: "+ area);
        JOptionPane.showMessageDialog(null, mensagem2);
        System.exit(0);
    }
    
}
