package day03_Scanner;

import java.util.Scanner;

public class c07_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip
        // ikisinin degerlerini degistirin(swap)

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz:");
        int sayi1= scan.nextInt();
        System.out.println("sayi1'in degeri:"+sayi1);
        System.out.print("lütfen bir sayı giriniz:");
        int sayi2=scan.nextInt();
        System.out.println("sayi2'in degeri:"+sayi2);
        System.out.println();
        System.out.println("sayı 1'in yeni değeri"+sayi2);
        System.out.println("sayı2'in yeni değeri:"+sayi1);

    }
}
