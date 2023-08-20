package day07_ifStatements;

import javax.swing.*;
import java.util.Scanner;

public class C05_BagimsizIfCumleleri {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.


        // bu benim yaptığım kodlama

                Scanner scan=new Scanner(System.in);
                System.out.println("kenar1!i girin");
                int kenar1=scan.nextInt();
        System.out.println("kenar2'yi girin");
        int kenar2= scan.nextInt();
        System.out.println("kenar3'ü girin");
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar2>0){
            System.out.println("eşkenar üçgen");
        }



        // BUDA AHMET HOCANIN YAPTIĞI KODLAMA



        Scanner scanner = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz");

        double knr1 = scanner.nextDouble();
        double knr2 = scanner.nextDouble();
        double knr3 = scanner.nextDouble();

        /*
            java'da 3'lu karsilastirma OLMAZ
            ikili karsilastirmalar yapip
            && veya || operatorleri ile birlestirmeliyiz
         */

        if (knr1 == knr2 && knr1== knr3 && knr1>0){

            System.out.println("Eskenar ucgen");


    }
}
}

