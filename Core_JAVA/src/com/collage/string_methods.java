package com.collage;

public class string_methods {
    public static void main(String[] arg){
        String str="Avishkar";
        System.out.println(str);

        String name= "LOVE YOU 3000";
        System.out.println(name);

        // length
        int value =str.length();
        System.out.println(value);

        //to lowercase
        String lower= name.toLowerCase();
        System.out.println(lower);

        //to upper case
        String upper=str.toUpperCase();
        System.out.println(upper);

        //trim
        String A="  CAPTAIN AMERICA   ";
        String T=A.trim();
        System.out.println(T);

        //substring
        String subs=str.substring(2);
        System.out.println(subs);

        //substring 2
        String sub=str.substring(3,7);
        System.out.println(sub);

        //replace
        String Re=str.replace('k','c');
        System.out.println(Re);

        //start with and end with
        System.out.println(name.startsWith("LOVE"));
        System.out.println(name.endsWith("10000"));

        //charAt
        System.out.println(str.charAt(3));

        //indexof
        String str3="iloveindia";
        System.out.println(str3.indexOf("n"));
        System.out.println(str3.indexOf("i",1));

        //lastindex of str
        System.out.println(str3.lastIndexOf("n"));
        System.out.println(str3.lastIndexOf("d",3));

        //equal
        System.out.println(name.equals("LOVE YOU 3000"));
        //equals ignore case
        System.out.println(str.equalsIgnoreCase("AVISHKAR23"));

        //QUESTONS
        String letter="Dear <|name|>,Thanks a lot!";
        letter=letter.replace("<|name|>","Virat");
        System.out.println(letter);

        //2
        String myname="hi my name is Avishkar";
        System.out.println(myname.indexOf("  "));
        System.out.println(myname.indexOf(" "));

        //3
        String myletter="Dear avi,\n\tplease go to collage.\nThanks!";
        System.out.println(myletter);




    }
}
