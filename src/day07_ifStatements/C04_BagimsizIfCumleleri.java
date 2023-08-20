package day07_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir tamsayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi girin: ");
        int sayi=scan.nextInt();

        if (sayi%3==0){
            System.out.println("sayi 3'e bölğnür");
        }
        if (sayi%5==0){
            System.out.println("sayi 5'e bölünür");
        }

    }
}
