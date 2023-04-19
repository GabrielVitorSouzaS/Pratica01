/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade7;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        StringBuilder mensagem2 = new StringBuilder();
        
        int calculo;
        
        int salariom = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor de um salário minimo hoje?"));
        int salariof = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o valor do seu salario?"));
        
        calculo = salariof / salariom;
        mensagem.append("A quantidade de salarios minimos que cabem no seu salario atual é: " + calculo);
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
    }
    
}
