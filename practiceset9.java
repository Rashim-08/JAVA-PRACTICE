

class cylinder{
    private int height;
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    private int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    



}


public class practiceset9 {
    public static void main(String[] args) {
        cylinder c=new cylinder();
        c.setHeight(5);
        System.out.println(c.getHeight());
        c.setRadius(4);
        System.out.println(c.getRadius());
    }
}
