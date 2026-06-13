package org.lessons.java.oop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Stai inserendo uno Smartphone, Televisore o Cuffie?");
        String productTipology = in.nextLine();

        boolean isFedelityCard = false;
        
        while (true) {
            System.out.println("Hai una carta fedelta?");
            String fidelityCard = in.nextLine();

            if (fidelityCard.toLowerCase().equals("si")) {
                isFedelityCard = true;
                break;
            } else if (fidelityCard.toLowerCase().equals("no")) {
                isFedelityCard = false;
                break;
            } else {
                System.out.println("hai sbagliato a scrivere, mi serve 'si' o 'no' ");
            }
        }

        in.close();

        if (productTipology.toLowerCase().equals("smartphone")) {
            Smartphone smartphone = new Smartphone(240, "Galaxy 15", "Samsung", new BigDecimal(400.99),
                    new BigDecimal(0.22));
            if (isFedelityCard) {
                smartphone.prezzo = smartphone.prezzoScontatoFedelta();
            }
            System.out.println(smartphone);
        } else if (productTipology.toLowerCase().equals("televisore")) {
            Televisori tv = new Televisori(32, true, "XIAOMI TV F 32 pollici", "XIAOMI", new BigDecimal(139.39),
                    new BigDecimal(0.22));
            if (isFedelityCard) {
                tv.prezzo = tv.prezzoScontatoFedelta();
            }
            System.out.println(tv);
        } else if (productTipology.toLowerCase().equals("cuffie")) {
            Cuffie cuffie = new Cuffie("Giallo", true, "Logitech 930", "Logitech", new BigDecimal(200.21),
                    new BigDecimal(0.22));
            if (isFedelityCard) {
                cuffie.prezzo = cuffie.prezzoScontatoFedelta();
            }
            System.out.println(cuffie);
        } else {
            System.out.println("hai sbagliato a scrivere la tipologia del tuo prodotto");
        }

    }
}
