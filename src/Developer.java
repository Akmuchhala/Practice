package src;

public class Developer extends Employeee {
    public double salary;
    public Developer(double salary,int ide,String namee){
        this.salary=salary;
        this.ide=ide;
        this.namee=namee;
    }
    public void DisplayDetails(){
        System.out.println("name = "+namee);
        System.out.println("id  = "+ide);
        System.out.println("salary = "+salary);
    }
}
