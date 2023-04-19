/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade6;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        
        double calculo;
        final double x = 1.8;
        
        double celsius = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor em celsius \n"));
        
        calculo = (celsius * x) + 32;
        
        mensagem.append("O valor de " + celsius + "°C em Fahrenheit é: " + calculo + "°F");
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
        
    }
    
}
