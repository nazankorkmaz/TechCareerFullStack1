package com.nazankorkmaz;

public class _1_WhatIsJava {
    //Single Comment
    /*Multiple Comment*/
    //psvm yazarsan public static void çıkar yapısı
    //psvm olmazsa java çalışmaz
    public static void main(String[] args) {
        System.out.println("Merhabalar nasılsınız"); //sout yazınca çıkar

        //Variable
        //tam sayılar
        byte b1=25;
        System.out.println(b1);
        short s1=125;
        int i1=45456;
        long l1=546464556;

        //virgullu sayılar
        float f2=14.53f;
        double d2=123565.5556;

        char c3='2';
        boolean b3 = 3>1;
        System.out.println(b3);

        // primitive type - Wrapper ARASTIR nedirler ne ise yarar

        int primivitive = 44;
        // veremezsin primivitive =null;
        Integer objectInt = 44;
        objectInt = null;

        //zero ile null aynı şey değil
        //null : dünyaya gelmemiş
        //create : dünyaya gelmiş
        //zero : dünyay gelmiş ancak bir etki gücüne sahip değildir




    }
}
