package com.example.model;

public class Ruben {
    private double estatura;
    private double peso;
    
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public Ruben(double estatura, double peso) {
        this.estatura = estatura;
        this.peso = peso;
    }
}
