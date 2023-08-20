package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin

        System.out.print("iki tam sayi girin:");
        Scanner scan=new Scanner(System.in);
        int sayı1= scan.nextInt();
        int sayı2= scan.nextInt();

        System.out.println(sayı1>sayı2 ? sayı1:sayı2);


    }
}
