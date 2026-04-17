class th1 extends Thread{
    @Override
     public void run(){
        for(int i=0;i<50;i++){
        System.out.println("GOOD MORNING");
        }
    } 
    }
class th2 extends Thread{
        @Override
     public void run(){
        for(int i=0;i<50;i++){
        System.out.println("WELCOME");
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}

     
    class test5 extends Thread{                 
        public test5(String y){
            super(y);
        }
        public void run(){
            System.out.println("hello");
        }
    }
        
    
    



public class practiceset13 {
    public static void main(String[] args) {
        th1 e=new th1();
        th2 f=new th2();
        e.start();
        f.start();  

        test5 t1=new test5("RASHI");
        test5 t2=new test5("SHUBH");

    
        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t1.getState());
       

        System.out.println(t2.getName());
         System.out.println(t2.getState());
        System.out.println(t2.getPriority());
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t2.getPriority());
        t2.setName("shubh2");
        System.out.println(t2.getName());
        t2.setPriority(4);
        System.out.println(t2.getPriority());
        System.out.println(Thread.currentThread().getState());

       
    }
    
}
