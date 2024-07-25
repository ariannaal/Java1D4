package Esercizio1;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(String tipoDipendente, String matricola, double stipendio, Dipartimento dipartimento) {
        super(tipoDipendente, matricola, stipendio, dipartimento);
    }

    @Override
    public double CalculateSalary() {
        return getStipendio();
    }


}
