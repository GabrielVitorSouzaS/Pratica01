/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade11;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade11Sc {
               public static void Sc(String[] args) {
    
  Scanner leitor = new Scanner(System.in);
  int numero, tab1, tab2, tab3, tab4, tab5, tab6, tab7, tab8, tab9, tab10;
  
  System.out.print("Escreva um numero de 1 a 10 para fazermos sua tabuada?\n");
  numero = leitor.nextInt();  
    
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
  
 System.out.println("A sua tabuada com o número " + numero + " ficam assim: \n" + numero + " x 1 = " + tab1 + "\n" + numero + " x 2 = " + tab2 + "\n" + numero + " x 3 = " + tab3 + "\n" + numero + " x 4 = " + tab4 + "\n" + numero + " x 5 = " + tab5 + "\n" + numero + " x 6 = " + tab6 + "\n" + numero + " x 7 = " + tab7 + "\n" + numero + " x 8 = " + tab8 + "\n" + numero + " x 9 = " + tab9 + "\n" + numero + " x 10 = " + tab10 + "\n");
System.exit(0);
  
           }
}
