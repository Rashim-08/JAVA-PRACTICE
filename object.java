

class Employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+name);
    }


}

public class object {
    public static void main(String[] args) {
       Employee rashi = new Employee();
       Employee shubh = new Employee();

       rashi.id=15;
       shubh.id=19;
       rashi.name="rashimanvar";
       shubh.name="suhbhmanavar";

        rashi.printdetails();
        shubh.printdetails();
        

    }
}
