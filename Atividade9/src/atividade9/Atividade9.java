/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade9;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StringBuilder mensagem = new StringBuilder();
        
        double cal1, cal2, hipo, hipo2;
        
        double cat1 = Double.parseDouble(JOptionPane.showInputDialog(null, "QUal o valor do cateto 1? \n"));
        double cat2 = Double.parseDouble(JOptionPane.showInputDialog(null, "QUal o valor do cateto 2? \n"));
        
        cal1 = cat1*cat1;
        cal2 = cat2*cat2;
        hipo = cal1+cal2;
        Double RaizQuadrada = Math.sqrt(hipo);
        
        
        mensagem.append("O valor dos catetos inseridos são: " + cat1 + ", " + cat2 + " \no calculo fica assim: \n a" + "²" + "=" + cat1 + "²" + "+" + cat2 + "² , sendo assim, o resultado sera: " + RaizQuadrada);
        JOptionPane.showMessageDialog(null, mensagem);
        System.exit(0);
                
    }
    
}
