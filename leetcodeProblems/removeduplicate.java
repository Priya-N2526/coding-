package leetcodeProblems;
import java.util.Scanner;
public class removeduplicate {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    int k = removeDuplicates(nums);
    for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
    }
    System.out.println(k);
    }
    ////////////////////sorted duplicate
    // This method removes duplicates from a sorted array and returns the new length
    public static int removeDuplicates(int[] nums) {
        int k=1;
        for(int i=1;i<nums.length;i++){
                if(nums[i-1]!=nums[i]){
                    nums[k]=nums[i];
                    k++;
                }
        }
        return k;
    }
    public static void unorderedduplicate(int[] nums){
        /////////////////for unsorted array
    // This method removes duplicates from an unsorted array and returns the new length
        int k=0;
        for(int i=0;i<nums.length;i++){
            boolean flag = false;
            for(int j=0;j<k;j++){
                if(nums[i]==nums[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);
    }
}


