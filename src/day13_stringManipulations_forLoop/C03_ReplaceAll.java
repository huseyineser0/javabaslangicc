package day13_stringManipulations_forLoop;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        // Kullanicidan bir metin isteyin
        // metin'deki tum sayilari ve space disindaki ozel karakterleri temizleyin
        // metnin sonuna da . koyun.
        // ornek    input : J1*2av4.a C67//an=+dir--
        //          output "Java Candir."

         /*
        Regex (Regular Expressions)
            \\s : space	 	\\S : space olmayan hersey
            \\s+ : yanyana birden fazla space
            \\d : digits		\\D : digit olmayan hersey
            \\w : harf rakam veya _	\\W : harf rakam veya _ olmayan hersey

         */


        System.out.println("metin girin:");
        Scanner scan=new Scanner(System.in);
        String metin= scan.nextLine();

        //önce rakamlardan kurtulalım
        metin=metin.replaceAll("\\d","");

        // ozel karakterlerden kurtulmak istedigimizde, space de kaybolur
        // bunun icin once space'i korumaya almaliyiz
        // artik metnimizde sayi yok, onun icin space yerine herhangi bir sayiyi atayalim

        metin=metin.replaceAll("\\s","1");

        // ozel karakterlerden kurtulalim
        metin=metin.replaceAll("\\W","");//Java1Candir

        // space yerine atadigimiz 1'i yeniden space yapalim
        metin=metin.replace("1"," ");//Java Candir
        metin=metin+"."; //Java Candir.
        System.out.println(metin);



    }
}
