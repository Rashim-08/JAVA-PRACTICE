package calc;

class calculator{
    public void calc1(){
        System.out.println("i am calc1");
    }
}

class sccalculator{
    public void calc2(){
        System.out.println("i am calc2");
    }
}

class hycalculator{
    public void calc3(){
        System.out.println("i am calc3");
    }
}


public class practiceset12 {
    public static void main(String[] args) {
        System.out.println("i am main class");
        calculator c=new calculator();
        c.calc1();

    }
}
