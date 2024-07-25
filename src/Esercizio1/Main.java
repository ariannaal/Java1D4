package Esercizio1;

public class Main {
    public static void main(String[] args) {

//        System.out.println("ESERCIZIO 1");
//        Dipendente[] dipendenti = new Dipendente[3];
//        dipendenti[0] = new Dipendente("TR123", 1300, Dipartimento.PRODUZIONE);
//        dipendenti[1] = new Dipendente("PS456", 1600.50, Dipartimento.AMMINISTRAZIONE);
//        dipendenti[2] = new Dipendente("TS789", 1800.50, Dipartimento.VENDITE);

//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println("Matricola " + dipendenti[i].getMatricola());
//        }

        System.out.println("ESERCIZIO 2");
        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = new DipendentePartTime("dipendente part time", "AB123", 9.50, 96, Dipartimento.VENDITE);
        dipendenti[1] = new DipendenteFullTime("dipendente full time", "CD456", 3500, Dipartimento.PRODUZIONE);
        dipendenti[2] = new Dirigente("dirigente", "EF789", 3000, 2500, Dipartimento.AMMINISTRAZIONE);

        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println("Lo stipendio di un " + dipendenti[i].getTipoDipendente() + " è di " + dipendenti[i].getStipendio() + " €");
        }
    }
}
