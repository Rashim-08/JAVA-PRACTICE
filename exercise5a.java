import rashi.shape;


/* VERY IMPORTANT
u had to create another .java file for the class to be used in open package..CHECK FILES SHAPE.JAVA 

*/

class cylinder extends shape{
        cylinder(int dim1,int dim2){
            super(dim1,dim2);
        }

        double area(){
        return 2*3.14*dim1*(dim1+dim2);
    }

        double volume(){
        return 3.14*dim1*dim1*dim2;
    }
}


public class exercise5a {
    public static void main(String[] args) {
        System.out.println("i am second main method");
        cylinder x=new cylinder(5, 10);
        System.out.println(x.volume());
    }
}
