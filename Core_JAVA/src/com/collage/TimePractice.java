package com.collage;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class TimePractice {
    public static void main(String[] args) {
      /*  ArrayList ar=new ArrayList();
        ar.add("AVISHKAR");
        ar.add("OMKAR");
        ar.add("HRITIK");
        ar.add("SALMAN");
        ar.add("SHARUKH");
        ar.add("VIRAT");
        ar.add("VIJAY");
        ar.add("ALLU ARJUN");
        ar.add("MAHESH");
        ar.add("ROHIT");
        for (Object o:ar) {
            System.out.println(o);
        }*/

      /*  HashSet<Integer>S =new HashSet<>();
        S.add(4);
        S.add(5);
        S.add(6);
        S.add(7);
        S.add(46);
        S.add(4);
        S.add(5);
        System.out.println(S);

       */
        Date d=new Date();
      //  DateTimeFormatter df=DateTimeFormatter.();
        System.out.println(d.getHours()+":"+ d.getMinutes()+":"+d.getSeconds());

        Calendar c=Calendar.getInstance();
        System.out.println(+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        LocalDateTime dw=LocalDateTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("H:m:s");
        String s=df.format(dw);
        System.out.println(s);
    }
}
