package day03_Scanner;

import java.util.Scanner;

public class c06_Scanner {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan bir cemberin yaricapini alip
        // cevresini ve alanini yazdirin.

        //cember alan: A=π.r2
        //çevre:2πr
        //π'yi bu soruda 3.14 alalım ve

        double π=3.14;
        Scanner scan=new Scanner(System.in);
        System.out.print("çemberin yarıçapının giriniz:");
        double yarıcap= scan.nextDouble();
        double alan=π*yarıcap*yarıcap;
        double cevre=2*π*yarıcap;

        System.out.println("alan:"+alan);
        System.out.println("çevre:"+cevre);
    }
}
