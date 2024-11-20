package org.lessons.java.shop;

public class App {
    
    public void main(){

        Prodotto product1 = new Prodotto("Pupazzo di Cane Pazzo", "è un semplice pupazzo di cane ma con gli occhi cuciti male", 15.50, 22);
        Prodotto product2 = new Prodotto("RoboSapiens", "Un robottino anni 2000 per divertire grandi e piccini", 80, 22);
        Prodotto product3 = new Prodotto("Carta Igenica", "Nome autoesplicativo", 0.40, 12);
        Prodotto product4 = new Prodotto("Danilo Pirro", "Addestratore di cani anti divertimento", 5000);




        System.out.println(product1.priceDisplayer());
        System.out.println(product1.ivaPriceDisplayer());
        System.out.println(product1.extendedName());

        System.out.println(product2.priceDisplayer());
        System.out.println(product2.ivaPriceDisplayer());
        System.out.println(product2.extendedName());

        System.out.println(product3.priceDisplayer());
        System.out.println(product3.ivaPriceDisplayer());
        System.out.println(product3.extendedName());

        System.out.println(product4.priceDisplayer());
        System.out.println(product4.ivaPriceDisplayer());
        System.out.println(product4.extendedName());


    }
}
