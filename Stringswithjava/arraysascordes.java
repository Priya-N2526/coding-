import java.util.Scanner;

public class arraysascordes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean asc=true;
        boolean des=true;

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                asc=false;
            }
            if(arr[i]<arr[i+1]){
                des=false;
            }
        }
        if(asc){
            System.out.println(asc);
        }
        else{
            System.out.println(des);

        }
        sc.close();
    }
}
