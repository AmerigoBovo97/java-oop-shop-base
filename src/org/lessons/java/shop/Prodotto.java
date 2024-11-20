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

    public Prodotto(String nome, String descrizione, double prezzo){
        this(nome, descrizione, prezzo, 22);
    }


    public static int codiceRandomGenerator() {
        Random generator = new Random();
        int codiceRandom = generator.nextInt(100);
        return codiceRandom;
    }

    public String priceDisplayer(){
        String result = "il prezzo base è " + this.prezzo;
        return result;
    }

    public String ivaPriceDisplayer(){
        String result = "il prezzo compreso di iva è " + (this.prezzo + (this.prezzo * this.iva / 100));
        return result;
    }

    public String extendedName(){
        String name = this.codice + "-" + this.nome;
        return name;
    }

}
