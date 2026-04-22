import java.util.*;
public class Sorting {
  public static void swap(int array[],int min ,int i){
    int temp = array[i];
    array[i]= array[min];
    array[min]=temp;
  }
  public static void fill_array(int array[]){
    Scanner input = new Scanner(System.in);
    for(int i=0;i<array.length; i++){
      System.out.println("enter no.");
      array[i]= input.nextInt();
    }
  }
  public static void print_array(int array[]){
    for(int i=0; i<array.length; i++){
      System.out.print(array[i]+"\t");
    }
  }
  public static void bubbleSort(int array[]){
    for(int i=0; i<array.length-1; i++){
      for(int j=0 ; j<array.length-1-i; j++){
        if(array[j]>array[j+1]){
          int temp = array[j];
          array[j]=array[j+1];
          array[j+1]=temp;
        }
      }
    }
  }
  public static void D_bubbleSort(int array[]){
    for(int i=array.length-1; i>0; i--){
      for(int j=i; j>0; j--){
        if(array[j]>array[j-1]){
          swap(array,j,j-1);
        }
      }
    }
  }
  public static void SelectionSort(int array[]){
    for(int i = 0; i< array.length-1; i++){
      int min = i;
      for(int j=i; j<array.length; j++){
        if(array[min]>array[j]){
          min= j;
        }
      }
      swap(array,min,i);
    }
  }
  public static void D_SelectionSort(int array[]){
    for(int i=array.length-1; i>0; i--){
      int min=i;
      for(int j = i; j>=0; j--){
        if(array[j]<array[min]){
          min=j;
        }
      }
      swap(array,min,i);
    }
  }
  public static void InsertionSort(int array[]){
    for(int i=1; i<array.length; i++){
      int current = array[i];
      int previous = i-1;
      while(previous >=0 && array[previous]>current){
        array[previous+1]=array[previous];
        previous--;
      }
      array[previous+1]= current;
    }
  }
  public static void D_InsertionSort(int array[]){
    for(int i=array.length-2; i>=0; i--){
      int current = array[i];
      int next = i+1;
      while(next <array.length && array[next]>current){
        array[next-1]=array[next];
        next++;
      }
      array[next -1]= current;
    }
  }
  public static void CountingSort(int array[]){
  int largest = Integer.MIN_VALUE;
  for(int i=0; i<array.length; i++){
    largest = Math.max(largest,array[i]);
  }
  int count[] = new int[largest+1];
  for(int i=0; i<array.length; i++){
    count[array[i]]++;
  }
  //sorting
    int j=0;
  for(int i=0; i<count.length; i++){
    while(count[i]>0){
      array[j]=i;
      j++;
      count[i]--;
    }
  }
  }
  public static void D_CountingSort(int array[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0; i<array.length; i++){
      largest = Math.max(array[i],largest);
    }
    int count[] = new int[largest+1];
    for(int i=0; i<array.length; i++){
      count[array[i]]++;
    }
    int j=0;
    for(int i=count.length-1; i>=0; i--){
      while(count[i]>0){
        array[j]=i;
        j++;
        count[i]--;
      }
    }
  }
  public static void fill_matrix(int matrix[][]){
    Scanner input = new Scanner(System.in);
    System.out.println("enter elements of matrix");
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j<matrix[0].length; j++){
        matrix[i][j]=input.nextInt();
      }
    }
  }
  public static void print_matrix(int matrix[][]){
    for(int i = 0 ; i< matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        System.out.print(matrix[i][j] + "\t");
      }
      System.out.println();
    }
  }
  public static void print_SpiralMatrix(int matrix[][]) {
    int startrow = 0;
    int endrow = matrix.length-1;
    int startcol = 0;
    int endcol = matrix[0].length-1;
    while(startrow <= endrow && startcol <= endcol){
      /*
      if(startrow==startcol && endrow==endcol && startrow==endrow){
       System.out.print(matrix[startrow][startrow]);
        break;
      }
      */
      // loop to print top boundary
      for(int j = startcol; j<= endcol; j++){
        System.out.print(matrix[startrow][j]+"\t");
      }
      //loop for right boundary
      for(int i = startrow+1; i<= endrow; i++){
        System.out.print(matrix[i][endcol]+"\t");
      }
      //loop for bottom boundary
      for(int j = endcol-1; j>=startcol; j--){
        //no repeat print
        if(startrow == endrow){
          break;
        }
        System.out.print(matrix[endrow][j]+"\t");
      }
      //loop for left boundary
      for(int i =endrow-1; i>= startrow+1; i--){
        //condtion for no repeat print
        if(startcol == endcol){
          break;
        }
        System.out.print(matrix[i][startcol]+"\t");
      }
      // updation of variables for next iteration
      startrow++;
      endrow--;
      startcol++;
      endcol--;
  }
  }
  public static void diagonalSum(int matrix[][]){
    //primary diagonal sum
    int PrimarySum=0;
    int SecandarySum=0;
    for(int i = 0; i<matrix[0].length; i++){
      PrimarySum=PrimarySum + matrix[i][i];
    }
    //for secandary sum
    for(int i = matrix[0].length-1; i>=0; i--){
      SecandarySum = SecandarySum + matrix[(matrix.length-1)-i][i];
    }
    //print both sums
    System.out.println("Primary diagonal Sum = "+ PrimarySum);
    System.out.println("Secandary Sum = "+ SecandarySum);
    //print final diagonal sum
    if(matrix.length % 2 == 0){
      System.out.println("Diagonal Sum = "+ (PrimarySum + SecandarySum));
    }else{
      System.out.println("Diagonal Sum = " + (PrimarySum+SecandarySum - matrix[matrix.length/2][matrix.length/2]));
    }
  }
  public static void StaircaseSearchMatrix(int matrix[][], int key){
    if(((matrix[0][matrix[0].length-1]+matrix[matrix.length-1][0])/2) > key ) {
      int row = matrix.length - 1;
      int col = 0;
      while (row >= 0 && col < matrix[0].length) {
        if (key == matrix[row][col]) {
          System.out.println("key " + key + " found at index (" + row + " , " + col + " )");
          break;
        } else if (key > matrix[row][col]) {
          col++;
        } else {
          row++;
        }
        if (row < 0 || col == matrix[0].length) {
          System.out.println("key not found");
          break;
        }
      }
    }else {
      int row = 0;
      int col = matrix[0].length - 1;
      while (row < matrix.length && 0 <= col) {
        if (key == matrix[row][col]) {
          System.out.println("key " + key + " found at index (" + row + " , " + col + " )");
          break;
        } else if (key > matrix[row][col]) {
          row++;
        } else if (key < matrix[row][col]) {
          col--;
        }
        if (row == matrix.length || col < 0) {
          System.out.println("key not found");
          break;
        }
      }
    }
    }
    public static void transposeMatrix(int matrix[][], int transpose[][]) {
      if (matrix.length == matrix[0].length) {
        for (int i = 0; i < matrix.length; i++) {
          for (int j = i + 1; j < matrix[0].length; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
          }
        }
        print_matrix(matrix);
      } else {
        for (int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
            transpose[j][i] = matrix[i][j];
            //transpose[j][i]=matrix[i][j];
          }
        }
        print_matrix(transpose);
      }
    }
    public static boolean StringPalindrome(String str){
    for( int i=0; i<str.length()/2; i++){
      if(str.charAt(i) != str.charAt(str.length()-1-i)){
        return false;
      }
      }
    return true;
    }
    public static void ShortestPath(String str){
    int x=0,y=0;
    //double x2=0,y2=0;
    for(int i = 0; i< str.length(); i++){
      if(str.charAt(i) == 'E'){
        x++;
      }else if(str.charAt(i) == 'W'){
        x--;
      }
      else if (str.charAt(i) == 'N') {
          y++;
      }
      else{
          y--;
        }
      }
    System.out.println((float)Math.sqrt((x*x)+(y*y)));
    }
    public static boolean IsStringPallindrome(String word){
    int left=0;
    int right= word.length()-1;
    while(left<right){
      if(word.charAt(left) != word.charAt(right)){
        return false;
      }
      left++;
      right--;
    }
    return true;
    }
    public static void LargestString(){
    String fruits[] = {"apple","mango","banana"};
    String largest = fruits[0];
    for(int i=1; i<fruits.length; i++){
      if(largest.compareTo(fruits[i])<0){
        largest = fruits[i];
      }
    }
    System.out.println("Largest String = "+ largest);
    }
    public static void StringsBuilder(String name){
    StringBuilder Str = new StringBuilder(name);
    for(char ch ='a'; ch<='z'; ch++){
      Str.append(ch);
    }
    System.out.println(Str);
  }
  public static void CompressString(String name){
    StringBuilder CompressedString = new StringBuilder("");
    for(int i=0;i<name.length(); i++){
      Integer count = 1;
      while(i<name.length()-1 && name.charAt(i) == name.charAt(i+1)){
        count++;
        i++;
      }
      CompressedString.append(name.charAt(i));
      if(count > 1){
        CompressedString.append(count.toString());
      }
    }
    System.out.println(CompressedString);
  }
  public static void BitwiseEvenOdd(int number){
    if((number & 1) == 0){
      System.out.println("given number is EVEN");
    }else{
      System.out.println("given number is ODD");
    }
  }
  public static void GetIthBit(int number,int i){
    int m = 1 << i;
    if((number&m) == 0) {
      System.out.println("Ith bit is 0 number = "+number);
    }else{
      System.out.println("Ith bit is 1 number = "+number);
    }
  }
  public static void SetIthbit(int number, int i){
    int m = 1 << i;
    number = number | m;
    GetIthBit(number,i);
  }
  public static void ClearIthbit(int number,int i){
    number = number &(~(1<<i));
    GetIthBit(number,i);
  }
  public static void UpdateIthvalue(int number , int i){
    Scanner input = new Scanner(System.in);
    int value;
    System.out.println("enter 0 0r 1 what you want to update on Ith position");
    value = input.nextInt();
    if(value == 0){
      ClearIthbit(number,i);
    }else if(value == 1){
      SetIthbit(number,i);
    }else{
      System.out.println("This value cannot be entered at Ith bit");
    }
  }
  public static void ClearRangeOfBits(int number, int i, int j){
    int bitmask;
    bitmask = ((~0)<<(j+1))|((1<<(i))-1);
    number = number & bitmask;
    System.out.println(number);
  }
  public static void IsNumberPowerOfTwo(int number){
    if((number & (number-1)) == 0){
      System.out.println("yes number is power of 2");
    }else{
      System.out.println("no number is not power of 2");
    }
  }
  public static void CountSetBits(int number){
    int x= number;
    int count=0;
    while( number > 0){
      if((number & 1) == 1){
        count++;
        number= number>>1;
      }else{
        number= number>>1;
      }
    }
    System.out.println("Number of Set bits in "+x+" is "+count);
  }
  public static void FastExponential(int number, int power){
    int answer = 1;
    while(power > 0){
      if((power & 1) != 0){
        answer = answer * number;
      }
      power = power>>1;
      number *= number;
    }
    System.out.println(" Result = "+answer);
  }
  public static void BitManupulationQuestions(){
    Scanner input = new Scanner(System.in);
    int a,b;
    System.out.println("enter values of a and b ");
    a = input.nextInt();
    b = input.nextInt();
    System.out.println("values before swapping a = "+a+" b = "+b);
    a = a^b;
    b = a^b;
    a= a^b;
    System.out.println("values after swapping a = "+a+" b = "+b);
    System.out.println("now adding 1 to integer a by bit manupulation");
    a = -(~a);
    System.out.println("values after adding 1 by bit manupulation in  a = "+a);
    System.out.println("Enter any string in Uppercase");
    String Str = input.next();
    StringBuilder LowerStr = new StringBuilder();
    System.out.println("string is converted to lowecase with bitmanupulation");

    for(int i = 0; i<Str.length(); i++){
     char ch = Str.charAt(i);
     ch = (char)(ch | ' ');
     LowerStr.append(ch);
    }
    System.out.println(LowerStr);
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String name ;
    int number ;
    int i;
    //System.out.println("enter any number and power ");
    //number= input.nextInt();
    //i= input.nextInt();
    //name = input.next();
             BitManupulationQuestions();
             //FastExponential(number,i);
             //CountSetBits(number);
             //IsNumberPowerOfTwo(number);
             //ClearRangeOfBits(number,i,4);
             //UpdateIthvalue(number,i);
             //ClearIthbit(number,i);
             //GetIthBit(number,i );
             //SetIthbit(number,i);
             //BitwiseEvenOdd(number);
             //CompressString(name);
             //StringsBuilder(name);
             //LargestString();
             //System.out.println("Pallindrome "+IsStringPallindrome(name));
             //ShortestPath(name);
             //System.out.println(StringPalindrome(name));
             //int array[]= new int[5];
             //int matrix[][] = new int[3][3];
             //int transpose[][] = new int[matrix[0].length][matrix.length];
             //fill_matrix(matrix);
             //print_matrix(matrix);
             //System.out.println();
             //transposeMatrix(matrix,transpose);
             //StaircaseSearchMatrix(matrix,27);
             //diagonalSum(matrix);
             //print_SpiralMatrix(matrix);
            //SelectionSort(array);
            //InsertionSort(array);
            //Arrays.sort(array);
            //CountingSort(array);
            //D_bubbleSort(array);
            //D_SelectionSort(array);
            //D_InsertionSort(array);
            //D_CountingSort(array);
            //print_array(array);


    }
  }
