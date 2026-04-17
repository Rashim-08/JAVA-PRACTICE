
abstract class pen{
    abstract void write();
    abstract void refill();
} 
class fountainpen extends pen{
    void write(){
        System.out.println("write");
    }
    void refill(){
        System.out.println("refill");

    }
    void changenib(){
        System.out.println("change nib");

    }
}

class monkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}
 interface basicanimal{
    void eat();
    void sleep();
 }
class human extends monkey implements basicanimal{
    void speak(){
        System.out.println("speak");
    }
    @Override
    public void eat(){
        System.out.println("eat");
    }
    @Override
    public void sleep(){
        System.out.println("sleep");
    }
}

interface tvremote{
    void on();
    void off();
}
 interface smarttvremote extends tvremote{
   void wifi();
} 
class tv implements smarttvremote{
    
    public void on(){
        System.out.println("tv is switching on");
    }

    public void off(){
        System.out.println("tv is switching off");
    }
    
    public void wifi(){
        System.out.println("tv is wifi");
    }
}

public class practiceset11 {
    public static void main(String[] args) {
        // human h=new human();
        // h.jump();

        // monkey m=new human();---polymorphism
        // m.bite();

        tv t=new tv();
        t.on();
        t.wifi();

    }
}
