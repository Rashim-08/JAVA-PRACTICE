import java.util.Random;
import java.util.Scanner;
public class rockpapersessors {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        Random r=new Random();
        int num=r.nextInt(3-1+1)+1;
        System.out.println("enter your choice \n rock=1\n scissorr=2\n paper=3");
        int k=s.nextInt();
        System.out.println(num+ "," +k );
        if(num==k)System.out.println("its an tie");
        else if(num==1){
                if(k==2)System.out.println("computer win");
                if(k==3)System.out.println("you win");
        }
        else if(num==2){
            if(k==3)System.out.println("computer win");
                if(k==1)System.out.println("you win");

        }
        else if(num==3){
            if(k==1)System.out.println("computer win");
                if(k==2)System.out.println("you win");
        }

        
        
            
    }
}
