/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade4;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade4Sc {
        public static void Sc(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
  int salario, calculo;
  
  System.out.print("Qual o seu salario atualmente?\n");
  salario = leitor.nextInt();
  
 calculo = (salario*25)/100 + (salario);
 System.out.println("O seu novo salário é: R$" + calculo + ",00");
 System.exit(0);
 
}
}
