
class circle{
    int radius;
        circle(int r){
        radius=r;
        System.out.println("radisu is:"+radius);
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
class cylinder extends circle{
    int height;
    cylinder(int h,int r){
        super(r);
        height=h;
        System.out.println("height is:"+height);
    }
    public double areac(){
        return 2*area()+3.14*radius*height;
    }
}

class rectangle{
    int length;
    int breadth;
    rectangle(int l,int b){
        length=l;
        breadth=b;
        System.out.println("i am rec constructor");
    }
    double arear(){
        return length*breadth;
    }
}
class cubiod extends rectangle{
    int height;
    cubiod(int l,int b,int h){
        super(l, b);
        height=h;
        System.out.println("i am cuboid constructor");
    }
    double areac(){
        return 2*(length*breadth+breadth*height+height*length);
    }
    double volume(){
        return length*breadth*height;
    }
}


public class practiceset10 {
    public static void main(String[] args) {
        cylinder c=new cylinder(7, 8);
        System.out.println(c.area());
        System.out.println(c.areac());
     
        rectangle r=new rectangle(10, 5);
        System.out.println(r.arear());
        cubiod e=new cubiod(13, 14, 15);
        System.out.println(e.areac());
        System.out.println(e.volume());
    
    }

    
}
