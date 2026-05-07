package src;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void area(){
        System.out.println("area = "+(Math.PI*Math.pow(radius,2)));
    }
}
