package src;

public class Test {
    private int xxxx;
    public static void main(String[] args){
        int a=10;
        Test t01 = new Test();
        t01.xxxx=a;
        System.out.println(t01.xxxx);





        Student S1 = new Student("Akshat",101,99);
        S1.displayDetails();


        BankAccount b1 = new BankAccount();
        b1.deposit(1000);
        b1.withdraw(100);
        b1.getbalance();






        Employee e1 = new Employee("Akshat",101,10000);
        e1.annualIncome();

        Car c1 = new Car("Tata","Nexon",1500000);
        c1.getDetails();



        Developer d1 =  new Developer(20000,201,"akshat");
        d1.DisplayDetails();



        Dog dog1 = new Dog();
        dog1.sound();
        Cat cat1= new Cat();
        cat1.sound();



        Calci calculator1 = new Calci();
        calculator1.add(1,2);
        calculator1.add(1,2,3);
        calculator1.add(1.0,1.1);


        Rectangle r1 = new Rectangle();
        r1.setLength(10);
        r1.setWidth(20);
        r1.area();
        r1.perimeter();

        Circle circle1 = new Circle(12.5);
        circle1.area();

        SavingAccount sa1 = new SavingAccount();
        sa1.interest();
        CurrentAccount cu1 = new CurrentAccount();
        cu1.interest();



   /* Vehicle car = new Vehicle();
        Vehicle bus= new Vehicle();
        Computer windows = new Computer();
        Computer mac = new Computer();
        Mobile iphone16 = new Mobile();
        Mobile andriod = new Mobile();
        car.setBrand("Tata");
        car.setColor("White");
        car.setType("Electric");
        car.setModelName("Nexon");
        car.setNumber(2974);
        System.out.println(car.getBrand());
        System.out.println(car.getColor());
        System.out.println(car.getType());
        System.out.println(car.getNumber());
        System.out.println(car.getModelName());
        mac.setBrand("Apple");
        mac.setCost(100000);
        mac.setProcessor("M2");
        mac.setStorage(256);
        mac.setGpu("M2");
        System.out.println(mac.getBrand());
        System.out.println(mac.getCost());
        System.out.println(mac.getGpu());
        System.out.println(mac.getProcessor());
        System.out.println(mac.getStorage());
        iphone16.setBrand("Apple");
        iphone16.setCost(60000);
        iphone16.setProcessor("A3");
        iphone16.setStorageRAM(16);
        iphone16.setStorageROM(256);
        System.out.println(iphone16.getBrand());
        System.out.println(iphone16.getCost());
        System.out.println(iphone16.getProcessor());
        System.out.println(iphone16.getStorageRAM());
        System.out.println(iphone16.getStorageROM());
    */
    }
}
