package org.lessons.java.oop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String colore;
    private boolean isCabled;

    public Cuffie(String colore, boolean isCabled, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        super(nome, marca, prezzo, iva);
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

    @Override
    public String toString() {
        return String.format("Ecco le tue cuffie nel carrello: %s\n Marca: %s\n  Colore: %s\n Prezzo: %s ", this.nome, this.marca, this.colore, this.prezzo.setScale(2, java.math.RoundingMode.HALF_UP));
    }

    @Override
    public BigDecimal prezzoScontatoFedelta(){
        if (this.isCabled){
            return this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(7)).divide(new BigDecimal(100)));
        } else {
            return super.prezzoScontatoFedelta();
        }
    }
}
