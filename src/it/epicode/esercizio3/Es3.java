package it.epicode.esercizio3;
import java.util.HashMap;
import java.util.Map;

public class Es3 {
    private Map<String, String> rubrica;

    public Es3() {
        rubrica = new HashMap<>();
    }

    public void inserisciContatto(String nome, String telefono) {
        rubrica.put(nome, telefono);
    }

    public void cancellaContatto(String nome) {
        if (rubrica.containsKey(nome)) {
            rubrica.remove(nome);
            System.out.println("Contatto " + nome + " rimosso con successo.");
        } else {
            System.out.println("Contatto " + nome + " non trovato.");
        }
    }

    public String trovaNomeDaNumero(String numero) {
        for (Map.Entry<String, String> entry : rubrica.entrySet()) {
            if (entry.getValue().equals(numero)) {
                return entry.getKey();
            }
        }
        return "Numero non trovato.";
    }

    public String trovaNumeroDaNome(String nome) {
        return rubrica.getOrDefault(nome, "Contatto non trovato.");
    }


    public void stampaContatti() {
        if (rubrica.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            System.out.println("Contatti in rubrica:");
            for (Map.Entry<String, String> entry : rubrica.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", Numero: " + entry.getValue());
            }
        }
    }


    public static void main(String[] args) {
        Es3 rubrica = new Es3();


        rubrica.inserisciContatto("Mario Rossi", "1234567890");
        rubrica.inserisciContatto("Luigi Verdi", "0987654321");
        rubrica.inserisciContatto("Marco Grigi", "0495883929");


        rubrica.stampaContatti();


        System.out.println("\nNumero di Mario Rossi: " + rubrica.trovaNumeroDaNome("Mario Rossi"));


        System.out.println("Proprietario del numero 0987654321: " + rubrica.trovaNomeDaNumero("0987654321"));


        rubrica.cancellaContatto("Luigi Verdi");


        rubrica.stampaContatti();
    }
}
