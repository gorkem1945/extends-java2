package com.arslaner.kalitimprj;

public class AylikIsci extends Isci {

    int aylikMaas;

    public AylikIsci(String ad, String sad, int aylikMaas) {
        super(ad, sad);
        this.aylikMaas = aylikMaas;
    }

    public int getAylikMaas() {
        return aylikMaas;
    }

    public void setAylikMaas(int aylikMaas) {
        this.aylikMaas = aylikMaas;
    }

    @Override
    public String toString() {
        return super.toString() + " Aylik maaşınız: " + aylikMaas;
    }

    @Override
    public void hesaplaMaas() {
        super.hesaplaMaas();
        System.out.println("Maaşınız: " + aylikMaas);
    }

}
