package javaproblems;

import java.util.Scanner;

public class tarinsetproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int birthnumber=sc.nextInt();
        if(birthnumber>0 && birthnumber<73){
            switch (birthnumber%8) {
                case 1:
                case 4:
                    System.out.println(birthnumber +" is lower berth");  
                    break;
                case 2:
                case 5:
                    System.out.println(birthnumber +" is middle berth");  
                    break;
                case 3:
                case 6:
                    System.out.println(birthnumber +" is upper berth");  
                    break;
                case 7:
                    System.out.println(birthnumber +" is side lower berth");  
                    break;
                case 0:
                    System.out.println(birthnumber +" is side upper berth");  
                    break;
            }

        }
    }
    
}
