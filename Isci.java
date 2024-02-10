package com.arslaner.kalitimprj;

public class Isci {

    String ad;
    String sad;
    static int isciSayac = 0;

    public Isci() {
    }

    public Isci(String ad, String sad) {
        this.ad = ad;
        this.sad = sad;
       // 2 parametreli constracktur çalışır. Bellekteki sayaç
        isciSayac = isciSayac+1;

    }

    public static void ısciSayacBul(){

        System.out.println("Bellekte "+isciSayac+" kadar işçimiz var.");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSad() {
        return sad;
    }

    public void setSad(String sad) {
        this.sad = sad;
    }

    @Override
    public String toString() {
        return "ad: " + ad + " Soyad: " + sad;

    }

    public void hesaplaMaas() {

        System.out.println(ad + " " + sad + " maaşınız hesaplanıyor. ");
    }

}
