package day08_IfElseIfStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.print("cinsiyet girin:");
        System.out.println("erkek: E  kadın: K");
        char cinsiyet=scan.next().toLowerCase().charAt(0);

        System.out.print("yas:");
        int yas = scan.nextInt();

        if (cinsiyet=='E'&& yas>=65) System.out.println("emekli olabilir");
        else if (cinsiyet=='E' && yas<65) {
            System.out.println("emekli olmak için "+(65-yas)+" yıl daha çalışmalısın");
        } else if (cinsiyet=='K' && yas>=60) {
            System.out.println("emekli olabilir");

        } else if (cinsiyet=='K'&& yas<60 ) {
            System.out.println("emekli olamk için"+(60-yas)+" yıl daha çalışmalısın");

        }


    }
}
