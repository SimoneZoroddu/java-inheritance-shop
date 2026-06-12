package org.lessons.java.oop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int dimensioni;
    private boolean isSmart;

    public Televisori(int dimensioni, boolean isSmart, int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.isSmart = isSmart;
    }

    public int getDimensioni() {
        return this.dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        this.dimensioni = dimensioni;
    }
    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }
}
