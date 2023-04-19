/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade1;

/**
 *
 * @author gabriel
 */
public class Equacao {
   
    //Atributos
    
    private double a;
    private double b;
    private double c;
    private double delta;
    private double x1;
    private double x2;
    
    
    
    //Metodos:
    
//Com parametro 
 public double calculaDelta(double a, double b, double c){
     
        setDelta((b*b) - 4*(a*c));
     
     return getDelta();
     
 } 
 
 //Sem Parametro
 public double calculaDelta(){
     
     this.setDelta((getB() * getB()) - 4 * (getA() * getC()));
     
     return getDelta();
 }
 
 public double calculaX1(){
     
        setX1((-getB() + Math.sqrt(getDelta())) / (2 * getA()));
     
     return getX1();
     
 }
    
 public double calculaX2(){
     
        setX2((-getB() - Math.sqrt(getDelta())) / (2 * getA()));
     
     return getX2();
     
 }

    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }

    /**
     * @return the delta
     */
    public double getDelta() {
        return delta;
    }

    /**
     * @param delta the delta to set
     */
    public void setDelta(double delta) {
        this.delta = delta;
    }

    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
 
}
/**
 *   System.out.print("DIgite o numero do mês: ");
         int mes = leitor.nextInt();
         
       String monthString="";   
       //Declaração switch   
       switch(mes){  
       //Declaração case dentro do bloco switch   
       case 1: monthString="1 - Janeiro";   
          break;  
       case 2: monthString="2 - Fevereiro";   
          break;  
       case 3: monthString="3 - Marco";   
          break;  
       case 4: monthString="4 - Abril";   
          break;  
       case 5: monthString="5 - Maio";   
          break;  
       case 6: monthString="6 - Junho";   
          break;  
       case 7: monthString="7 - Julho";   
          break;  
       case 8: monthString="8 - Agosto";   
          break;  
       case 9: monthString="9 - Setembro";   
          break;     
       case 10: monthString="10 - Outubro";   
          break;  
       case 11: monthString="11 - Novembro";   
          break;  
       case 12: monthString="12 - Dezembro";   
          break;  
       default:System.out.println("Mes Invalido!");  
    }  
    //Escrevendo o mês de acordo com o número   
    System.out.println(monthString);  
        System.exit(0);
 * 
 */