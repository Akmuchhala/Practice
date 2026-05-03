package src;

public class Furniture {
    private String color = null;
    private String type = null;
    private int length = 0;
    private int width = 0;
    private String material = null;

    //setter or muttator methods
    public void setColor(String color){
        this.color = color;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public void setLength(int length){
        this.length= length;
    }
    public void setWidth(int width){
        this.width = width;
    }


    //getter or accessor methods
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    public String getMaterial(){
        return material;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }


}
