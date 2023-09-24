package com.collage;
import java.io.*;
public class Prime_args {
    public static void main(String[] args) throws IOException {
        int i,num,count;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        num=Integer.parseInt(args[0]);
        int[] a =new int[num];
        System.out.println("enter "+num+" numbers");

        for ( i=0;i<num;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("enter array is: ");
        for (i=0;i<num;i++) {
            System.out.println(" "+a[i]);
        }
        System.out.println();
        System.out.println("The prime number are");
        for( i=0;i<a.length;i++){
            count=0;
            for(int j=2;j<a[i];j++){
                if(a[i]%j==0){
                    count ++;
                    break;
                }
            }
            if(count==0){
                System.out.println(a[i]+" ");
            }
        }    }
}
