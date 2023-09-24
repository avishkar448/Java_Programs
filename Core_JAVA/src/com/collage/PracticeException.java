package com.collage;
class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Invalied input 8 and 9" ;
    }
}
class CannotDivide extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }
}
class MaxInput extends Exception{
    public String toString(){
        return "Input value cannot be greater than 100000";
    }
}
class MaxSubInput extends Exception{
    @Override
    public String toString() {
        return "Inpute cannot be greater than 70000";
    }
}
class CustomCalculator {
    double add1(double a,double b)throws InvalidInputException{
        if(a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a+b;
    }
    double mul(double a,double b) throws MaxInput{
        if(a>100000 || b>100000){
            throw new MaxInput();
        }
        return a*b;
    }
    double sub(double a,double b) throws MaxSubInput{
        if (a>7000 || b>7000){
            throw new MaxSubInput();
        }
        return a-b;
    }
    double div(double a,double b) throws CannotDivide{
        if(b==0){
            throw new CannotDivide();
        }
        return a/b;
    }
}



public class PracticeException {
    public static void main(String[] args) throws InvalidInputException,CannotDivide,MaxInput,MaxSubInput{
        CustomCalculator C=new CustomCalculator();

        System.out.println("Addition: "+ C.add1(4,5));
        System.out.println("Division: "+ C.div(3,10));
        System.out.println("Multiplication: "+C.mul(21,100));
        System.out.println("Substraction: "+C.sub(6999,322));

    }
}
