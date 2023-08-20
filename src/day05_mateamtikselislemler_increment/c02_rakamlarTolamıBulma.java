package day05_mateamtikselislemler_increment;

import java.util.Scanner;

public class c02_rakamlarTolamıBulma {
    public static void main(String[] args) {
        //kullanıcıdan 3 bsamaklı sayı alıp
        //rakamlar tolamını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen 3 basamkalı sayı giriniz:");
        int girilensayi=scan.nextInt();

        int rakamlartoplam=0;
        int birlerbasamagı=0;


        birlerbasamagı=girilensayi%10;
        rakamlartoplam=rakamlartoplam+birlerbasamagı;
        girilensayi=girilensayi/10;



        birlerbasamagı=girilensayi%10;
        rakamlartoplam=rakamlartoplam+birlerbasamagı;
        girilensayi=girilensayi/10;



        birlerbasamagı=girilensayi%10;
        rakamlartoplam=rakamlartoplam+birlerbasamagı;
        girilensayi=girilensayi/10;


        System.out.println("rakamlar tolamı: "+rakamlartoplam);
    }
}
