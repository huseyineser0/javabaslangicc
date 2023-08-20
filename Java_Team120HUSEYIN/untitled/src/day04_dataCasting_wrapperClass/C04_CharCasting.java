package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {

        //kullanıcıdan char isteyin
        //girilen chradan sonraki gelen 3 karakteri yazdırın
        // orn: input:a output:b,c,d

        Scanner scan=new Scanner(System.in);
        System.out.print("lütfen ascii tablosundan bir karakter girin:");
        char girilenkrk=scan.next().charAt(0);
        //Scanner.nextChar() methodu olmadıgından
        // once .next() ileString olarak alıp sonra Stringin ilk karakterini alalım

        System.out.println("girilen karakter: " +girilenkrk);

        System.out.println("girilen karakterden sonraki 3 karakter :"+
                (char)(girilenkrk+1)+","+
                (char)(girilenkrk+2)+","+
                (char)(girilenkrk+3));
    }
}
