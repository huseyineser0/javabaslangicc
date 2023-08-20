package day07_ifStatements;

import java.util.Scanner;

public class c03_BagimsizIfCumleleri {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan bir pozitif tamsayi isteyin,
        //        sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı girin: ");
        int sayi=scan.nextInt();
        if (sayi%5==0){
            System.out.println("sayı 5'e bölünür");
        }





    }
}
