
                                       // Left Shift:-
                                   //---------------------
                                   // Formula:- ax(2^b)
                                   // example:- int a=6
                                   // a<<2       =>b
                                   // ans:- 6x(2^2)=6x4=24



// public class left_shift {
//     public static void main(String[] args) {
//     int a=6;
//     int result= a<<2;
//     System.out.println(result);
//     }
// }


                                     
                                       // Right Shift:-
                                   //---------------------
                                   // Formula:- a/(2^b)
                                   // example:- int a=5
                                   // a>>1      =>b
                                   // ans:- 5/2^1 = 2.5
                                    



// public class left_shift {
//     public static void main(String[] args) {
//     int a=5;
//     int result= a>>1;
//     System.out.println(result);
//     }
// }



                                  // EVEN AND ODD CHECK
                                 //--------------------


// import java.util.Scanner;
// public  class  left_shift{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int bitmask=1;
//         if((n & bitmask)==0){  // LSB IF 0: EVEN ELSE ODD
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }
//     }
// }



                            // To find nth position bit
                        //---------------------------------


// import java.util.Scanner;
// public  class  left_shift{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int i=input.nextInt();
//         int bit=(n>>i)&1;
//         System.out.println(bit);
//         }
//     }




                               // Clear ith bit: set ith bit to zero
                        //--------------------------------------------



//  import java.util.*;
//  public class left_shift{
//     public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);
//     System.out.print("Enter the number: ");
//             int n=input.nextInt();
//             System.out.print("Enter the bit position to clear (0-indexed): ");
//             int i=input.nextInt();
//             int result= ~(1<<i); // to set all bits to 1 except ith bit
//             int ans=result & n; // to clear ith bit
//             System.out.println("Number after clearing the " + i + "th bit: " + ans);
//         }}




                              // clear last ith bit : sets last two bits to zero
                            //-------------------------------------------------
                        

//  import java.util.*;
//  public class left_shift{
//     public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);
//     System.out.print("Enter the number: ");
//             int n=input.nextInt();
//             System.out.print("Enter the bit position to clear (0-indexed): ");
//             int i=input.nextInt();
//             int result= ~((1<<i)-1); // to set all bits to 1 except ith bit
//             int ans=result & n; // to clear ith bit
//             System.out.println("Number after clearing the " + i + "th bit: " + ans);
//         }}





                                    //  Power of 2 or not
                                 //---------------------------


// import java.util.*;
// public class left_shift{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n=input.nextInt();
//         boolean ans=powerof2(n);
//         System.out.println(ans);
//     } 
//    static boolean powerof2(int n){
//     if(n<=0){
//         return false;
//     }
//     else{
//         return (n&(n-1))==0;
//     }
//     }
// }


                         //  swap two numbers
                        //--------------------


// import java.util.*;
// public class left_shift{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.print("Enter the number 1st: ");
//         int n1=input.nextInt();
//         System.out.print("Enter the number 2nd: ");
//         int n2=input.nextInt();
//         System.out.println("Hence before swaping: "+ n1);
//         System.out.println("Hence before swaping: "+ n2);
//         n1=n1^n2;
//         n2=n1^n2;
//         n1=n1^n2;
//         System.out.println("Hence after swaping: "+ n1);
//         System.out.println("Hence after swaping: "+ n2);
//     } }




    
      