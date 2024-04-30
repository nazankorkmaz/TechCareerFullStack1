package com.nazankorkmaz;

import java.io.IOException;

public class _10_ExceptianHandling {

    public static void main(String[] args) throws ArithmeticException, IOException {//ilerde hata fırlatma var uyarısı

        System.out.println("1. alan çalıştı");

        System.out.println(0/4);

        try{
            System.out.println(4/0);

        }catch (ArithmeticException ari){
            System.out.println(ari);    //yine hata verir ama son bölgeyi de çalıştırır
            ari.printStackTrace();
        }catch (Exception exp){
            System.out.println(exp);
            exp.printStackTrace();
        }finally {
            System.out.println("2. alan çalıştı");

        }

        //bilerek istisna fırlatma
        throw new ArithmeticException("sifira neden boldun?");


        //System.out.println("Son alan çalıştı");
    }
}
