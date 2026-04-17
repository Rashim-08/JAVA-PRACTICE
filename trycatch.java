import java.util.Scanner;

class myexception extends Exception{
    myexception(String msg){
        super(msg);
    }
}
public class trycatch {
    public static void main(String[] args) {
        // int a=1000;
        // int b=0;
        // //with trycatch block
        // try{
        //     int c=a/b;
        //     System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println("failed");
        //     System.out.println(e);
        // }
        // System.out.println("code ended");

        Scanner sc=new Scanner(System.in);
        int []m=new int[3];
        m[0]=56;
        m[1]=3;
        m[2]=20;

        // System.out.print("enter index:");
        // int n=sc.nextInt();
        // System.out.print("enter number to divide it with:");
        // int n1=sc.nextInt();
        // try{
        //     System.out.printf("number at the index %d : %d",n,m[n]);
        //     System.out.println();
        //     System.out.println("answer to the division:"+(m[n]/n1));
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e);
        // }

        //perforeming nested try and catch 

        boolean flag =true;
    //     while (flag) {

    //     System.out.print("enter index:");
    //     int n=sc.nextInt();

    //     System.out.print("enter number to divide it with:");
    //     int n1=sc.nextInt();

    //        try{
    //         System.out.printf("number at the index %d : %d",n,m[n]);
    //         System.out.println();

    //         try{
    //         System.out.println("answer to the division:"+(m[n]/n1));
    //         flag=false;
    //         }
    //         catch(ArithmeticException e){
    //             System.out.println("at level 2");
    //             System.out.println(e);
    //         }
    //     }
    //     catch(Exception e){
    //         System.out.println("at level 1");
    //         System.out.println(e);
            
            
    //     }
    // }
    // System.out.println("loop ended");


    //CUSTOMISED EXCEPTION LEARNING

    int a;
    
    while(flag){
        System.out.print("enter value: ");  
        a=sc.nextInt();

        if(a<0){
            try{
                throw new myexception("cant be negative");
                
            }
            catch(Exception e){
            // System.out.println(e.getMessage());
    
                flag = false;
            }
        }
        else System.out.println("end");

      }
    }
}



