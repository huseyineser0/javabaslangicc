package day07_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatements {
    public static void main(String[] args) {


        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin,
        //        degilse “Eskenar degil” yazdirin.

        System.out.print("kenarları girin:");
        Scanner scan=new Scanner(System.in);
        int kenar1= scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3 &&kenar1>0){
            System.out.println("eşkenar üçgen");
        }else {
            System.out.println("eşkenar değil");
        }

    }
}
