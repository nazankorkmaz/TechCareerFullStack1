package com.nazankorkmaz;

public class _5_String {
    public static void main(String[] args) {
        String vocabulary = " Java Öğreniyorum JAva";
        System.out.println(vocabulary);

        System.out.println(vocabulary.length());
        System.out.println(vocabulary.trim().length());  //baş ve sondaki boşlukları da sayar

        System.out.println(vocabulary.toLowerCase());
        System.out.println(vocabulary.toUpperCase());
        System.out.println(vocabulary.charAt(2)); //ordaki harfi döner
        System.out.println(vocabulary.indexOf("JAva")); //baştan aramaya başlar
        System.out.println(vocabulary.lastIndexOf("JAva"));
        System.out.println(vocabulary.lastIndexOf("Nazan")); //bulamazsa -1 döner

        System.out.println(vocabulary.substring(2)); //2den başlayarak yazar
        System.out.println(vocabulary.substring(2,5));

        System.out.println(vocabulary.startsWith(" ")); //boşlukla başlıyorsa true döner
        System.out.println(vocabulary.endsWith("a"));

        System.out.println(vocabulary.concat(" sonuna ekle"));

        System.out.println(vocabulary.contains("java")); //varsa true döner
        System.out.println(vocabulary.replace(vocabulary,"xyz"));  //yer değiştirdi

    }
}
