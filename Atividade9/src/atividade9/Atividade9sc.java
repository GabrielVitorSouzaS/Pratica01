/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade9;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade9sc {
              public static void Sc(String[] args) {
    
  Scanner leitor = new Scanner(System.in);
  float cat1, cat2, cal1, cal2, hipo;
  
  System.out.print("Qual o valor do cateto 1?\n");
  cat1 = leitor.nextFloat();  
  
System.out.print("Qual o valor do cateto 2?\n");
  cat2 = leitor.nextFloat();    

  
    cal1 = cat1*cat1;
    cal2 = cat2*cat2;
    hipo = cal1+cal2;
    Double RaizQuadrada = Math.sqrt(hipo);

System.out.println("O valor dos catetos inseridos são: " + cat1 + ", " + cat2 + " \no calculo fica assim: \n a" + "²" + "=" + cat1 + "²" + "+" + cat2 + "² , sendo assim, o resultado sera: " + RaizQuadrada);
System.exit(0);
    

}
}