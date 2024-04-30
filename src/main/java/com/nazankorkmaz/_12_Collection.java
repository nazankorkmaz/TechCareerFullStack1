package com.nazankorkmaz;

import java.util.*;

public class _12_Collection {

    public static void listData(){
        //list --->tekrarlı   List ArrayList:Ekleme ve Arama,

        List<Integer> listem = new ArrayList<>();
        // ArrayList<Integer> listem=new ArrayList<>();
        // List<Integer> listem=new LinkedList<>();

        listem.add(4);
        listem.add(7);
        listem.add(3);
        listem.add(8);
        listem.add(9);

        System.out.println(listem.size());
        System.out.println("Hashcode :"+listem.hashCode());
        System.out.println("Var mı  :"+listem.contains(9)); // 9 numralı data var mı
        System.out.println("Boş mu  :"+listem.isEmpty());

        //Iterative Dongu
        for (int i = 0;i< listem.size() ; i++){
            System.out.print(listem.get(i)+" ");
        }

        System.out.println("İlk indisteki elemanı sildim "+listem.remove(0));
        for (int i = 0;i< listem.size() ; i++){
            System.out.print(listem.get(i)+" ");
        }


        System.out.println("\niterator");
        //Iterator
        Iterator iterator = listem.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"  ");
        }

        //Java 8 Stream().api
        System.out.println("\nStream");
        listem.stream().forEach((temp ->{
            System.out.print(temp +" ");
        } ));


    }

    public static void setData(){
        //set ---> tekrarsız    HashSet, LinkedHashSet, TreeSet
        //map                    HashMap, LinkedHashMap, TreeMap

        Set<Integer> listem = new HashSet<>();
        Set<Integer> listem2 = new LinkedHashSet<>();
        Set<Integer> listem3 = new TreeSet<>();
        //linkedde eklediğin sırada gelir ama üsttekinde kendi kafasına göre sıralar ve verir
        listem.add(4);
        listem.add(4);
        listem.add(7);
        listem.add(3);
        listem.add(8);
        listem.add(9);

        System.out.println("");
        // forEach Döngü
        for (Integer temp :listem) {
            System.out.print(temp+" ");
        }

    }

    public static void mapData(){
        //elimde dataset yok ama anahtar şifre olarak saklamak istiyorum
        //map                    HashMap, LinkedHashMap, TreeMap

        Map<String, String> mapList = new HashMap<>();
        mapList.put("a1","Van");
        mapList.put("a2","Ankara");
        mapList.put("a3","Edirne");
        mapList.put("a4","Sakarya");

       //Key
       for(String key:mapList.keySet()){
           System.out.print(key+" ");
       }

        //Values
        for(String values:mapList.values()){
            System.out.print(values+" ");
        }

        //Key - Value
        System.out.println("\n");
        for(String key:mapList.keySet()){
            System.out.println(key+" "+mapList.get(key));
        }
        System.out.println("For Each ile");
        mapList.entrySet().forEach(System.out::println);
    }


    public static void main(String[] args) {
        //Eleman sayısı belli olmayan yapılardır
        listData();
        System.out.println("SET");
        setData();
        System.out.println("Map");
        mapData();
    }
}
