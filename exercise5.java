
package rashi;


class rectangle extends shape{
    rectangle(int dim1,int dim2){
        super(dim1, dim2);
    }
    double area(){
        return dim1*dim2;
    }
}

class cuboid extends shape{
    cuboid(int dim1,int dim2,int dim3){
        super(dim1, dim2);
        this.dim3=dim3;
    }
    double area(){
        return 2*(dim1*dim2+dim2*dim3+dim1*dim3);
    }
    double volume(){
        return dim1*dim2*dim3;
    }

}

 class sphere extends shape{
    sphere(int dim1){
        super(dim1, 0);
        
    }
    double area(){
        return 4*3.14*dim1*dim1;
    }
    double volume(){
        return (4/3)*3.14*dim1*dim1*dim1;
    }

}

/*to run package:- 
javac -d . (file name)
java packagename/main method name
 */

public class exercise5{
    public static void main(String[] args) {
        System.out.println("i am main");
        cuboid c=new cuboid(2, 3, 4);
        System.out.println(c.volume());
    }
    
}




