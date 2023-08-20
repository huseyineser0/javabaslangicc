package day10_switchCase_StringManipulations;

import java.util.Locale;

public class C04_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str="Java Candır";

        System.out.println(str.toUpperCase());//JAVA CANDIR

        str=str.toLowerCase();
        System.out.println(str);//java candır normalde ing klavye olsaydı java candir yazdırırdı
        // o zamanda şu komutu kullanmalıyız " Locale.forLanguageTag("Tr") "
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));
    }
}
