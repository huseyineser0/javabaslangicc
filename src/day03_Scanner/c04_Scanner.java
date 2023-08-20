package day03_Scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        // Isminiz : John
        // Soyisminiz : Doe
        // Yasiniz : 44
        // Kaydiniz basariyla tamamlanmistir.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen adınızı soyadınızı yaşınızı girin :");
        String ad=scan.nextLine();
        String soyad= scan.nextLine();
        int yas= scan.nextInt();

        System.out.println("isminiz:"+ad);
        System.out.println("soyisminiz:"+soyad);
        System.out.println("yaşınız:"+yas);
        System.out.println("Kaydınız basarıyla tamamşanmıştır.");


    }
}
