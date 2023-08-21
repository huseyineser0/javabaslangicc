package day11_stringManipulations;

import java.util.Scanner;


public class C02_length {
    public static void main(String[] args) {


        String isim = "Ramazan Uzunkavaklaraltindayataruyumazoglu";

        // son harfi yazdirin

        System.out.println("uzunluk:" +isim.length());//42
        System.out.println("son harf:"+isim.charAt(isim.length()-1));//u


        //sondan 5. harfi yyazdır

        System.out.println(isim.charAt(isim.length()-5));//z

        // kullanicidan ismini alin
        // ve ortadaki harfi yazdirin
        // ismin uzunlugu cift sayi ise orta kisimdaki 2 harfi yazdirin


        System.out.println("adınızı girin:");
        Scanner scan=new Scanner(System.in);
        String ad= scan.nextLine();
        int uzunluk =ad.length();

        if (uzunluk%2==0){
            System.out.println("uzunluk çift:"+ad.charAt(uzunluk/2-1)+
                    ad.charAt(uzunluk/2));
        }else {
            System.out.println("uzunluk tekse:"+ad.charAt((uzunluk-1)/2));
            // biz aslında ad.charAt(uzunluk/2)) bunu da yazsak kodumuz düngünce çalışır
            // biz yukarıda uzunnluku int tanımladığımız için bize int gibi davranıp
            //örn 3 harfli bir isim(ada) oldugunda yarısı 1.5 olur ve bunu 1.index olarak alırdı
            // buda 'd' ye denk gelir ve doğru olurdu.


        }


    }
}

