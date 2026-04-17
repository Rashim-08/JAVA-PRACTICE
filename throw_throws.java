import java.util.Scanner;

class myexception extends Exception{
    @Override
    public String toString(){
        return "Radius cant be negative";
    }
}



public class throw_throws {
//     public static double area(int r)throws myexception{
//     if(r<0){
//         throw new myexception();
//     }
//     return Math.PI*r*r;
// }
    public static void main(String[] args) {
        // int radius;
        // Scanner sc=new Scanner(System.in);
        // System.out.print("give radius:");
        // radius=sc.nextInt();
        // try{
        //     System.out.println(area(radius));
        // }
        // catch(Exception e){
        //    System.out.println(e.toString());
        // }
        int a=5;
        for(int i=5;i>-1;i--){
          //if(i==3)break;
          try{
             if(i==3)break;
            System.out.println(a/i);
          }
          catch(Exception e){
            System.out.println("exception");
          }
          finally{
            System.out.println("at level"+ i);
          }

          //when the if condition if executed int the try block ... still the finally block will exeecute for
          //because the try block was started
           /*you can also break the loop in the catch bloock... that is break the loop when exceptions occur */
        }

    }
}
