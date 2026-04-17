import java.util.Scanner;
public class practiceset3 {
    public static void main(String[] args) {
        String n ="  rashi   ";
        System.out.println(n.toUpperCase());
        System.out.println(n.toLowerCase());
        System.out.println(n.substring(3));
        System.out.println(n.replace(" ", "_"));

        Scanner sc =new Scanner(System.in);
        System.out.println("enter number : ");
         int a =sc.nextInt();
         switch(a){
            case 1: System.out.println("monday");break;
            case 2: System.out.println("tuesday");break;
             case 3: System.out.println("wednesday");break;
            case 4: System.out.println("thursay");break;
             case 5: System.out.println("friday");break;
              case 6: System.out.println("saturday");break;
             default : System.out.println("sunday");
         }
     


        System.out.print("enter your url:  ");
        String k=sc.nextLine();
        if(k.endsWith(".in"))System.out.println("its an indian website");
       if(k.endsWith(".com"))System.out.println("its a commercial website"); 
        if(k.endsWith(".org"))System.out.println("its an organation website"); 

    }
}
