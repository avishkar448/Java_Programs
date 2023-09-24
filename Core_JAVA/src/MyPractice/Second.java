package MyPractice;

public class Second {
    public static void main(String[] args) {
        int[] a ={2,1,3,4,5,6,7,8};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("second smallest: "+a[1]);
        System.out.println("second largest: "+a[a.length-2]);
    }
}
