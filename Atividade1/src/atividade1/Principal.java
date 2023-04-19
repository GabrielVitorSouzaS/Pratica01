/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gabriel
 */


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Equacao eq = new Equacao();
        double delta, x1, x2;
        
        eq.setA(2);
        eq.setB(3);
        eq.setC(1);
        
        delta = eq.calculaDelta();
        x1 = eq.calculaX1();
        x2 = eq.calculaX2();
        
        System.out.println("Delta = " + delta + "\nX1 = " + x1 + "\n" + "X2 = " + x2);
        
        
        
    }
    
}
