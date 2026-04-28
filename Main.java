import java.util.*;
public class Main {
    public static void p1(int a, int b) {

        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        float div = a / b;
        System.out.println("sum =" + sum + "  diff = " + diff + " multiply = " + mult + " quotient =" + div);
    }

    public static void p2(int l, int b) {

        int area = l * b;
        int peri = 2 * (l + b);
        System.out.println("area = " + area + " perimeter = " + peri);
    }

    public static void p3(float rad) {
        float dia = 2 * rad;
        float circum = 2 * 3.14f * rad;
        float area = 3.14f * rad * rad;
        System.out.println("radius = " + rad + " diameter = " + dia + " circumfeatrence = " + circum + " area = " + area);
    }

    public static void p4(float l) {
        float LinM = l / 100;
        double LinKM = l / 100000;
        System.out.println(" lenght in meter = " + LinM + " length in Km = " + LinKM);
    }
    public static void multiply(int a,int j){
        int multiply = 0;
        int divide = a;
        //multiplication without using * operator
        for(int i=1; i<=j; i++){
            multiply = multiply + a;
        }
        int count =0;
        //division without using / operator
        while(divide > 0){
            divide = divide - j;
            count++;

        }
        //addition of two no without +,-,betwise operatorq
        for(int i=1; i<=j; i++){
            a++;

        }
        System.out.println("multiplication = "+multiply+" division = "+count+" addition = "+a);

    }
    public static void Days(int day){
        int year =0;
        int weeks =0;
        int temp;
        year = day/365;
        temp = day%365;
        weeks = temp/7;
        int days = temp%7;
        System.out.println("years = "+year+" weeks = "+weeks+" days = "+days);
    }
    public static void Triangle(int l,int b){
        float area= 0.5f * b*l;
        System.out.println("area = "+area);
    }
    public static void Equilateral(int side){
        double area = ((Math.sqrt(3))/4)*side*side;
        System.out.println("area = "+area);
    }
    public static void Report(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter no of 5 subjects");
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        int s4 = input.nextInt();
        int s5 = input.nextInt();
        float total = s1+s2+s3+s4+s5;
        float average = total/5;
        float percentage = average;
        System.out.println("total = "+total+" average = "+average+" percentage = "+percentage+"%");
    }
    public static void Swap(int a ,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("l = "+a+" b = "+b);
    }
    public static void SimpleInterest(){
        Scanner input = new Scanner(System.in);
        int p;
        float r;
        int time;
        System.out.println("enetr principle amoutn , rate , time in years");
        p = input.nextInt();
        r= input.nextFloat();
        time = input.nextInt();
       float si = (p*r*time)/100;
       System.out.println("simple interest = "+si);

    }
    public static void EvenOdd(int number){
        if(number%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void Max(int l,int b){
        if(l>b){
            System.out.println(" max is "+l);
        }else{
            System.out.println(" max is "+b);
        }
    }
    public static void ASCII(){
        Scanner input = new Scanner(System.in);
        System.out.println(" enetr char");
        char a = input.next().charAt(0);
        System.out.println("ascii = "+(int)a);



    }
    public static void Temp(){
        Scanner input = new Scanner(System.in);
        float celcius = input.nextFloat();
        float fer = (9/5)*celcius+32;
        System.out.println(" fahrenheit = "+fer);
    }
    public static void CheckAlpha(char ch){
        if((ch >= 'A' && ch <= 'Z' )||(ch >='a' && ch<= 'z')){
            System.out.println("yes give ch is alphabet");
        }else{
            System.out.println("given ch is not alphabet");
        }
    }
    public static void SimpleCalculator(int a,int b , char ch){
        switch(ch) {
            case '+':
                System.out.println(" a + b = " + (a + b));
                break;
            case '-':
                System.out.println("a-b = " + (a - b));
                break;
            case '*':
                System.out.println("a*b = " + (a * b));
                break;
            case '/':
                System.out.println("a/b = " + ((float) a / b));
                break;
            default:
                System.out.println("enter correct operator");
        }

    }
    public static void Fact(int no){
        int fact=1;
        for(int i = no; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("factorial = "+fact);

    }
    public static void SumofDigits(int n){
        int sum =0;
        while(n>0){
            sum = sum+ (n%10);
            n=n/10;
        }
        System.out.println("sum of digits = "+sum);
    }
    public static void Reverse(int n){
        int rev =0;
        while(n>0){
            rev = (rev*10)+(n%10);
            n=n/10;
        }
        System.out.println(" reverse  = "+rev);
    }
    public static void Power(int a, int b){
        int result = 1;
        for(int i=b; i>=1; i--){
            result *=a ;
        }
        System.out.println("result = "+result);
    }
    public static void CheckSign(int n){
        if(n>0){
            System.out.println("positive");
        }else if(n<0){
            System.out.println("negative");
        }else{
            System.out.println("Zero");
        }
    }
    public static void AvgOfThree(int b,int c,int a){
       System.out.println("average = "+((float)(a+b+c))/3);
    }
    public static void CheckDivisibility(int a){

        if((a%5 == 0)&&(a%11 == 0 )){
            System.out.println("no. is divisible by both 5 and 11");
        }else{
            System.out.println("no. is not divisible  by 5 and 11");
        }
    }
    public static void CheckPrePostfix(int n){

        System.out.println("postfix a++ = "+(n++));
        System.out.println("prefix ++a = "+(++n));
    }
    public static void EvaluateExpression(int a,int b,int c){
        int result ;
        result = (a*a)+(b*b)+2*a*b+c/2;
        System.out.println("a2 + b2 + 2ab + c/2 = "+result);
    }





    public static void ForEach(){
        int arr[] = {10,20,30,40};
        for(int a: arr){
            System.out.println(a);
        }
    }
    public static void SumWithoutPlus(int a,int b){
        int sum = a;
        for(int i=b; i>=1; i--){
            sum++;
        }
        System.out.println("sum =" +sum);
    }
    public static void SwapWithXOR(int a, int b){
        a = a^b;
        b = a^b;
        a=a^b;
        System.out.println("a = " +a+" b = "+b);
    }
    public static void CountDigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;

        }
        System.out.println("no of digits = "+ count);
    }
    public static void ArmStrong(int a){
        int count =0;
        int number = a;
        int n =a;
        while(a>0){
            count++;
            a/=10;
        }
        int sum =0;
        while(number >0){
            sum = sum + (int)Math.pow((number%10),count);
            //System.out.println(sum);
            number/=10;
        }
        if( n == sum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static int facto(int n){
        int fact =1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        return fact;
    }
    public static void StronNumber(int a){
        int sum =0;
        int n =a;
        while(a>0){
            sum = sum + facto(a%10);
            a/=10;
        }
        if(n == sum ){
            System.out.println("Strong");
        }else{
            System.out.println("not strong");
        }
    }
    public static void Pallindrome(int n){
        int rev =0;
        int no = n;
        while(n>0){
            rev = (rev*10)+(n%10);
            n=n/10;
        }
        System.out.println(rev);
        if(rev == no){
            System.out.println("its a pallindrome");
        }else{
            System.out.println("its not a pallindrome");
        }
    }
    public static void LCM(int a, int b){
        int lcm =1;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int i =2;
        while(i<=max){
            if(max%i == 0){
                if(min %i == 0){
                    lcm *=i;
                    max /=i;
                    min /=i;
                }else {
                    lcm *= i;
                    max /= i;
                }
            }else{
                i++;
            }
        }
        lcm = lcm*min;
        System.out.println("LCM = "+lcm);
    }
    public static void HCF(int a,int b){
        int hcf = 1;
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        int i=2;
        while(i<=max){
            if((max%i==0)&&(min%i==0)){
                hcf *= i;
                max/=i;
                min/=i;
            }else{
                i++;
            }
        }
        System.out.println("HCF = "+hcf);
    }
    public static void Natural(){
        for(int i =1; i<=100; i++){
            System.out.print(i + " ");
        }
    }
    public static void RevNatural(){
        for(int i =100; i>=1; i--){
            System.out.print(i+" ");
        }
    }
    public static void LowerAlpha(){
        for(char i ='a'; i<='z'; i++){
            System.out.print(i+" ");
        }
    }
    public static void SumOfNaturalNo(){
        int sum =0;
        for(int i=1; i<=100; i++){
            sum = sum+i;
        }
        System.out.println("sum of natural no 1 - 100= "+sum);
    }
    public static void SumOfEvens(){
        int sum =0;
        for(int i=1;i<=100;i++){
            if(i%1 == 0){
                sum +=i;
            }
        }
        System.out.println("sum of all evens 1 -100 = "+sum);
    }
    public static void SumOfOdds(){
        int sum =0;
        for(int i=1; i<=100; i++){
            if (i % 2 != 0) {
                sum+=i;
            }
        }
        System.out.println("Sum of odds 1-100= "+sum);
    }
    public static void Count_Digits(int n){
        int count=0;
        while(n>0){
            count++;
            n/=10;

        }
        System.out.println("no of digits = "+count);

    }
    public static void FirstAndLastDigit(int n){
        int last = n%10;
        int number = n;
        int first ;
        int count=1;
        while(n>0){
            count= count*10;
            n = n/10;
        }
        first = number/(count/10);
        System.out.println("first digit= "+first+" last = "+last);
    }
    public static void SumOfFLDigits(int n){
        int last = n%10;
        int number = n;
        int first ;
        int count=1;
        while(n>0){
            count= count*10;
            n = n/10;
        }
        first = number/(count/10);
        System.out.println("sum of first and last = "+(first+last));
    }
    public static void SwapFLDigits(int n){
        int last = n%10;
        int number = n;
        int first;
        int count=0;
        int tens =1;
        while(n>0){
            count++;
            tens *=10;
            n/=10;
        }
        tens=tens/10;
        first = number/tens;
        number = ((last*tens)+((number)%tens));
        number = (number/10)*10+first;
        System.out.println("no after swappinf f and l digits = "+ number);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //System.out.println("enter day");
        //System.out.println("enter side");
        //System.out.println("enter ch  ");
        //float radius = input.nextFloat();
       System.out.println("enter no1,no2 and operator'+,-,*,/'");
        int l = input.nextInt();
        int b = input.nextInt();
        //int a = input.nextInt();
        //char ch = input.next().charAt(0);
        //float length = input.nextFloat();

        //p1(l, b);
        //p2(l, b);
        //p2(l,b);
        //multiply(l,b);
        //Days(l);
        //Triangle(l,b);
        //Equilateral(l);
        //Report();
        //Swap(l,b);
        //SimpleInterest();
        //EvenOdd(l);
        //Max(l,b);
        //ASCII();
        //Temp();
        //CheckAlpha(ch);
        //Fact(l);
        //SumofDigits(l);
        //Reverse(l);
        //Power(l,b);
        //SimpleCalculator(l,b,ch);
        //CheckSign(l);
        //AvgOfThree(l,b,a);
        //CheckDivisibility(l);
        //CheckPrePostfix(l);
        //EvaluateExpression(l,b,a);
        //ForEach();
        //SumWithoutPlus(l,b);
        //SwapWithXOR(l,b);
        //CountDigits(l);
        //ArmStrong(l);
        StronNumber(l);
        //LCM(l,b);
        //HCF(l,b);
        //Pallindrome(l);
        //Natural();
        //RevNatural();
        //LowerAlpha();
        //SumOfNaturalNo();
        //SumOfEvens();
        //SumOfOdds();
        //Count_Digits(l);
        //FirstAndLastDigit(l);
        //SumOfFLDigits(l);
        //SwapFLDigits(l);




    }
}