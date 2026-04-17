import java.util.Scanner;
class ageexception extends Exception{
    public String getMessage(){
        return "invalid age\n LOGICAL ERROR";
    }
}
class self extends Exception{
    public String getMessage(){
        return "negative number\n ARITHMETIC ERROR";
    }
}
class array extends Exception{
    public String getMessage(){
        return "array out of range";
    }
 }
public class practiceset14 {
    //Question2--- ARITHMETIC AND LOGICAL EXCEPTION SHOWN
    // public static void setage(int age){
    //     try{
    //         if(age>120 || age<0){
    //         throw new ageexception();
    //         }
    //         System.out.println(age);
    //     }
    //     catch(Exception e){
    //         System.out.println(e.getMessage());
    //     }
    //     finally{
    //         //to show arithmetic error
    //         int a=-4;
    //         try{
    //             if(a<0)throw new self();
    //             System.out.println(a);
    //         }
    //         catch(Exception e){
    //             System.out.println(e.getMessage());
    //         }
    //     }
    
    // }

    // Question 4-----wraping the araay custome exception into a method
    public static void tarray(int k){
        boolean t=true;
        int x=0;
        Scanner s=new Scanner(System.in);
            while(t){
                try{
                if(x>=k){
                     t=false;
                    throw new array();
                    
                }
                System.out.println("enter:");
                s.nextInt();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
            x++;
        }
    }


    
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        boolean t=true;
        //QUESTION1--------
        //  int age=130;
        //  setage(age);

        //QUESTION2--------
        // int []n=new int[3];
        // int l=0;
        // boolean f=true;
        // while(f){
        //     try{
        //         System.out.println("numbers:");
        //         n[l]=sc.nextInt();
        //         l++;
        //     }
        //     catch (ArrayIndexOutOfBoundsException e){
        //         System.out.println("exception occured");
        //     }
        // }

        // QUESTION3----------
    //     int []m=new int[5];
    //     int j;
    //     int k=0;
    //     while(t){
    //         System.out.println("enter your number: ");
    //         j=sc.nextInt();
    //         try{
    //             if(k>=m.length){
    //                 t=false;
    //                 throw new array();
    //             }
    //          m[k]=j;
    //         }
    //         catch(array e){
    //            System.out.println(e.getMessage());
    //         }
    //         k++;
    //     }
    //     for(int x:m){
    //         System.out.print(x+",");
    //     }
        
        //QUESTION4-------
        int []h=new int[4];
        int o=h.length;
         tarray(o);

    }
}



