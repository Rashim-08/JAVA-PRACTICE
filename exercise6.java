import java.util.Scanner;

class Unvalidsymbol extends Exception{
    public String getMessage(){
        return "Unvalid Symboll!";
    }
}
class OutofRange extends Exception{
    public String getMessage(){
        return "number cannot exceed 10000";
    }
}
class mulOutofrange extends Exception{
    public String getMessage(){
        return "number cannot exceed 7000";
    }
}
class arithmetic extends Exception{
    public String getMessage(){
        return "Cannot divide with 0";
    }
}


class cal{
    int a,b;
    String c;
    cal(int x,String y,int z){
        a=x;
        c=y;
        b=z;
    }
     
    public void checktheconditions(){
        try{
                if(!c.equals("+") && !c.equals("-") && !c.equals("/") && !c.equals("*"))
                        throw new Unvalidsymbol(); 
                if(c=="/" && b==0)
                    throw new arithmetic();
                if(a>10000 || b>10000)
                    throw new OutofRange();
                if(c=="*")
                    if(a>7000 || b>7000)
                        throw new mulOutofrange();
            }
             catch (arithmetic e){
                System.out.println(e.getMessage());
            }
            catch (Unvalidsymbol e){
                System.out.println(e.getMessage());
            }
            catch (OutofRange e){
                System.out.println(e.getMessage());
            }
             catch (mulOutofrange e){
                System.out.println(e.getMessage());
            }
        }

        public void calculation(){
        checktheconditions();
        System.out.print("Answer is: ");
               switch (c) {
                    case "+":
                        a=a+b;
                        System.out.println(a);
                        break;
                    case "-":
                        a=a-b;
                        System.out.println(a); 
                        break;
                    case "*":
                        a=a*b;
                        System.out.println(a);
                        break;
                    default:
                        double j=a/b;
                        System.out.println(j);
                        break;
                }
        }
    }


public class exercise6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

       for(int i=0;i<4;i++)
        {System.out.println("-----ENTER YOUR OPERATION---");
        System.out.print("Number 1: ");
            int x=s.nextInt();
        System.out.print("operator: ");
             String y=s.next();
        System.out.print("Number 2: ");
            int z=s.nextInt();
         cal k=new cal(x, y, z);
        k.calculation();}
        
    }
}
