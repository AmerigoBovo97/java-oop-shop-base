package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
    
    int codice;
    String nome;
    String descrizione;
    double prezzo;
    int iva;


    public Prodotto(String nome, String descrizione, double prezzo, int iva){
        
        this.codice = codiceRandomGenerator();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }


    public static int codiceRandomGenerator() {
        Random generator = new Random();
        int codiceRandom = generator.nextInt(100);
        return codiceRandom;
    }

}
