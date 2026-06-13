package org.lessons.java.oop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        /*
         * Scanner in = new Scanner(System.in);
         * 
         * System.out.println("Stai inserendo uno Smartphone, Televisore o Cuffie?");
         * String productTipology = in.nextLine();
         * 
         * boolean isFedelityCard = false;
         * 
         * while (true) {
         * System.out.println("Hai una carta fedelta?");
         * String fidelityCard = in.nextLine();
         * 
         * if (fidelityCard.toLowerCase().equals("si")) {
         * isFedelityCard = true;
         * break;
         * } else if (fidelityCard.toLowerCase().equals("no")) {
         * isFedelityCard = false;
         * break;
         * } else {
         * System.out.println("hai sbagliato a scrivere, mi serve 'si' o 'no' ");
         * }
         * }
         * 
         * in.close();
         * 
         * if (productTipology.toLowerCase().equals("smartphone")) {
         * Smartphone smartphone = new Smartphone(240, "Galaxy 15", "Samsung", new
         * BigDecimal(400.99),
         * new BigDecimal(0.22));
         * if (isFedelityCard) {
         * smartphone.prezzo = smartphone.prezzoScontatoFedelta();
         * }
         * System.out.println(smartphone);
         * } else if (productTipology.toLowerCase().equals("televisore")) {
         * Televisori tv = new Televisori(32, true, "XIAOMI TV F 32 pollici", "XIAOMI",
         * new BigDecimal(139.39),
         * new BigDecimal(0.22));
         * if (isFedelityCard) {
         * tv.prezzo = tv.prezzoScontatoFedelta();
         * }
         * System.out.println(tv);
         * } else if (productTipology.toLowerCase().equals("cuffie")) {
         * Cuffie cuffie = new Cuffie("Giallo", true, "Logitech 930", "Logitech", new
         * BigDecimal(200.21),
         * new BigDecimal(0.22));
         * if (isFedelityCard) {
         * cuffie.prezzo = cuffie.prezzoScontatoFedelta();
         * }
         * System.out.println(cuffie);
         * } else {
         * System.out.println("hai sbagliato a scrivere la tipologia del tuo prodotto");
         * }
         */

        Prodotto[] products = new Prodotto[2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < products.length; i++) {

            System.out.println("Nome del prodotto");
            String productName = input.nextLine();

            System.out.println("Marca del prodotto");
            String productBrand = input.nextLine();

            System.out.println("Prezzo senza iva: ");
            int productPrice = Integer.parseInt(input.nextLine());

            System.out.println("A quale categoria fa parte? tv, smartphone, cuffie?");
            String productCategoryString = input.nextLine();
            System.out.println(productCategoryString);

            switch (productCategoryString.toLowerCase()) {
                case "tv":
                    System.out.println("Dimensioni della tv in pollici: ");
                    int tvSize = Integer.parseInt(input.nextLine());
                    System.out.println("Smart TV? (inserisci TRUE o FALSE");
                    boolean isSmartTV = Boolean.parseBoolean(input.nextLine());
                    Televisori tv = new Televisori(tvSize, isSmartTV, productName, productBrand,
                            new BigDecimal(productPrice), new BigDecimal(0.22));
                    products[i] = tv;
                    break;
                case "smartphone":
                    System.out.println("Memoria del tuo smartphone: ");
                    int smartphoneMemory = Integer.parseInt(input.nextLine());
                    Smartphone smartphone = new Smartphone(smartphoneMemory, productName, productBrand,
                            new BigDecimal(productPrice), new BigDecimal(0.22));
                    products[i] = smartphone;
                    break;
                case "cuffie":
                    System.out.println("Colore delle cuffie: ");
                    String cuffieColor = input.nextLine();
                    System.out.println("Sono wireless (Inserisci TRUE o FALSE)");
                    boolean isWireless = Boolean.parseBoolean(input.nextLine());
                    Cuffie cuffie = new Cuffie(cuffieColor, isWireless, productName, productBrand,
                            new BigDecimal(productPrice), new BigDecimal(0.22));
                    products[i] = cuffie;
                    break;
            }
            System.out.println("-----------------");
        }
        input.close();

        System.out.println("Ecco il tuo carrello:");

        for (int i = 0; i< products.length; i ++){
            System.out.println(products[i]);
            System.out.println("---------------");
        }
    }
}
