/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder mensagem = new StringBuilder();
        StringBuilder mensagem2 = new StringBuilder();
        int calculo;
        
        mensagem.append("Bem vindo\n Iremos calcular o seu novo salário :D");
        JOptionPane.showMessageDialog(null, mensagem);
        int salario = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do seu salário atualmente\n")); 
         
       calculo = (salario*25)/100 + (salario);
       mensagem2.append("O seu novo salário é R$" + calculo + ",00 :D");
       JOptionPane.showMessageDialog(null,  mensagem2);
       System.exit(0);
        
    }
    
}
