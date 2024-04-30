package com.nazankorkmaz;

public class _9_Loop {

    public static void forLoop(){
        for (int i=0 ; i<10 ; i++){
            System.out.print(i + " ");
        }

        //for sonsuz döngüsü
        //for (;;){}
    }

    public static void whileLoop(){
        int i=0 ;
        System.out.println("\nwhile döngüsü");
        while ( i<10){
            System.out.print(i + " ");
            i++;
            // i=i+1;
        }

        //while sonsuz döngüsü
        //while(true){}
    }

    public static void doWhileLoop(){
        int i=0 ;
        System.out.println("\n Do while döngüsü");
        //Global variable---> herkes tarafından
        //local variable----> sadece o lokalizasyonda var

        //yani i'yi do da tanımlasan whileda görmez haat verir

        do{
            System.out.print(i + " ");

            i+=1;
        } while ( i< -10);

    }

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhileLoop();
    }
}
