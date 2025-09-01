package javaproblems;

import java.util.*;
public class majoritynumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int element=0;
        for(int i=0;i<arr.length;i++){
            int count1=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count1++;
                }
            }
            if(count1>count){
                count=count1;
                element=arr[i];
            }
        }
        if(count>n/2){
            System.out.println("majerioty element is :"+element);
        }
        else{
            System.out.println("No majerioty element is present");
        }
        
    }
}
