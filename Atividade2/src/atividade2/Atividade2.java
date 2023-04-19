/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;
/**
 *
 * @author gabriel
 */
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Atributos
        
       StringBuilder mensagem = new StringBuilder();
 
       int  media;
       
       //Usando metodos
       
       Calculos cq = new Calculos();
            
            int n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o primerio numero"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o segundo numero"));
            int n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o terceiro numero"));
            
            cq.setN1(n1);
            cq.setN2(n2);
            cq.setN3(n3);
            media = cq.CalculaMed();  
       

            mensagem.append("O valor da sua média é: " + media);
            JOptionPane.showMessageDialog(null, mensagem);
            
            System.out.print("");
            
           
                    System.exit(0);

   }
        
       
        
   }
    
