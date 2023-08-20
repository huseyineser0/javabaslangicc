package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("kenarları girin");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3= scan.nextInt();

        System.out.println( kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ?"eşkenar" : "eşkenar değil ");

    }
}
