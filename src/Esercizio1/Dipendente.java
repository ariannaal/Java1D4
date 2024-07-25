package Esercizio1;

public abstract class Dipendente {


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
}
