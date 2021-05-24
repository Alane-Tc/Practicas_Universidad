package net.codejava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    private Long id;
    private String Base;
    private String Altura;
    private int resultado;
    private int resultPerimeter;

    public Product() {
    }

    protected Product(Long id, String Base, String Altura) {
        super();
        this.id = id;
    }

    public void calcularArea() {
        int re = Integer.parseInt(Base) * Integer.parseInt(Altura) / 2;
        this.setResultado(re);
    }

    public void calcularPerimetro() {
        int resultadoPerimetro = Integer.parseInt(Base) * 3;
        this.setResultPerimeter(resultadoPerimetro);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBase() {
        return Base;
    }

    public String getAltura() {
        return Altura;
    }

    public void setBase(String Base) {
        this.Base = Base;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public int getResultado() {
        return resultado;
    }

    public int getResultPerimeter() {
        return resultPerimeter;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public void setResultPerimeter(int resultPerimeter) {
        this.resultPerimeter = resultPerimeter;
    }

}
