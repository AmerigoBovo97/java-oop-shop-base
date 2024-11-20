package org.lessons.java.shop;

public class Prodotto {
    
    int codice;
    String nome;
    String descrizione;
    float prezzo;
    int iva;


    public Prodotto(String nome, String descrizione, float prezzo, int iva){
        
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        
    }

}
