package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        // kullanicidan notunu isteyin
        // 50 ve uzeri ise sinifi gectin
        // degilse maalesef kaldin yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("notunu gir:");
        double not=scan.nextDouble();
        if (not>=50){
            System.out.println("geçtin");
        }else {
            System.out.println("kaldın");
        }




    }
}
