
// PERCENTAGE MARKS AGGREGATE MARKS:-
// import java.util.*;
// public class endtermques {
//   public static void main(String[] args)
//   {
//    Scanner in=new Scanner(System.in);
//     int aggregate=0;
//     int percentage=0;  
//     int[]arr=new int[5];
//     for(int i=0;i<5;i++){
//    arr[i]=in.nextInt();
//     }
//     for(int i=0;i<5;i++){
//         if(arr[i]>0 && arr[i]<100){
//        aggregate+=arr[i];
//        percentage=aggregate/5;
//         }
//          }
//          System.out.print(aggregate+" "+percentage);
//   }
// }



//SWAP TWO VARIABLES
// import java.util.Scanner;
// // Other imports go here// Do NOT change the class name
// class Main
// {
//   public static void main(String[] args)
//   {
//   Scanner in=new Scanner(System.in);
//     int x=in.nextInt();
//     int y=in.nextInt();
//     int temp=x;
//     x=y;
//     y=temp;
//     System.out.println(x);
//     System.out.println(y);
//   }
// }


// Add one to 4 digit
// import java.util.*;
// public class endtermques
// {
//   public static void main(String[] args)
//   {
//    Scanner in=new Scanner(System.in);
//    int digit=in.nextInt();
//    int result=0;
//  int multiplier=1;
//   while(digit!=0){
// int number=(digit%10+1)%10;
// result=number*multiplier+result;
// multiplier=multiplier*10;
// digit=digit/10;
//   }
//   System.out.println(result);
//   }
//   }



//Leap year
// public static void main(String[] args)
// {
//    Scanner sc=new Scanner(System.in);
//    int year=sc.nextInt();
//   if(year>1000 && year<10000){
//   if(year%4==0 && (year%100!=0 || year%400==0)){
//     System.out.println("Leap Year");
//   }  
//   else{
//     System.out.println("Not a Leap Year");
//   }
// }}








//Generate prime no
// import java.util.Scanner;
// // Other imports go here
// // Do NOT change the class name
// public class endtermques
// {
//     public static void main(String[] args)
//     {
//        Scanner in=new Scanner(System.in);
//        System.out.println("Enter upto which number prime number should be entered(limit):=> ");
//        int n=in.nextInt();// limit
//        System.out.println("Enter how many prime numbers u want as output  ");
//        int m=in.nextInt(); // no. of prime number to generate
//        int count=0;
//        for(int i=2;i<n && count<m ;i++){
//         if (isprime(i)){
//             System.out.println(i);
//             count++;
//         }
//        }
//     }
//        private static boolean isprime(int num){
//         if(num<=1){
//             return false;
//         }
//         for(int i=2;i<num;i++){
//             if(num%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }






//Karpekar no.
// import java.util.Scanner;
// // Other imports go here// Do NOT change the class name
// class endtermques
// {
//     public static void main(String[] args)
//     {
//       Scanner in=new Scanner(System.in);
//       int N=in.nextInt();
//       for(int i=0;i<N;i++){
//       int a=0;
//       int d=0;
//       int s=0;
//       int f=0;
//       int l=0;
//       a=in.nextInt();
//       for(i=a;i>0;i--){
//         d++;
//       }
//       s=a*a;
//       f=s/(int)Math.pow(10,d);
//       l=s%(int)Math.pow(10,d);
//       if(f+l==a){
//         System.out.println("1");
//       }
//       else{
//         System.out.println("0");
//       }
//     }
//     }
// }


//matrix multiplication
// import java.util.*;
// public class endtermques{
//   public static void main(String[] args) {
//     Scanner in=new Scanner(System.in);
//     int R1=2;
//     int C1=3;
//     int R2=3;
//     int C2=2;
//     int[][]a={{1,2,3},{4,5,6}};
//     int[][]b={
//       {7, 8},
//       {9, 10},
//       {11, 12}
//   };
// System.out.println("Hence resullt of matrix multiplication is -");
  
//   int[][]result=new int[R1][C2];
//   for(int i=0;i<R1;i++){
//     for(int j=0;j<C2;j++){
//       for(int k=0;k<C1;k++){
//         result[i][j]+=a[i][k]*b[k][j];
//       }
//     }
//   }
//   for(int i=0;i<result.length;i++){
//     for(int j=0;j<result[0].length;j++){
//       System.out.print(result[i][j]+" ");
//     }
//     System.out.println();
//   }
//   }
// }

  


// count set bits of a number( set bit: 1)
// public class endtermques
// {
//   static int countBits(int num)
//   {
//    int count=0;
//     while(num>0){
//       count+=(num&1);
//       num=num>>1;
//     }
//     return count;
//   }
// }



// public int countDigits(int number){
//     int count=0;
//     while(number!=0){
//       int digit=number%10;
//       count++;
//       number=number/10;
//     }
//     return count;
//   }


// Decimal to Binary=>
//======================
// import java.util.*;
// public class endtermques{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int decimal=in.nextInt();
//         int[]binary=new int[32];
//         int quotient=0;
//         quotient=decimal;
//         int i=0;
//         while(quotient!=0){
//             binary[i++]=quotient%2; // store 
//             quotient=quotient/2;
//         }
// for(int j=i-1;j>=0;j-- ){
//     System.out.print(binary[j]);
// }
//     }
// }


// Class create:-
//================


// public class endtermques{
//     public static void main(String[] args) {
//          Complex num1=new Complex(2,4); // object create;
//          Complex num2=new Complex(5,9);
//          num1.print();
//          num2.print();
//     }
//      static class Complex{
//     int a,b;
//     public Complex(int real,int imaginary){
//         a=real;
//         b=imaginary;
//     }
//     void print(){
//             System.out.println(a+"+"+b+"i");
//     }
//     }
// }


// class triangle{
//     private int base;
//     private int height;
//     void setbaseandheight(int b,int h){
//         this.base=b;
//         this.height=h;
//     }
//     int getbase(){
//         return base;
//     }
//     int getheight(){
//         return height;
//     }
//     float area(){
//         return 0.5f*base*height;
//     }
// }
// public class endtermques{
//     public static void main(String[] args) {
//         triangle t=new triangle();
//         t.setbaseandheight(2,4);
//         System.out.println("hence area is equal to "+ t.area());
//         }
// }




// class Date
// {
//   private int m;
//   private int d;
  
//   public Date(int m,int d){
//     this.m=m;
//     this.d=d;
//   }
//   public int getDay(){
//     return d;
//   }
//  public int getMonth()  {
//    return m;
//  }
// public int daysInMonth(){
//   switch(m){
//    case 1:return 31;
//    case 2:return 28;
//    case 3:return 31;
//    case 4:return 30;
//    case 5:return 31;
//    case 6:return 30;
//    case 7:return 31;
//    case 8:return 31;
//    case 9:return 30;
//    case 10:return 31;
//    case 11:return 30;
//    case 12:return 31;
//    default: throw new IllegalArgumentException("Invalid month: " + m);
//   }
// }
// public void nextDay(){
// if(d<daysInMonth()){
//   d++;
// } 
//   else{
//     d=1;
//     if(m<12){
//       m++;
//     }
//     else{
//       m=1;
//     }
//   }
// }

//   public String toString(){
//     return m+"/"+d;
//   }
  
// public int absoluteDay(){
//   int[]daysInMonth={ 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//   int absoluteDay=0;
//   for(int i=1;i<m;i++){
//     absoluteDay+=daysInMonth[i];
//   }
//   absoluteDay+=d;
//   return absoluteDay;
// }
// }




// class Circle
// {
//   private double r;
  
//   public Circle(double r){
//     this.r=r;
//   }
  
//   public double area(){
//     return Math.round(Math.PI*r*r*100.0)/100.0;
//   }
//   public double circumference(){
//     return Math.round(Math.PI*2*r*100.0)/100.0;
//   }
//   public double getRadius(){
//     return Math.round(r*10.0)/10.0;
//   }
//   public String toString(){
//     return String.format("Circle{radius=%.1f}",getRadius());
//   }
// }