package com.collage;
import java.util.*;
class Volume{
    double r;
    double h;
    Volume(double radius,double height){
        this.r=radius;
        this.h=height;

    }
    public void vol_Cylinder(){
        double vol= 2* Math.PI*r*r*h;
        System.out.println("Volume of cylinder: "+vol);
    }
}
class factorial {
    public void fact(int n) {
        int i, fact = 1;
        for (i = 1; i <= n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+n +" is: "+fact);
    }
}
class Armstrong_no{
    public void Arm(int n){
        int temp,rem,result=0;
        temp=n;
        while(temp!=0){
            rem=temp%10;
            result +=Math.pow(rem,3);
            temp /=10;
        }
        if(n==result){
            System.out.println(n +" This is Armstrong number");
        }
        else{
            System.out.println(n +" This is not Armstrong number");
        }
    }
}
class Prime_no1{
    public void Prime(int n){
        boolean flag= false;
        for (int i=2;i<=n/2;i++) {
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(n +" This is prime number");
        }
        else{
            System.out.println(n +" This is not prime number");
        }
    }
}
class Palindrome{
    public void Palindrom(int n){
        int rem,temp,sum=0;
        temp=n;
        while(n>0){
            rem= n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(" Number is palindrome");
        }
        else{
            System.out.println(" Number is not palindrome");
        }
    }
}
public class Menu_driven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("1: Volume of cylinder ");
        System.out.println("2: Factorial of number ");
        System.out.println("3: Number is Armstrong number or not ");
        System.out.println("4:  number is Prime number or not");
        System.out.println("5:  Number is Palindrome or not");
        System.out.println("6: Multidimensional addition");
        System.out.println("7: Multidimensional Multiplication");
        System.out.println("100: Exit ");
        System.out.println("**********************************");

      lp:  while(true){
            System.out.println("Enter your choice: ");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter the radius");
                    double a=sc.nextDouble();
                    System.out.println("Enter the height");
                    double b=sc.nextDouble();

                    Volume v=new Volume(a,b);
                    v.vol_Cylinder();
                    break;
                case 2:
                    System.out.println("Enter the number: ");
                    int n=sc.nextInt();
                    factorial f=new factorial();
                    f.fact(n);
                    break;
                case 3:
                    System.out.println("Enter the number: ");
                    int n1=sc.nextInt();
                    Armstrong_no ar=new Armstrong_no();
                    ar.Arm(n1);
                    break ;
                case 4:
                    System.out.println("Enter the number: ");
                    int n2=sc.nextInt();
                    Prime_no1 p=new Prime_no1();
                    p.Prime(n2);
                    break;
                case 5:
                    System.out.println("Enter the number: ");
                    int num=sc.nextInt();
                    Palindrome p1=new Palindrome();
                    p1.Palindrom(num);
                    break;
                case 6:
                    int rows= 2 ,col =3;
                    int [][]a1={{2,4,6},{1,3,5}};
                    int [][]b2={{8,10,12},{11,13,15}};

                    int [][]sum=new int[rows][col];
                    for(int i=0;i<rows;i++){
                        for (int j=0;j<col;j++){
                            sum[i][j]=a1[i][j]+b2[i][j];
                        }
                    }
                    System.out.println("Sum of two matrix: ");
                    for (int []e1:sum) {
                        for (int e2: e1){
                            System.out.print(e2 +"  ");
                        }
                        System.out.println();
                    }
                case 7:
                    int row1=3,col1=3;
                    int[][] x ={{1,2,3},{4,5,6},{7,8,9}};
                    int[][] y ={{1,2,3},{4,5,6},{7,8,9}};

                    int[][] Mul =new int[row1][col1];
                    for (int i=0;i<row1;i++){
                        for (int j=0;j<col1;j++){
                            Mul[i][j]=x[i][j]*y[i][j];
                        }
                    }
                    System.out.println("Multiplication of array: ");
                    for (int[] element1:Mul){
                        for (int element2: element1){
                            System.out.print(element2 + "  ");
                        }
                        System.out.println();
                    }
                case 100:
                    System.out.println("Thank you for visit");
                    break lp;
                default:
                    System.out.println("you choice wrong input please choice right input");
            }

        }

    }
}
