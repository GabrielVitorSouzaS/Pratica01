/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade2;

/**
 *
 * @author gabriel
 */
public class Calculos {
    
    private int n1;
    private int n2;
    private int n3;
    private int med;
    
    public int CalculaMed(){
        
        setMed((getN1() + getN2() +getN3())/ 3);
        return getMed();
        
    }

    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }

    /**
     * @return the med
     */
    public int getMed() {
        return med;
    }

    /**
     * @param med the med to set
     */
    public void setMed(int med) {
        this.med = med;
    }

    /**
     * @return the n3
     */
    public int getN3() {
        return n3;
    }

    /**
     * @param n3 the n3 to set
     */
    public void setN3(int n3) {
        this.n3 = n3;
    }
    
        
    }
    
 
