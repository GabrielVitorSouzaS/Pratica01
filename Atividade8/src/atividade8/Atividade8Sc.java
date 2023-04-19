/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade8;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade8Sc {
              public static void Sc(String[] args) {
    
  Scanner leitor = new Scanner(System.in);
  float peso, emagrece, engorda;
  
  System.out.print("Qual o seu peso?\n");
  peso = leitor.nextFloat();

engorda = (peso*15)/100 + (peso);
emagrece = (peso) - (peso*25)/100;
              
 System.out.println("Seu peso atual é:  " + peso + "\n Caso voce emagrecesse 25%, seria: " + emagrece + "\n e caso engordasse 15%, seria " + engorda);             
 System.exit(0);
 
              }
}              
