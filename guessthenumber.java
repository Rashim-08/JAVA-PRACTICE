import java.util.Random;
import java.util.Scanner;



public class guessthenumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        int n =r.nextInt(100-1+1)+1;
        int k=0;
        int m=1;
        while(m==1){
            System.out.print("Guess your number : ");
            k=s.nextInt();
            if(k<n)System.out.println("guess higher");
            if(k>n)System.out.println("guess lower");
            if(k==n){
                System.out.println("GUESS IS RIGHT!");
                break;
            }
        }
    }
}
