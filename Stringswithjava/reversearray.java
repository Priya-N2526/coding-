import java.util.*;
public class reversearray {
         public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         int start=0;
         int end=n-1;
         while (start<end){
             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;

         }
         while (start < end) {
            // Swap without using temp variable
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

             start++;
             end--;
         }
         for(int i=0;i<n;i++){
             System.out.print(arr[i]+" ");
         }

         sc.close();
    }

}
