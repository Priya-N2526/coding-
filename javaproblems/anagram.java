package javaproblems;
import java.util.*;
public class anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        char[] arr1=str1.toCharArray();
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else if(arr1==arr2) {
            System.out.println("It may be");
        }
        else{
            System.out.println("not a Anagram");
        }


    }
}
