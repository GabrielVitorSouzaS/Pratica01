/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade5;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade5Sc {
         public static void Sc(String[] args) {
    
  Scanner leitor = new Scanner(System.in);
  int dmaior, dmenor, area;
  
  System.out.print("Qual o valor da diagonal maior?\n");
  dmaior = leitor.nextInt();  
 
  System.out.print("Qual vai ser o valor da diagonal menor?\n");
  dmenor = leitor.nextInt();  
    
  area = (dmaior * dmenor)/2;
  System.out.println("O valor da are é: " + area);
  System.exit(0);
}
}
