package it.epicode.esercizio2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Es2 {
    public static List<Integer> generaListaCasuale(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101)); // Genera numeri casuali da 0 a 100
        }

        Collections.sort(lista);
        return lista;
    }


    public static List<Integer> creaListaDoppia(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista) ;

        List<Integer> listaInversa = new ArrayList<>(lista);
        Collections.reverse(listaInversa);
        nuovaLista.addAll(listaInversa);

        return nuovaLista;
    }


    public static void stampaValori(List<Integer> lista, boolean stampaPari) {
        for (int i = 0; i < lista.size(); i++) {
            if (stampaPari && i % 2 == 0) {
                System.out.println(lista.get(i));
            } else if (!stampaPari && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }


    public static void main(String[] args) {
        int n = 10;


        List<Integer> listaCasuale = generaListaCasuale(n);
        System.out.println("Lista casuale ordinata:");
        System.out.println(listaCasuale);


        List<Integer> listaDoppia = creaListaDoppia(listaCasuale);
        System.out.println("\nLista con elementi seguiti dagli stessi in ordine inverso:");
        System.out.println(listaDoppia);
        System.out.println("Lista casuale ordinata:");
        System.out.println(listaCasuale);


        System.out.println("\nValori in posizioni pari:");
        stampaValori(listaDoppia, true);


        System.out.println("\nValori in posizioni dispari:");
        stampaValori(listaDoppia, false);
    }
}
