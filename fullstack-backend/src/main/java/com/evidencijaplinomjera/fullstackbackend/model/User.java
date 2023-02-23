package com.evidencijaplinomjera.fullstackbackend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String ime;
    private String prezime;
    private String adresa;

    private String grad;
    private String drzava;
    private Long zipcode ;
    private Long broj_plinomjera;
    private Long stanje_plinomjera;


    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public Long getZipcode() {
        return zipcode;
    }

    public void setZipcode(Long zipcode) {
        this.zipcode = zipcode;
    }

    public Long getBroj_plinomjera() {
        return broj_plinomjera;
    }

    public void setBroj_plinomjera(Long broj_plinomjera) {
        this.broj_plinomjera = broj_plinomjera;
    }

    public Long getStanje_plinomjera() {
        return stanje_plinomjera;
    }

    public void setStanje_plinomjera(Long stanje_plinomjera) {
        this.stanje_plinomjera = stanje_plinomjera;
    }
}
