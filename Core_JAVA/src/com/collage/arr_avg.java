package com.collage;

public class arr_avg {
    public static void main(String[] args) {
        float [] marks={87.97f,78.65f,87.76f,90.65f,78.76f};
        float sum=0;
        for(float element: marks){
            sum=sum +element;
        }
        System.out.println("The average of marks is " +sum/marks.length);
    }
}
