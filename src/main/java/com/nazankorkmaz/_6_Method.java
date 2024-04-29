package com.nazankorkmaz;

import java.util.Scanner;

public class _6_Method {

    //1-) voidli Parametresiz
    public static void voidliParametresiz(){
        System.out.println("VoidliParametresiz");
    }

    //2-) voidli Parametreli
    public static void voidliParametreli(int x, int y){
        System.out.println("VoidliParametreli : "+(x+y));
    }

    //3-) voidsiz Parametresiz
    public static int voidsizParametresiz(){
        System.out.println("Lütfen bir sayı giriniz: ");

        Scanner klavye= new Scanner(System.in);
        String sNumber = klavye.nextLine();
        int result = Integer.valueOf(sNumber); //stringi integera çevir typecasting
        return  result;
    }

    //4-) voidsiz Parametreli
    public static double voidsizParametreli(int x){

        return  Math.pow(x,2);
    }

    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli(5,6);
        System.out.println(voidsizParametresiz());
        System.out.println(voidsizParametreli(2));
    }
}
