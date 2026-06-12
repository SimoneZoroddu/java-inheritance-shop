package org.lessons.java.oop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private long IMEI;
    private int memoria;

    public Smartphone(long IMEI, int memoria, int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        super(codice, nome, marca, prezzo, iva);
        this.IMEI = IMEI;
        this.memoria = memoria;
    }

    public long getIMEI() {
        return this.IMEI;
    }

    public void setIMEI(long IMEI) {
        this.IMEI = IMEI;
    }
    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
