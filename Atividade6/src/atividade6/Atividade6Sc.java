/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade6;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade6Sc {
    
      public static void Sc(String[] args) {
    
  Scanner leitor = new Scanner(System.in);
  double celsius, x, f;
  
  System.out.print("Qual a temperatura em °C?\n");
  celsius = leitor.nextFloat();  
 x = 1.8;
 f = (celsius * x) + 32;
 
 System.out.println("O valor de " + celsius + "°C em Fahrenheit é: " + f + "°F");
 System.exit(0); 
}
}
