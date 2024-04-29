package com.nazankorkmaz;

import java.util.Scanner;

public class _3_OperatorAndScanner {

    public static void main(String[] args) {
        // class isminde hep buyuk harfle başlamak pascal kuralıdır
        // alttaki camel case

        //Opretator
        int numberDate1 = 7;
        int numberDate2 = 2;
        System.out.println("Toplam : "+(numberDate1+numberDate2));
        System.out.println("Çıkarma : "+(numberDate1-numberDate2));
        System.out.println("Çarpma : "+(numberDate1*numberDate2));
        System.out.println("Bölüm : "+(numberDate1/numberDate2));
        System.out.println("Kalan : "+(numberDate1%numberDate2));


        //Scanner
        Scanner klavye = new Scanner(System.in);
        System.out.println("\nLütfen isminizi girin");
        String name = klavye.nextLine();
        System.out.println("Adınız : " + name);

        //Math
        //String
        //Conditional
        //Date
        //Loop
        //Ecxception Handling
        //Array
        //Collection
        //OOP
        //Inheritance
        //Abstract

    }
}
