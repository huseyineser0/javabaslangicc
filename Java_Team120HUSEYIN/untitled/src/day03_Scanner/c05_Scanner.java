package day03_Scanner;

import java.util.Scanner;

public class c05_Scanner {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.print("dikdortgenin uzun kenarını girin:");
        double uzunknr= scan.nextDouble();
        System.out.print("dikdortgenin kısa kenarını girin:");
        double kısaknr= scan.nextDouble();
        double alan=kısaknr*uzunknr;

        System.out.println("dikdortgenin alanı:"+alan);


    }
}
