package com.arslaner.kalitimprj;

public class HaftalikIsci extends Isci {

    int haftalikUcret;

    public HaftalikIsci(String ad, String sad, int haftalikUcret) {
        super(ad, sad);
        this.haftalikUcret = haftalikUcret;
    }

    public int getHaftalikUcret() {
        return haftalikUcret;
    }

    public void setHaftalikUcret(int haftalikUcret) {
        this.haftalikUcret = haftalikUcret;
    }

    @Override
    public String toString() {
        return super.toString() + " Haftalık Ücretiniz: " + haftalikUcret;
    }

    @Override
    public void hesaplaMaas() {
        int sonuc = haftalikUcret * 4;
        super.hesaplaMaas();
        System.out.println("Aylik maaşınız: " + sonuc);
    }

}
