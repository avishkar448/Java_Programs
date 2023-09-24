package com.collage;
import java.util.*;
import java.text.SimpleDateFormat;
public class dat {
    public static void main(String[] args) {
        Date d=new Date();

        SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
        String str =dateformat.format(d);
        System.out.println("date : "+str);
    }
}
