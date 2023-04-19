/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;
import java.util.Scanner;
/**
 *
 * @author gabriel
 */
public class Atividade1Sc {
    
 public static void Sc(String[] args) {
  
    Scanner leitor = new Scanner(System.in);
    Calculos cq = new Calculos();
    
    int n1, n2, n3, med;
    
    System.out.print("Escreva o primeiro número");
    n1 = leitor.nextInt();
    
    System.out.print("Escreva o segundo número");
    n2 = leitor.nextInt();
    
    System.out.print("Escreva o terceiro número");
    n3 = leitor.nextInt();
    
  //Usando metodos  
  
     cq.setN1(n1);
     cq.setN2(n2);
     cq.setN3(n3);
     med = cq.CalculaMed(); 
    
    System.out.println("Sua média é:" + med);
    
    System.exit(0);
 }
    
    
}
