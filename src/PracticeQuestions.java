package src;

public class PracticeQuestions {
    public static int max(int a,int b){
        return (Math.max(a,b));
    }
    public static void evenOdd(int a){
        if(a%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static int factorial(int a){
        int fact =1;
        for(int i =1; i<=a; i++){
            fact *=i;
        }
        return fact;
    }
    public static boolean checkPrime(int a){
        for(int i =2; i<=a; i++){
            if(a%i == 0){
                System.out.println("not prime");
                return true;
            }
            }
        return false;
    }
    public static int power(int a,int b) {


            if (b == 0) {
                return 1;
            }
            return a * (power(a, b - 1));
    }
    public static void swap(int a,int b ){
        System.out.println("before swap a = "+a+" b = "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("after swap a = "+a+" b = "+b);
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void calculations(int a,int b){
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,10));
        System.out.println(" power = "+power(10,5));
        System.out.println("prime = "+checkPrime(17));
    }
    public static int factorialReccursion(int a){
        if(a==0){
            return 1;
        }
        return a*factorialReccursion(a-1);
    }
public static void main(String[] args){
        System.out.println(max(2,3));
        evenOdd(10);
        System.out.println(factorial(10));
        System.out.println(" Prime  ="+checkPrime(10));
       System.out.println(power(3,3));
       swap(10,20);
       calculations(12,5);
       System.out.println(factorialReccursion(5));

    }
}
