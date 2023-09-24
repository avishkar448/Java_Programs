package com.collage;

public class array{
    public static void main(String[] args) {
        float [] marks={34.1f,67.4f,98.7f,67.98f,34.6f};
        float sum= 0;
        float num=35.1f;
        boolean isInArray =false;
        for(float element: marks){
         sum = sum + element;
         if(num==element){
             isInArray = true;
             break;
         }
        }
        if(isInArray){
            System.out.println("The value is present in array");
        }
        else{
            System.out.println("The value is not is present in array");
        }
        System.out.println("The value of sum is: "+sum);

    }
}