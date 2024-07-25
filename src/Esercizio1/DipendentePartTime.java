package Esercizio1;

public class DipendentePartTime extends Dipendente {

    //attributi
    private int oreTotali;
    private double pagaOra;


    //COSTRUTTORE
    public DipendentePartTime(String tipoDipendente, String matricola, double pagaOra, int oreTotali, Dipartimento dipartimento) {
        super(tipoDipendente, matricola, pagaOra * oreTotali, dipartimento);
        this.oreTotali = oreTotali;
        this.pagaOra = pagaOra;

    }

    @Override
    public double CalculateSalary() {
        return pagaOra * oreTotali;
    }
}
