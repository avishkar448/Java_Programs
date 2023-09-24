package MyPractice;

public class Wrapper {
    public static void main(String[] args) {
        int a=12;
        float b=12.5433f;

        Integer a1=a;
        Float b1=b;

        System.out.println("a object: "+a1);
        System.out.println("b object: "+b1);

        int a2=a1;
        float b2=b1;

        System.out.println("a: "+a2);
        System.out.println("b: "+b2);

        int n1=3232;
        String str1=Integer.toString(n1);

        System.out.println("str1: "+str1);

        int n2=Integer.parseInt(str1);
        System.out.println("n2: "+n2);
    }
}
