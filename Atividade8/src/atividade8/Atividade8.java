/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade8;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        
        //Atributos
        
        float caleng, calema;
        
        //Calculos
        
            float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual o seu peso atual? "));
            caleng = (peso*15)/100 + (peso);
            calema = (peso) - (peso*25)/100;
        
        //Resultado
        
        mensagem.append("Seu peso atual é: ")
                    .append(peso)
                    .append("\nCaso voce emagreça 25%, seu peso seria: ")
                    .append(calema).append("\n Mas caso voce engorde 15%, seu peso seria: ")
                    .append(caleng);
        
            JOptionPane.showMessageDialog(null, mensagem);
        
         System.exit(0);
    }
    
}
