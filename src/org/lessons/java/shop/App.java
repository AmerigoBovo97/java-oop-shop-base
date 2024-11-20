package org.lessons.java.shop;

public class App {
    
    public void main(){
        Prodotto product1 = new Prodotto("Pupazzo di Cane Pazzo", "è un semplice pupazzo di cane ma con gli occhi cuciti male", 15.50, 22);
        System.out.println(product1.codice + product1.descrizione + product1.iva);
        System.out.println(product1.priceDisplayer());

    }
}
