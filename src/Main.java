import java.util.*;
public class Main {
    public static void main(String[] args){
        Studenti studenti = new Studenti();
        Studenti studente1 = new Studenti("Marco",15);
        Studenti studente2 = new Studenti("Luigi",16);
        Studenti studente3 = new Studenti("Anna", 15);
        Studenti studente4 = new Studenti("Kevin", 17);
        Studenti studente5 = new Studenti("Luca", 16);
        Studenti studente6 = new Studenti("Giulia", 15);
        Studenti studente7 = new Studenti("Mario", 16);
        Studenti studente8 = new Studenti("Chiara", 16);
        Studenti studente9 = new Studenti("Riccardo", 17);
        Studenti studente10 = new Studenti("Paolo", 15);
        Studenti studente11 = new Studenti("Manuel", 17);
        Studenti studente12 = new Studenti("Giulia", 16);
        studenti.getListaStudenti().add(studente1);
        studenti.getListaStudenti().add(studente2);
        studenti.getListaStudenti().add(studente3);
        studenti.getListaStudenti().add(studente4);
        studenti.getListaStudenti().add(studente5);
        studenti.getListaStudenti().add(studente6);
        studenti.getListaStudenti().add(studente7);
        studenti.getListaStudenti().add(studente8);
        studenti.getListaStudenti().add(studente9);
        studenti.getListaStudenti().add(studente10);
        studenti.getListaStudenti().add(studente11);
        studenti.getListaStudenti().add(studente12);
        studenti.dettagliStudenti();
        studenti.getListaStudenti().sort(Comparator.comparing(Studenti::getNome));
        System.out.println();
        studenti.dettagliStudenti();





    }
}
