package day04_dataCasting_wrapperClass;

public class c05_WrapperClasses {
    public static void main(String[] args) {
         int sayi2=5;
         Integer sayi3=sayi2;
         int sayi4=sayi3;
         System.out.println(Integer.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        String str1="22";
        String str2="33";
        System.out.println(str2+str1);
        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));

        char ch1='7';
        System.out.println(Character.isDigit(ch1));//karakter mi diye kontrol eder
        System.out.println(Character.isLetter(ch1));//harf mi diye kontrol eder
        System.out.println(Character.isWhitespace(ch1));// boşluk mu diye kıntrol eder



    }
}
