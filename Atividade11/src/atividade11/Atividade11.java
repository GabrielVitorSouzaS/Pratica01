/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade11;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        
        int tab1, tab2, tab3, tab4, tab5, tab6, tab7, tab8, tab9, tab10;
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número para fazermos a tabuada"));
        
        tab1 = numero * 1;
        tab2 = numero * 2;
        tab3 = numero * 3;
        tab4 = numero * 4;
        tab5 = numero * 5;
        tab6 = numero * 6;
        tab7 = numero * 7;
        tab8 = numero * 8;
        tab9 = numero * 9;
        tab10 = numero * 10;
        
        mensagem.append("A sua tabuada com o número " + numero + " ficam assim: \n" + numero + " x 1 = " + tab1 + "\n" + numero + " x 2 = " + tab2 + "\n" + numero + " x 3 = " + tab3 + "\n" + numero + " x 4 = " + tab4 + "\n" + numero + " x 5 = " + tab5 + "\n" + numero + " x 6 = " + tab6 + "\n" + numero + " x 7 = " + tab7 + "\n" + numero + " x 8 = " + tab8 + "\n" + numero + " x 9 = " + tab9 + "\n" + numero + " x 10 = " + tab10 + "\n" );
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
