package day09_NestedIfElseStatements_Ternary;

import java.util.Scanner;

public class C02_IndirimHesaplama{
    public static void main(String[] args) {

        //Soru 2- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin


        Scanner scan=new Scanner(System.in);
        System.out.print("ürün adedi:");
        int adet = scan.nextInt();
        System.out.print("liste fiyatı:");
        double fiyat= scan.nextDouble();

        System.out.println("müsteri kartı var mı: EVET:E  HAYIR:H");
        char kartvarmı=scan.next().charAt(0);

       if (kartvarmı=='E'){
           if (adet>10){
               System.out.println("indirimli hali:"+adet*(fiyat-(fiyat*20/100)));

           } else{
               System.out.println("indirimli hali:"+adet*(fiyat-(fiyat*15/100)));
           }

       }  else if(kartvarmı=='H'){
           if (adet>10) {
               System.out.println("indirimli hali:" + adet*(fiyat-(fiyat*15/100)));
           }else {
               System.out.println("indirimli hali:"+adet*(fiyat-(fiyat*10/100)));
           }
       }else {
           System.out.println("hatalı karrt girişi");
       }
    }
}
