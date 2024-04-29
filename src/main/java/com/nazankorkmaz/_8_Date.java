package com.nazankorkmaz;

import java.util.Date;

public class _8_Date {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date);
        System.out.println(date.getTime()); //1970den beri geçen ms
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getHours()+":"+date.getMinutes());
        date.setHours(5);
        System.out.println(date.getHours()+":"+date.getMinutes()+":"+date.getYear());

    }
}
