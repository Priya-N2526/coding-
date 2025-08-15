import java.util.Scanner;
public class distanceshortest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='N'){
                x++;
            }
            else if(curr=='S'){
                x--;
            }
            else if(curr=='E'){
                y++;
            }
            else if(curr=='W'){
                y--;
            }
        }
        System.out.println("Current Position: (" + x + ", " + y + ")");
        double dis=Math.sqrt(y*y + x*x);
        System.out.println("Shortest Distance: " + dis);
        
        sc.close();
    }
}