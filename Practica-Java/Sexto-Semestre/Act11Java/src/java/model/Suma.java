/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alant
 */
public class Suma {
     private int num1;
    private int num2;
    private int resulto;

    public void hacerSuma(String n1, String n2) {
        int s = Integer.parseInt(n1) + Integer.parseInt(n2);
        this.setResulto(s);
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getResulto() {
        return resulto;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setResulto(int resulto) {
        this.resulto = resulto;
    }
}
