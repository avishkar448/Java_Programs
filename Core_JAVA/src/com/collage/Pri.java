package com.collage;

public class Pri {
    public static void main(String[] args) {
        int count;
        int[] n ={12,35,56,76,43,88,90,3,13};
        for(int i=0;i<n.length;i++){
             count=0;
            for(int j=2;j<n[i];j++){
                if (n[i]%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.println(n[i]+" ");
            }
        }

    }
}
