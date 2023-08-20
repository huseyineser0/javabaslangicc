package day08_IfElseIfStatements;

import java.util.Scanner;

public class C03_IfElseIfStatements {
    public static void main(String[] args) {


        // Ogrenciden notunu isteyin ve harf olarak basari notunu yazdirin
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu  degilse) 65 ve ustu ise BB,
        //(65 ve ustu  de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD
        // ben hocadan farklı olarak geçersiz notları yazdırmaya izin vermedim


           /*
            Bir if - else if - else.... statement else ile bitmek zorunda degildir
            else ile biten kodlar, her durum icin mutlaka bir sonuc uretirler
            else ile bitmezse tum durumlari kapsamaz
            yani bazi degerler icin sonuc uretmeyebilir

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen notu gir:");
        int not= scan.nextInt();

        if (not>=85 && not<=100) System.out.println("aa");
        else if (not>=65 && not<85) System.out.println("bb");
        else if (not>=50 && not<65) System.out.println("cc");
        else if (not>=0 && not<50) System.out.println("dd");
        else System.out.println("geçersiz not ");

    }
}
