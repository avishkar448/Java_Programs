package MyPractice;

public class Wrap {
    public static void main(String[] args) {
        int a=10;
        Integer a1=a;
        System.out.println("Wrapper class "+a1);
        System.out.println(" class "+a);


        int a2=a1;
        System.out.println("int: "+a2);

        int x=12;
        String str=Integer.toString(x);
        System.out.println(str);

        String str2="12344555";
        int y=Integer.parseInt(str2);
    }
}
