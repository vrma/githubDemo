package com.example.model;

public class Proyecto {
    private String nombre;
    private int numParticipantes;
    public Proyecto(String nombre, int numParticipantes) {
        this.nombre = nombre;
        this.numParticipantes = numParticipantes;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNumParticipantes() {
        return numParticipantes;
    }
    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    
}
