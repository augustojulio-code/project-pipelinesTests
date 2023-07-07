package com.juliocode.model;

public class User {
    private int numero;
    private String name;

    public User() {

    }

    public User(int numero, String name) {
        this.numero = numero;
        this.name = name;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
