class tp extends Thread{
  @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("running m1");
        }
    }  
}

class test1 implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("test1 running");
        }
    }
}
class test2 implements Runnable{
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("test2 running");
        }
    }
}
  
class tp1 extends Thread{
  @Override
    public void run(){
       for(int i=0;i<=20;i++){
            System.out.println("running m2");
        }
    }
}

class test3 extends Thread{
    public test3(String y){
        super(y);
    }
    public void run(){
        System.out.println("helo");
    }
}

class test4 implements Runnable{
    public void run(){
        System.out.println("hello2");
    }
}

public class t {
    public static void main(String[] args) {
     tp s1=new tp();
     tp1 s2 =new tp1();
     s1.start();
     s2.start();   

    test1 t=new test1();
    Thread lum=new Thread(t);
     test2 g=new test2();
    Thread sum=new Thread(g);
    lum.start();
    sum.start();

    test3 f = new test3("RASHI");
    f.start();
    System.out.println(f.getName());
    }
    
    test4 ff= new test4();
    Thread k=new Thread(ff,"rashi");
    k.start();
}
