import java.util.Scanner;
public class longestString {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String[] str=new String[n];
    String str1= "";
    for(int i=0;i<n;i++){
        str[i]=sc.next();
    }
    for(String word:str){
        if(word.length()>str1.length()){
            str1=word;
        }
    }
    System.out.println(str1);
    }
    
}
