import java.util.Scanner;
class lib{
    String []availablebooks = new String[10];
    String []issuedbooks = new String[10];

    public void issuebook(String m){
        int num1=0;
        for(String h:availablebooks){
        
           
            if(h != null && h.equals(m)){
                System.out.println("book issued");
                availablebooks[num1]=null;
                for(int f=0;f<issuedbooks.length;f++){
                    if(issuedbooks[f]==null){
                        issuedbooks[f]=m;
                        return;
                    }
                }
            }
            
            num1++;
        }
       System.out.println("book not found");
    }
    public void addbook(String j){
        
        for(int i=0;i<availablebooks.length;i++){
            if(availablebooks[i]==null){
                availablebooks[i]=j;
                break;
            }
            if(i==availablebooks.length-1){
                System.out.println("shelf reached the limit");
            }
        }
    }
    public void returnbook(String i){
        int num=0;
        for(String c:issuedbooks){
            if(c != null && c.equals(i)){
                issuedbooks[num]=null;
                System.out.println("book returned");
                addbook(i);
            }
            num++;
        }
    }

    public void showavailablebook(){
        for(String read:availablebooks){
            if(read==null)continue;
            System.out.println("-"+read);
        }
    }

}


public class library {
     public static void main(String[] args) {
        boolean choice=true;
        System.out.println("CHOOSE KEY TO PROCEED:\n1-->AVAILABLE BOOKS\n2-->ISSUE BOOK\n3-->RETURN BOOK\n4-->ADD book");

        Scanner sc=new Scanner(System.in);
        lib a=new lib();
        String k;
    
        while(choice){
            System.out.printf("Switched choosed:");
           int s=sc.nextInt();
            sc.nextLine();
            switch(s){
                case 1:{
                    System.out.println("available books-");
                    a.showavailablebook();
                    break;
                }
                case 2:{
                    System.out.println("which book to issue?");
                    k=sc.nextLine();
                    a.issuebook(k);
                    break;
                }
                case 3:{
                    System.out.println("which book to return?");
                     k=sc.nextLine();
                    a.returnbook(k);
                    break;
                }
                default:{
                    System.out.println("which book to add?");
                    k=sc.nextLine();
                    a.addbook(k);
                    break;
                }
        }
        
        System.out.println("do you want to continue?(y/n)");
        String ans = sc.nextLine();
        if(!ans.equals("y")){
            choice =false;
        }
     }
}
}

     
