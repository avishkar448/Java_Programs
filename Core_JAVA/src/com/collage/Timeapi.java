package com.collage;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Timeapi {
    public static void main(String[] args) {
        //Clock c= Clock.systemDefaultZone();
        Clock c= Clock.systemUTC();
        //System.out.println(c.getZone());
        System.out.println(c.instant());




    }
}
