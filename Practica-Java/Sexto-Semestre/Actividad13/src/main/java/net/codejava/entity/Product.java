package net.codejava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    private Long id;
    private String name;
    private String lastname;
    private String age;
    private String genre;
    private float heigth; //Estatura
    private float weigth; //Peso
    private float Result_IMC;
    private String date;

    public Product() {
    }

    protected Product(Long id, String name, String brand, String madein, float price) {
        super();
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public String getGenre() {
        return genre;
    }

    public float getHeigth() {
        return heigth;
    }

    public float getWeigth() {
        return weigth;
    }

    public float getResult_IMC() {
        return Result_IMC;
    }

    public String getDate() {
        return date;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setHeigth(float heigth) {
        this.heigth = heigth;
    }

    public void setWeigth(float weigth) {
        this.weigth = weigth;
    }

    public void setResult_IMC(float Result_IMC) {
        this.Result_IMC = Result_IMC;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
