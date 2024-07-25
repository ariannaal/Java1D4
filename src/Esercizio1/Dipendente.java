package Esercizio1;

import interfaces.IVolontario;

public abstract class Dipendente implements IVolontario {


    //ATTRIBUTI
    private String tipoDipendente;
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    //COSTRUTTORI
    public Dipendente(String tipoDipendente, String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
        this.tipoDipendente = tipoDipendente;
    }


    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public String getTipoDipendente() {
        return tipoDipendente;
    }

    public abstract double CalculateSalary();

    @Override
    public void checkIn() {
        System.out.println("Il " + tipoDipendente + " con matricola " + matricola + " ha fatto check-in.");
    }
}
