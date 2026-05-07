package src;

public class Car {
    private String model;
    private int price;
    private String brand;

    public Car(String brand, String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void getDetails(){
        System.out.println("Brand = "+brand);
        System.out.println("Model = "+model);
        System.out.println("Price = "+price);
    }
}
