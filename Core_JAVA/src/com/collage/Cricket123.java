package com.collage;
import java.util.*;
class Cric{
    String name;
    int ing;
    int notout;
    int trun;
    double bavg;
    Cric(){
        name=null;
        ing=0;
        notout=0;
        trun=0;
        bavg=0;
    }
    public void get(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter details: ");
        name= sc.next();
        ing= sc.nextInt();
        notout= sc.nextInt();
        trun= sc.nextInt();
    }
    public void put(){
        System.out.println("Name: "+name);
        System.out.println("no of inning: "+ing);
        System.out.println("not out: "+notout);
        System.out.println("total run: "+trun);
        System.out.println("batting avg: "+bavg);
    }
    static void avg(int n , Cric[] c){
        try{
            for(int i=0;i<n;i++){
                c[i].bavg=c[i].trun/c[i].ing;
            }
        }
        catch (ArithmeticException e){
            System.out.println(e);

        }
    }
    static void sort(int n, Cric[] c){
        String temp1;
        int temp2,temp3,temp4;
        double temp5;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(c[i].bavg<c[j].bavg){
                    temp1=c[i].name;
                    c[i].name=c[j].name;
                    c[j].name=temp1;

                    temp2=c[i].ing;
                    c[i].ing=c[j].ing;
                    c[j].ing=temp2;

                    temp3=c[i].notout;
                    c[i].notout=c[j].notout;
                    c[j].notout=temp3;

                    temp4=c[i].trun;
                    c[i].trun=c[j].trun;
                    c[j].trun=temp4;

                    temp5=c[i].bavg;
                    c[i].bavg=c[j].bavg;
                    c[j].bavg=temp5;
                }
            }
        }
    }
}
public class Cricket123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=sc.nextInt();
        Cric[] c =new Cric[n];
        for (int i=0;i<n;i++){
            c[i]=new Cric();
            c[i].get();
        }
        Cric.avg(n,c);
        Cric.sort(n,c);

        for(int i=0;i<n;i++){
            c[i].put();
        }
    }
}
