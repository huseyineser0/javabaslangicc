package day08_IfElseIfStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {

        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.


        Scanner scan =new Scanner(System.in);
        System.out.print("kg gir:");
        double kg= scan.nextDouble();
        System.out.print("boy gir:");
        double boy = scan.nextDouble();
        double vke=(kg*10000 / (boy*boy));

        if (vke>30) System.out.print("obez");
        else if (vke>=25 &&vke<30) System.out.print("klou");
        else if(vke>=20 &&vke<25) System.out.print("normal");
        else System.out.println("zayıf");

    }
}
