package com.arslaner;

import com.arslaner.kalitimprj.AylikIsci;
import com.arslaner.kalitimprj.GunlukIsci;
import com.arslaner.kalitimprj.HaftalikIsci;
import com.arslaner.kalitimprj.Isci;

public class Main {

    public static void main(String[] args) {

        Isci ai = new AylikIsci("görkem", " arslaner", 5000);
        Isci gi = new GunlukIsci("mert", "kavkaci", 150);
        Isci hi = new HaftalikIsci("oğuzhan", "kırlı", 750);

        System.out.println(ai.toString());
        ai.hesaplaMaas();
        System.out.println("***************************************");
        System.out.println(gi.toString());
        gi.hesaplaMaas();
        System.out.println("****************************************");
        System.out.println(hi.toString());
        hi.hesaplaMaas();
        Isci.ısciSayacBul();
    }

}
