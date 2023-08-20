package day08_IfElseIfStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //         girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen bir karakter girin : ");
        char karakter=scan.next().charAt(0);
        // kullanici ne kadar uzun kelime veya kelimeler girse de ilk karakteri alir


        if (karakter>='a' && karakter<='z'){
            System.out.println("küçük karakter");

        }else {
            System.out.println("büyük karakter");
        }
    }
}
