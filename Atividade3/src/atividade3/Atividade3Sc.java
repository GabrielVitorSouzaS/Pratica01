/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade3;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Atividade3Sc {
    public static void Sc(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
  float dolar, valor, real;
  
  System.out.print("Quantos dolares voce possui?\n");
  dolar = leitor.nextFloat();
  
  System.out.print("Qual a cotação do dolar?\n");
   valor = leitor.nextFloat();
  
 real = dolar/valor;

System.out.println("A quantidade de Reais em Dolar que você possui é: R$" + real + ",00" ); 
System.exit(0);
  
    
}
}