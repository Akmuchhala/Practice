package src;

public class Vehicle {
    private String type = null;
    private String color = null;
    private String brand = null;
    private int number = 0;
    private String modelName = null;


    //setter or muttator methods
    public void setColor(String color){
        this.color = color;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setNumber(int number){
        this.number= number;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }


    //getter or accessor methods
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public String getBrand(){
        return brand;
    }
    public int getNumber(){
        return number;
    }
    public String getModelName(){
        return modelName;
    }
}
