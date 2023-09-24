package com.collage;
import java.io.IOException;
import java.util.*;
class CricketPlayer{
   String name;
   int inning ,Notout,totalruns;
   float batavg;
   public CricketPlayer(){
       name=null;
       inning=0;
       Notout=0;
       totalruns=0;
       batavg=0;
   }
   public void get() throws IOException{
       Scanner sc=new Scanner(System.in);
       System.out.println("Name of player: ");
       name= sc.nextLine();
       System.out.println("No of innings: ");
       inning= sc.nextInt();
       System.out.println("Name of times Not out: ");
       Notout=sc.nextInt();
       System.out.println("Total runs: ");
       totalruns= sc.nextInt();
   }
   public void put(){
       System.out.println("**************************");
       System.out.println("Player Name: "+name);
       System.out.println("No.of.innings: "+inning);
       System.out.println("No. times not out: "+Notout);
       System.out.println("Total runs: "+totalruns);
       System.out.println("bat avg: "+batavg);
       System.out.println("*****************************");
   }
   static void avg(int n, CricketPlayer[] c){
       try {
           for (int i=0;i<n;i++){
               c[i].batavg= c[i].totalruns / c[i].inning;
           }
       }
       catch (ArithmeticException e){
           System.out.println(e);
       }
   }
   static void sort(int n, CricketPlayer[] c){
       String temp1;
       int temp2,temp3,temp4;
       float temp5;
       for (int i=0;i<n;i++){
           for (int j=i+1;j<n;j++){
               if(c[i].batavg<c[j].batavg){
                   temp1=c[i].name;
                   c[i].name=c[j].name;
                   c[j].name=temp1;

                   temp2=c[i].inning;
                   c[i].inning=c[j].inning;
                   c[j].inning=temp2;

                   temp3=c[i].Notout;
                   c[i].Notout=c[j].Notout;
                   c[j].Notout=temp3;

                   temp4=c[i].totalruns;
                   c[i].totalruns=c[j].totalruns;
                   c[j].totalruns=temp4;

                   temp5=c[i].batavg;
                   c[i].batavg=c[j].batavg;
                   c[j].batavg=temp5;
               }
           }
       }
   }
}
public class Cricket {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n=sc.nextInt();
        CricketPlayer[] c =new CricketPlayer[n];
        for (int i=0;i<n;i++){
            c[i]=new CricketPlayer();
            c[i].get();
        }
        CricketPlayer.avg(n,c);
        CricketPlayer.sort(n,c);
        for (int i=0;i<n;i++){
            c[i].put();
        }
    }
}
