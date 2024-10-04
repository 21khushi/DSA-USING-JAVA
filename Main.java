
                        //              Lecture 1
                        // TO PRINT IST PROGRAM IN JAVA : HELLO WORLD





//  public class Main {
//     public static void main(String[] args){
//         // System.out.println("Hello world");           // TO PRINT HELLO WORLD
//         System.out.println(args[1]);    
// TO PASS INPUT ARRAY AS ARGUMEMT AND THEN PRINT VALUE BY ACCESSING INDEX OF ARGUMENT(java Main 30 "Khushi").


// String ch=input.nextLine();  // to print complete line even the word after space.
// char target=input.next().charAt(0); to print a single character;
//     }
// }


                              // QUESTION 1.
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
//         double j=scan.nextDouble();
//         scan.nextLine();
//         String k=scan.nextLine();
//         System.out.println("String: " + k);
//         System.out.println("Double: " + j);
//         System.out.println("Int: " + i);
//     }
// }


// Here after integer and double when we press enter to enter next input string takes that as input(blank line) so scan next line is used to read the line till next enter is pressed.ja



                                           // Input of a number:-


// import java.util.Scanner;
// public class Main{
// public static void main(String[] args){
//         System.out.println("Enter a number: ");
//         Scanner in= new Scanner(System.in);
//         int number=in.nextInt();
//         System.out.println("Hence the number is -"+ number);
//     }
// }





                                     // Sum of two numbers:-



// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args){
//         System.out.print("Enter first number to perform calculation: ");
//         Scanner inputone=new Scanner(System.in);
//         int a=inputone.nextInt();
//         System.out.print("Enter second number to perform calculation: ");
//         Scanner inputtwo=new Scanner(System.in);
//         int b=inputtwo.nextInt();
//         int c=a+b;
//         System.out.println("Hence sum of first and second number is = "+ c);
    
// }
// }




                            // for loop 


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//     Scanner input=new Scanner(System.in);
//     int n=input.nextInt();
//     int i;
//     for( i=0;i<n;i++){
//         System.out.println("Hence the number is: "+i);
//     }
// }}



                      // while loop


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner inputnumber=new Scanner(System.in);
//         int n=inputnumber.nextInt();
//         int i=0;
//         while( i!=n){
//             System.out.println("Number is: "+i);
//             i++;
//         }
      
//     }
// }




               // temperature from Celsius to Fahrienheit


// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args) {
//     System.out.println("Enter number in Celsius: ");
//     Scanner C=new Scanner(System.in);
//     float num=C.nextFloat();
//     float fah=(9.0f/5.0f)*num+32;
//     System.out.println("Hence the number in fahrienheit is : "+fah);

// }}