import java.util.Scanner;
public class practiceset7 {
    //METHOD 1
    // public static void table(int x){
    //     for(int i=1;i<=10;i++){
    //         System.out.print(x+"*"+i+"="+(x*i));
    //         System.out.println();
    //     }
    // }

    //METHOD 2
        // public static void pattern(){
        //  for(int i=1;i<=5;i++){
        //     for(int j=0;j<i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //  }
        // }

    //METHOD 3
    // public static int sum(int x){
    //       if(x==0)return(x);
    //       return(x+sum(x-1));
            //}

    //METHOD 4
        // public static void pattern2(){
        //     for(int i=5;i>0;i--){
        //         for(int j=0;j<i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }

    //METHOD 5
        // public static int fibo(int x){
        //     int a=0;
        //     int b=1;
        //     int sum=a+b;
        //     int i=4;
        //     while(i<=x){
        //         a=b;
        //         b=sum;
        //         sum=a+b;
        //         i++;
        //     }
        //     return sum;
    
    // METHOD 6
        // public static int avg(int ... arr){
        //     int sum=0;
        //     int j=arr.length;
        //     for(int x:arr){
        //         sum+=x;
        //     }
        //     return sum/j;
        // }
    // METHOD 7
   
    // METHOD 7

    // METHOD 8
    // public static void pattern3(int n){
    //     if(n>0){
    //         pattern3(n-1);
    //         for(int i=0;i<n;i++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
           
    // METHOD 5 NICE WAY
        // static int fibo(int n){
        //     if(n==1)return 0;
        //     if(n==2)return 1;
        //     else{
        //         return fibo(n-1)+fibo(n-2);
        //     }
        // }


        public static void main(String[] args) {
        // Scanner s=new Scanner(System.in);
        // System.out.print("n: ");
        // int n=s.nextInt(); 

    //QUESTION 1 
        // table(n);
    
    //QUESTION 2
        //pattern();

    //QUESTION 3
        //  System.out.println("sum of first n number =="+sum(n));

    //QUESTION 4
    // pattern2();
      
    //QUESTION 5
        // System.out.println(fibo(n));
 
    //QUESTION 5 fibo nice way
    //   System.out.println(fibo(n));

    //QUESTION 6 FIND AVG OF SET OF NUMBERS PASSED AS AN ARGUMENTS(VARARGS)
        // System.out.println(avg(1,2,3,4,5,6));

    //QUESTION 7 REPEATING 4 THROUGH RECURSION
    
    //QUESTION 8 REPEATING 2 THROUGH RECURSION
        // pattern3(5);
        
    }
}
