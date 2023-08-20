package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alin
        // sayinin tek mi cift mi oldugunu yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.print("pozitif tam sayi gir: ");
        int sayi= scan.nextInt();
        if (sayi%2==0){
            System.out.print("çift sayi:");
        }else {
            System.out.println("tek sayi");
        }


         /*
            If else ile yapabilecegimiz
            basit islemleri
            daha kisa olarak yazabilmek icin ternary kullanilir
         */

        System.out.println(sayi%2==0 ? "çift sayi:" : "tek sayi");

    }
}
