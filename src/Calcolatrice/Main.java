package Calcolatrice;

public class Main {

    public static void main(String[] args) {

        Operazione somma = new Addizione();
        int risultatos = somma.calcola(10, 25);
        System.out.println("La somma é: " + risultatos);

        Operazione meno = new Sottrazione();
        int risultatom = meno.calcola(10, 25);
        System.out.println("La sottrazione é: " + risultatom);

        Operazione per = new Moltiplicazione();
        int risultatom2 = per.calcola(10, 25);
        System.out.println("La moltiplicazione é: " + risultatom2);

        Operazione diviso = new Divisione();
        int risultatod = diviso.calcola(100, 25);
        System.out.println("La divisione é: " + risultatod);


    }
}