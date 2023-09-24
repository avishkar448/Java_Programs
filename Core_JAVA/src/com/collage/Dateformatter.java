package com.collage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dateformatter extends Thread {
    public static void main(String[] args) {
        LocalDateTime dt= LocalDateTime.now();
        System.out.println("The current date is: "+dt);

        DateTimeFormatter df=DateTimeFormatter.ISO_ORDINAL_DATE;
        String my=dt.format(df);
        System.out.println("Date after DateTimeformmater: "+ my);


    }
}
