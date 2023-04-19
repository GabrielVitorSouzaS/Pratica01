/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade10;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        
        double comprimento, area, volume;
        final double pi = 3.14;
        
        double raio = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o valor do Raio"));
        comprimento = 2*(pi*raio);
        area = pi*(raio*raio);
        volume = (4/3)*pi*(raio*raio*raio);
        
        mensagem.append("O valor do comprimento é: " + comprimento + "\n O valor da área é: " + area + "\n E o valor do volume é: " + volume);
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
