package com.nazankorkmaz;

import java.util.Arrays;

public class _11_Array {

    public  static void arrayData(){

        int[] dizi = new int[9] ; //new oluşturmak demek
        //eleman sayısı belli olan dizilere array denir

        dizi[0]=1;
        dizi[1]=2;
        dizi[2]=3;
        dizi[3]=4;
        dizi[8]=9;

        System.out.println("length : "+dizi.length);
        System.out.println(dizi[0]);
        System.out.println(dizi[5]); // 0 koydu

        //Iterative For
        for (int i=0; i<dizi.length; i++){
            System.out.print(dizi[i]+" ");
        }  // ama bu 9 yazarsan length yerine array sayısı artarsa hata verir index out of range verir


        System.out.println("\n");
        //For Each  -----> Bu daha çok kullanılıyor
        for(int temp: dizi){
            System.out.println(dizi+" ");
            System.out.println(temp+" ");
        }

        int[] cloneDizi = dizi.clone();
        for(int temp: cloneDizi){
            System.out.print(temp+" ");
        }

        //hashCode parmak izidir yani
        System.out.println("\n Hash Code: "+dizi.hashCode());
        /*
        Bu, dizi nesnesinin özel bir tamsayı değerini döndürecek.
        Bu değer, dizi nesnesinin bellekteki benzersiz temsili hakkında bilgi içerir ve
         bu nesnenin farklı nesnelerle karşılaştırılmasında kullanılabilir.
        */

        Arrays.sort(cloneDizi);
        for(int temp : cloneDizi ){
            System.out.print(temp+" ");
        }

    }

    public static void main(String[] args) {

        arrayData();
    }
}
