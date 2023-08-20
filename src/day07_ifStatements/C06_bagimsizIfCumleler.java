package day07_ifStatements;

import java.util.Scanner;

public class C06_bagimsizIfCumleler {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tam sayi isteyin
        // sayi 3 veya 5 ile bolunebiliyorsa
        // "Guzel sayi" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("sayı gir");
        int sayi= scan.nextInt();

        if(sayi%3==0 || sayi%5==0){
            System.out.println("güzel sayi");
        }








    }
}
