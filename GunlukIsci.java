package com.arslaner.kalitimprj;

public class GunlukIsci extends Isci {
    int gunlukUcret;


    public GunlukIsci(String ad, String sad, int gunlukUcret) {
        super(ad, sad);
        this.gunlukUcret = gunlukUcret;
    }

    public int getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(int gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    @Override
    public String toString() {
        return super.toString() + " Günlük ücretiniz: " + gunlukUcret;
    }

    @Override
    public void hesaplaMaas() {
        int sonuc = gunlukUcret * 30;
        super.hesaplaMaas();
        System.out.println("Aylik maaşınız: " + sonuc);
    }

}
