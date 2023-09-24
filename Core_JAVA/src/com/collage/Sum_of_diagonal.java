package com.collage;
class CFG {
    public  void PrintDiagonal(int [][]mat,int n) {
        int pri=0,sec=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==j){
                    pri+=mat[i][j];
                }
                if((i+j)==(n-1)){
                    sec+=mat[i][j];
                }
            }
            System.out.println("Principle Diagonal: "+pri);
            System.out.println("Secondary Diagonal: "+sec);
        }
    }
}
public class Sum_of_diagonal {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        CFG n=new CFG();
        n.PrintDiagonal(a,3);
    }
}
