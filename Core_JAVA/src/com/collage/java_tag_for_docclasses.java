package com.collage;

/**
 * This class is demostrat what is java documentation
 * @author Avishkar
 * @version 2.0
 * @since 2003
 *
 */
public class java_tag_for_docclasses {
    /**
     *hello this a quick guied
     * @param a This is a first no
     * @param b this is a second number
     * @return it gives multiplication of two number
     * @deprecated this method is depricated
     */
    public static int add(int a,int b){
        int c=a*b;
        return c;
    }
    public static void main(String[] args) {
        System.out.println("Hi welcome to code");

        System.out.println(add(3,5));
    }


}
