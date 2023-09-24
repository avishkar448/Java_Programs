package com.collage;
import java.util.Scanner;

public class CBSE_Marks {
    public static void main(String[] args) {
        System.out.println("Report card of student: ");
        Scanner as=new Scanner(System.in);

        System.out.println("The marks of English: ");
        float E= as.nextFloat();

        System.out.println("The marks of Physics: ");
        float P= as.nextFloat();

        System.out.println("The marks of Chemistry: ");
        float C= as.nextFloat();

        System.out.println("The marks of Biology: ");
        float B= as.nextFloat();

        System.out.println("The marks of Maths: ");
        float M= as.nextFloat();

        System.out.println("The marks of Marathi: ");
        float MA= as.nextFloat();
        //percentage of student

        System.out.println("sum of marks is: ");
        float sum=E+P+C+B+M+MA;
        System.out.println(sum);

        System.out.println("percentage of student: ");
        float per=sum/6;
        System.out.println(per);

        //CGPA
        System.out.println("CGPA is: ");
        float cgpa=sum/60;
        System.out.println(cgpa);
    }

}
