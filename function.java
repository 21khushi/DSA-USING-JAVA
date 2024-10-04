
// WITH INTEGERS:->
// 1. Without using return function: Here since we are not trying to return a
// value and simply print a statement so we are using "static void sum()"

// import java.util.Scanner;
// public class function{
// public static void main(String[] args) {
// sum();
// }
// static void sum(){
// Scanner input =new Scanner(System.in);
// int num1=input.nextInt();
// int num2=input.nextInt();
// int sum=num1+num2;
// System.out.println("Hence the sum is equal to: " + sum);
// }
// }

// 2. BY Using return function : Here since with return we are trying to return
// a value so we used " static int sum()"

// public class function{
// public static void main(String[] args){
// int ans=sum(20,30);
// System.out.println(ans);
// }
// static int sum(int a ,int b){
// int add=a+b;
// return add;
// }
// }

// WITH STRINGS
// public class function{
// public static void main(String[] args){
// greet();
// }
// static void greet(){
// System.out.println("How are you");
// }
// }

// Using return

// import java.util.Scanner;
// public class function{
// public static void main(String[] args){
// Scanner input=new Scanner(System.in);
// String ch=input.nextLine(); // to print complete line even the word after
// space.
// String message=greet(ch);
// System.out.println(message);
// }
// static String greet(String name){
// String personalised="Hello "+name;
// return personalised;
// }
// }

// we cannot swap two numbers or change the value using
// functions;(primitive(int,byte,char) cannot be change,just pass by value)

// import java.util.Scanner;

// public class function {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int num1 = input.nextInt();
// int num2 = input.nextInt();
// swap(num1, num2);
// System.out.println(num1 + " " + num2);
// }

// static void swap(int a, int b) {
// int temp = a;
// a = b;
// b = temp;
// }
// }

// array can be changed using function

// import java.util.Arrays;
// public class function{
// public static void main(String[] args) {
// int[] arr={1,2,4,5,6};
// change(arr);
// System.out.println(Arrays.toString(arr));
// // to string function converts the text into human readable format: for eg:
// if i gave input:"25" , to string will convert this into twenty-five(into a
// string format).
// }
// static void change(int[]nums){
// nums[0]=99;
// }
// }

// SCOPE:->
// Function Scope and Block Scope
// FUNCTION SCOPE
// ---------------

// import java.util.Scanner;
// public class function{
// public static void main(String[] args) {
// int a=10;
// int b=20;
// }
// static void random(){
// System.out.println(a); // cannot access outside the function
// }
// }

// public class function{
// public static void main(String[] args) {
// // int a=10;
// // int b=20;
// }
// static void sum (){
// int num=67;
// System.out.println(num); // can access within the function
// }
// }

// BLOCK SCOPE
// -------------

// KEY POINTS:-
// 1. Values declared outside block:
// ---------------------------------
// Cannot be reinitialized again inside the block;
// Can be modified inside the block
// Can be accessed inside the block if declared outside.

// 2.Values declared inside block:
// --------------------------------
// Can reinitialize again if value declared inside function.
// Cannot be modified if initialized already inside the block because there is
// no existence of that variable outside the block.
// New object creates
// Can be accessed

// public class function{
// public static void main(String[] args){
// int a=10;
// int b=20;
// {
// // // int a=40; // cannot be reinitialized if initialized outside blocka
// already.
// // // a=30;// can modify the variable inside the block which is already
// initialized outside
// // System.out.println(a);// print the value of modified a.
// int c=99;
// System.out.println(c);
// }
// c=90;//cannot be modified because int c=99 has no value outside block, hence
// cannot modify but can create a new object
// int c=90;//can reinitialize again if value declared inside function //
// creates a new object
// System.out.println(c);// prints value of new object
// }
// }

// SHADOWING:-
// ---------------
// 1. Can only access that variable within its block.
// 2. Lower block can override the higher block.

// public class function{ //->Higher Block
// static int x=100;
// public static void main(String[] args){  // ->Lower Block
// System.out.println(x);
// int x=70; // overrides the value
// System.out.println(x);
// fun();
// }
// static void fun(){
// System.out.println(x);
// }
// }

// Variable Length Arguments:-
// --------------------------
// 3 dots
// Using int ...v or String ...v we can print an array of integers or strings
// and take any number of variable arguments:-
// We can take multiple arguments also: int a ,int b , String ...v: will take
// integers and array of string as well
// Array.toString(v): will print array only not integers

// import java.util.*;
// public class function{
// public static void main(String[] args) {
// fun(2,3,4,5,6,7);
// }
// static void fun(int ...v){
// System.out.println(Arrays.toString(v));
// }
// }

// 2.
// public class function{
// public static void main(String[] args) {
// fun(2,3,"Khushi","Sikka");
// }
// static void fun(int a, int b, String ...v){
// System.out.println("a: " + a + ", b: " + b); // To print integers
// System.out.println(Arrays.toString(v)); // Array.toString(v): will print
// array only not integers
// }
// }

// Method Overloading:-
// --------------------
// When two function have same name , then it can be differently used with help
// of parameters:-
// 1. Either different parameters used: int and String
// 2. No .of arguments
// --------------------

public class function{
public static void main(String[] args) {
fun(40);
}
static void fun(int a){
System.out.println("Hence the integer is: "+a);
}
static void fun(String name){
System.out.println("Hence the name is: "+name);
}
}

// public class function{
// public static void main(String[] args) {
// int ans=fun(40,60,70);
// System.out.println(ans);

// }
// static int fun(int a,int b){
// return a+b;
// }
// static int fun(int c,int d,int e){
// return c+d+e;
// }
// }

// ARMSTRONG NUMBER:-
// --------------------

// import java.util.Scanner;
// public class function{
// public static void main(String[] args) {
// Scanner input=new Scanner (System.in);
// int n=input.nextInt();
// System.out.println(isArmstrong(n));
// to print 3 digit armstrong numbers:-
// -----------------------------------------
// for (int i=100;i<1000;i++){
// if(isArmstrong(i)){
// System.out.print(i+" ");
// }
// }
// }
// static boolean isArmstrong(int n){
// int num=n;
// int sum=0;
// while(n>0){
// int rem=n%10;
// sum=sum+rem*rem*rem;
// n=n/10;
// }
// return sum == num;
// }
// }
