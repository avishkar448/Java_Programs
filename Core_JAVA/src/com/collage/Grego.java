package com.collage;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Grego {
    public static void main(String[] args) {
        GregorianCalendar g=new GregorianCalendar();
        //System.out.println(g.isLeapYear(2020));
        //System.out.println(g.isLeapYear(2021));
        System.out.println("Date before rolling: "+g.getTime());
        g.roll(Calendar.MONTH,true);
        g.roll(Calendar.DATE,false);
        g.roll(Calendar.YEAR,true);

        System.out.println("Date after rolling : "+g.getTime());
        System.out.println("Hash code: "+g.hashCode());

        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);

    }
}
