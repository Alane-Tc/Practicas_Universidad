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
public class Triangle {

    private int resultArea;
    private int resultPerimeter;

    public void area(String baseTriangle, String heightTriangle) {
        int re = Integer.parseInt(baseTriangle) * Integer.parseInt(heightTriangle) / 2;
        this.setResultArea(re);
    }

    public void perimeter(String baseTriangle) {
        int p = Integer.parseInt(baseTriangle) * 3;
        this.setResultPerimeter(p);
    }

    public void setResultArea(int resultArea) {
        this.resultArea = resultArea;
    }

    public void setResultPerimeter(int resultPerimeter) {
        this.resultPerimeter = resultPerimeter;
    }

    public int getResultArea() {
        return resultArea;
    }

    public int getResultPerimeter() {
        return resultPerimeter;
    }
}
