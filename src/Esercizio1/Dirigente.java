package Esercizio1;

public class Dirigente extends Dipendente {

    //ATTRIBUTI
    private double pagaExtra;


    public Dirigente(String tipoDipendente, String matricola, double stipendio, double pagaExtra, Dipartimento dipartimento) {
        super(tipoDipendente, matricola, stipendio + pagaExtra, dipartimento);
        this.pagaExtra = pagaExtra;
    }

    @Override
    public double CalculateSalary() {
        return getStipendio() + pagaExtra;
    }
}
