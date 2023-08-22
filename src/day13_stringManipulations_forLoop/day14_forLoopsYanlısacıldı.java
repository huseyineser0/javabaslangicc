package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class day14_forLoopsYanlısacıldı {
    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali +
        //         - son karakter rakam olmali +
        //         - sifre bosluk icermemeli +
        //         - uzunlugu en az 10 karakter olmali +

        // flag yontemini kullanalim
        // flag'i basta true yapalim, her uygun olmayan durumda false degeri atayalim

        boolean flag = true;

        // sartlar birbirinden bagimsiz oldugundan bagimsiz if cumleleri kullanalim

        System.out.println("şifre gir:");
        Scanner scan=new Scanner(System.in);
        String sifre= scan.nextLine();
        char ilkharf=sifre.charAt(0);
        char sonkrk=sifre.charAt(sifre.length()-1);
        int uzun=sifre.length();

        if (!(ilkharf>='a'&& ilkharf<='z')){
            System.out.println("ilk harf küçük olmalı");
            flag =false;
        }
        if (!(sonkrk>='1' && sonkrk<='9')){
            System.out.println("son karakter rakam olmalı");
            flag=false;

        }
        if ((sifre.contains(" "))){
            System.out.println("sifre bosluk icermemeli");
            flag=false;
        }
        if (!(uzun>=10)){
            System.out.println("uzunluk 10 karakterden fazla olmalı");
            flag=false;
        }
        if (flag){
            System.out.println("şifre başarılı");
        }
    }
}
