package org.lessons.java.oop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Televisori tv = new Televisori(50, true, 21839, "XIAOMI TV F 32 pollici", "XIAOMI", new BigDecimal(139), new BigDecimal(0.22));
        Smartphone smartphone = new Smartphone(231432453, 240, 3213, "Galaxy 15", "Samsung", new BigDecimal(400), new BigDecimal(0.22));
        Cuffie cuffie = new Cuffie("Giallo", true, 32189, "Logitech 930", "Logitech", new BigDecimal(200), new BigDecimal(0.22));

        System.out.println(tv.getCodice());
        System.out.println(smartphone.getCodice());
        System.out.println(cuffie.getCodice());

        tv.setCodice(3230);
        System.out.println(tv.getCodice());


    }
}
