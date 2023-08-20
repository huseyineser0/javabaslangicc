package day08_IfElseIfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi isteyin
        // Sayi 3' e bolunuyorsa 3'un kati
        // sayi 5'e bolunuyorsa 5'in kati
        // ikisine birden bolunuyorsa super sayi
        // ikisine de bolunmuyorsa yaramaz sayi yazdirin

        // ahmet hocanın yaptığı doğru kod

        Scanner scanner=new Scanner(System.in);
        System.out.println("tam sayi girin");
        int say=scanner.nextInt();


        if (say%3==0 && say%5==0){
            System.out.println("super sayi");
        } else if (say%3==0) {
            System.out.println("3'ün katı");

        } else if (say%5==0) {
            System.out.println("5'in katı ");

        }else {
            System.out.println("yaramaz sayi");
        }




        // biizm istediğimiz kod bu değil
       /*
        Scanner scan=new Scanner(System.in);
        System.out.print("tam sayi girin");
        int sayi=scan.nextInt();

        if (sayi%3==0){
            System.out.println("3'ün katı");
        }  if(sayi%5==0) {
            System.out.println("5'e bölünür");
        }
        if (sayi%3==0 && sayi%5==0){
            System.out.println("super sayı");
        }else {
            System.out.println("yaramaz sayi");
        }
        */



    }








}
