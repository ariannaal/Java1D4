package Esercizio1;

import interfaces.IVolontario;

public class Volontario implements IVolontario {

    private String nome;
    private int eta;
    private String cv;

    public Volontario(String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public String getCv() {
        return cv;
    }

    @Override
    public void checkIn() {
        System.out.println("Il volontario " + nome + " di anni " + eta + " ha fatto check-in.");
    }


}
