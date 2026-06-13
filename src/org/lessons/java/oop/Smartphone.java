package org.lessons.java.oop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {
    private long IMEI;
    private int memoria;

    public Smartphone(int memoria, String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        super(nome, marca, prezzo, iva);
        Random rand = new Random();
        this.IMEI = rand.nextLong(999999999);
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

    @Override
    public String toString(){
        return String.format("Ecco il tuo Smarthpone nel carrello: %s Marca: %s  Memoria: %d IMEI: %d Prezzo: %s  ", this.nome, this.marca,this.memoria, this.IMEI, this.prezzo.setScale(2, java.math.RoundingMode.HALF_UP));
    }

    @Override
    public BigDecimal prezzoScontatoFedelta(){
        if (this.memoria < 32){
            return this.prezzo.subtract(this.prezzo.multiply(new BigDecimal(5)).divide(new BigDecimal(100)));
        } else {
            return super.prezzoScontatoFedelta();
        }
    }
}
