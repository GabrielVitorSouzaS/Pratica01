/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade7;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade7Sc {
          public static void Sc(String[] args) {
    
  Scanner leitor = new Scanner(System.in);
  int salariop, salariom, calculo;
  
  System.out.print("Qual o seu salario?\n");
  salariop = leitor.nextInt();

  System.out.print("Qual o seu salario minimo hoje?\n");
  salariom = leitor.nextInt();  
  
 calculo = salariop/salariom;
 
 System.out.println("A quantidade de salarios minimos que cabem no seu salario atual é: " + calculo);
 System.exit(0);         
          }
}
