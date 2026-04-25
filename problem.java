
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//8396
class Median{
    int n;
  Median(int n){
    this.n=n;
  }
  double findm(ArrayList<Integer> x){
    double m;
    if(n%2==1){
        m = x.get(n / 2);
    }
    else{
        m = (x.get(n/2 - 1) + x.get(n/2)) / 2;
    }
    return m;
  }
  
  }

public class problem {
     public static void main(String[] args) {
    
    //problem1
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter 1st number:--");
        // String s1=sc.next();
        // System.out.print("Enter 2nd number:--");
        // String s2=sc.next();
        // if(  s1.length()> 51  || s2.length()> 51 )
        //     System.out.println("Invalid numver");
        // else{
        //     BigInteger n1=new BigInteger(s1);
        //     BigInteger n2=new BigInteger(s2);
        //     System.out.println(n1.add(n2));
        // }

    //Proble2
    // we will use arraylist because it doesnt need to specify number of elemnets in the begining
    ArrayList<Integer> a=new ArrayList<>();
    System.out.print("how many elements are u going to add?---");
    int n=sc.nextInt();
    System.out.print("input:");
    for(int i=0;i<n;i++){
        int x=sc.nextInt();
    a.add(x);
    }
    Collections.sort(a);
    
    //finding median
    Median me=new Median(n);
    int medi=(int)me.findm(a);
    System.out.println(me.findm(a));
    System.out.print("Number of elements u want to print near to median:-");
    int k=sc.nextInt();
    //number of elemnts to be removes from array list:-
    int h=n-k;
    
    while (h > 1) {
    a.remove(a.size() - 1);
    a.remove(0);
    h -= 2;
}

// if one removal left
if (h == 1) {
    a.remove(0);  // or remove last, your choice
}
    System.out.println(a);
   



    }
    
}
