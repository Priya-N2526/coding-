package javaproblems;
import java.util.*;
public class linearsearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Element found at index"+i);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("Element not found");
        }

    }
    
}
