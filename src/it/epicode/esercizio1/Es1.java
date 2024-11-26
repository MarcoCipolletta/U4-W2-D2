package it.epicode.esercizio1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> paroleDistinte = new HashSet<String>();
        Set<String> paroleDuplicate = new HashSet<String>();
        System.out.println("Quanti elementi vuoi inserire?");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci una parola");
            String word = scanner.nextLine().trim();
           if(!paroleDistinte.add(word)){
               paroleDuplicate.add(word);
               paroleDistinte.remove(word);
           }
        }
        System.out.println("Parole duplicate:");
        for (String parolaDuplicata : paroleDuplicate) {
            System.out.println(parolaDuplicata);
        }
        System.out.println("Numero di parole distinte: " + paroleDistinte.size() );
        System.out.println("Parole distinte:");
        for (String parolaDistinta : paroleDistinte){
            System.out.println(parolaDistinta);
        }
    }
}
