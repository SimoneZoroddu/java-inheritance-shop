package org.lessons.java.oop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int pollici;
    private boolean isSmart;

    public Televisori(int pollici, boolean isSmart, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        super(nome, marca, prezzo, iva);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }

    public int getPollici() {
        return this.pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return String.format("Ecco la tua TV nel carrello: %s\n Marca: %s\n  Pollici: %d\n Prezzo: %s ", this.nome,
                this.marca, this.pollici, this.prezzo.setScale(2, java.math.RoundingMode.HALF_UP));
    }

    @Override
    public BigDecimal prezzoScontatoFedelta() {
        if (!this.isSmart) {
            return this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(10)).divide(new BigDecimal(100)));
        } else {
            return super.prezzoScontatoFedelta();
        }
    }
}
