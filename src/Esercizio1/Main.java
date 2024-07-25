package Esercizio1;

public class Main {
    public static void main(String[] args) {
        
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = new Dipendente("TR123", 1300, Dipartimento.PRODUZIONE);
        dipendenti[1] = new Dipendente("PS456", 1600.50, Dipartimento.AMMINISTRAZIONE);
        dipendenti[2] = new Dipendente("TS789", 1800.50, Dipartimento.VENDITE);

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Matricola " + dipendenti[i].getMatricola());
        }
    }
}
