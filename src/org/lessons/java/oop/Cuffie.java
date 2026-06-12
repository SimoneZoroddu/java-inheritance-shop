package org.lessons.java.oop;

import java.math.BigDecimal;

public class Cuffie  extends Prodotto{
    private String colore;
    private boolean isCabled;

    public Cuffie(String colore, boolean isCabled, int codice, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.isCabled = isCabled;
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
    public boolean getIsCabled() {
        return this.isCabled;
    }

    public void setIsCabled(boolean isCabled) {
        this.isCabled = isCabled;
    }
}
