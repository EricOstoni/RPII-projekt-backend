package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    private String prezime;
    private String grad;
    private String drzava;
    private int zipcode;
    private int broj_plinomjera;
    private int stanje_plinomjera;
    private String address;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getBroj_plinomjera() {
        return broj_plinomjera;
    }

    public void setBroj_plinomjera(int broj_plinomjera) {
        this.broj_plinomjera = broj_plinomjera;
    }

    public int getStanje_plinomjera() {
        return stanje_plinomjera;
    }

    public void setStanje_plinomjera(int stanje_plinomjera) {
        this.stanje_plinomjera = stanje_plinomjera;
    }
}
