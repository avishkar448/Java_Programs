package com.collage;
import java.util.*;
public class date {
    public static void main(String[] args) {

        //System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("The maximum value of long: "+Long.MAX_VALUE);
        System.out.println("The  value of current time : "+System.currentTimeMillis());

        Date d=new Date();
        System.out.println("The current date is: "+d);

        Date d1=new Date(2027,1,12);
        System.out.println(d1.compareTo(d));
        System.out.println("The number "+d1.getTime()/1000/3600/24/365);

        System.out.println("The current Date:"+d.getDate());
        System.out.println("The current Month:"+d.getMonth());
        System.out.println("The current year:"+d.getYear());
        System.out.println("The current year:"+d.getSeconds());



    }
}
