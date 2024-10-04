
// import java.util.Scanner;

//                       // Exception Handling:- unexpected error occur during program execution:( In try block we write the code in which exception/error could be there and in catch block we write code to detect specific exception and print something)
//                     //-----------------------------------------------------------------------


// // public class ExceptionHandling{
// //     public static void main(String args[]){
// //         int[]a=new int[5];
// //         System.out.println(a[0]); // By default will print 0 as a value.
// //         System.out.println(a[8]); // ArrayOutofBound Exception
// //         System.out.println("Hello guys"); // will not print this line since exception happened in second line.
// //         // Exception types:( Runtime and I/O )
// //     }
// // }
 

//                                           // TO HANDLE EXCEPTIONS:-
//                                         //----------------------------


public class ExceptionHandling{
    public static void main(String args[]){
        int[]a=new int[5];
        System.out.println("Hello guys"); 
        try{
        System.out.println(a[8]); 
        } 
        catch( ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of Bound Exception");
        }
        System.out.println("Bye guys");      
    }
}

// // the try and catch block will detect the exception and continue the execution to next line , the execution will not stop due to exception.


//                                     // Multiple exceptions handle: 1.) using pipe method ( to print same response )
//                                 //                                 2.) or use multiple catch methods ( for different responses )
//                                 //------------------------------------

// // public class ExceptionHandling{
// //     public static void main(String args[]){
// //         int[]a=new int[5];
// //         System.out.println("Hello guys"); 
// //         try{
// //         System.out.println(7/0); 
// //         } 
// //         catch( ArrayIndexOutOfBoundsException  | ArithmeticException e){
// //             System.out.println("Index is out of Bound Exception or divide by zero");
// //         }
// //         System.out.println("Bye guys"); 
// //     }
// // }
  
//                                 // Exception( parent class of all exceptions , if we include this it will handle all exceptions )
//                             //---------------------------------------------------------------------------------------------------

        

// // public class ExceptionHandling{
// //     public static void main(String args[]){
// //         int[]a=new int[5];
// //         System.out.println("Hello guys"); 
// //         try{
// //         System.out.println(7/0); 
// //         } 
// //         catch( Exception e){ // to handle all types of exception
// //             System.out.println("Index is out of Bound Exception or divide by zero");
// //         }
// //         System.out.println("Bye guys"); 
// //     }
// // }

//                                       // finally: even if we donot handle error it will run. 
//                                     //-------------------------------------------------------

                    
// // public class ExceptionHandling{
// //     public static void main(String args[]){
// //         int[]a=new int[5];
// //         System.out.println("Hello guys"); 
// //         try{
// //         System.out.println(7/0); 
// //         } 
// //         catch( Exception e){ // to handle all types of exception
// //             System.out.println("Index is out of Bound Exception or divide by zero");
// //         }
// //         finally{
// //             System.out.println("I will run always");  // will run even if we catch  is not used to handle error
// //         }
// //         System.out.println("Bye guys"); 
// //     }
// // }


//                                                // Java Throw or Throws
//                                             //---------------------------


// // Throw keyword is used to explicitly create a single exception.. to handle custom exception
// import java.util.*;
// public class ExceptionHandling{
//     public static void main(String args[]){
//        Scanner input=new Scanner(System.in);
//        try {
//            int n=input.nextInt();
//            if(n>100){
//           throw new Myexception("custom expression");
//            }

//        } catch (Myexception e) {
//         System.out.println(e.getMessage());
//        }
//        catch(Exception e){ // if any other type of exception occurs
//         System.out.println(e);
//        }      
// }
// static class Myexception extends Exception{
//     public Myexception(String message){
//         super(message);
//     }
// }
// }


// here in this we are generating custom exception from our side: if condition matches it would explicitly throw exception with a message by using super message keyword.


                       // Questions:-
                       //------------


// Q1 Password valid or not:-1.) Custom Exception Class, Main class, Password validator class
// QUESTION:-
//=============
//Write a program to accept user name and password from the user.
// If the password has less than 6 characters then throw an exception as character 's'
// If the password does not contain a digit then throw an exception as character 'd'.
// For handling exception implement necessary catch blocks and print the messages accordingly.
// Sample Input1

// Arun
// abcd123
// SampleOutput1

// Correct
// Sample Input2

// Arun
// abcdefgh
// SampleOutput2

// No digit!
// Sample Input3

// Arun
// abc1
// SampleOutput3

// Too short!
//---------------------------------------------------------------------------------------------------------------------------------------------

// import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
// custom exception for minimum characters
// class PasswordLengthException extends Exception{
//   public PasswordLengthException(String message){
//     super(message);
//   }
// }
// // custom exception for not having a digit
// class PasswordDigitException extends Exception{
//   public PasswordDigitException(String message){
//     super(message);
//   }
// }
// validate or check password
// class validatePassword{
//   public static void passwordvalidation(String password) throws PasswordLengthException, PasswordDigitException{
//     if(password.length()<6){
//       throw new PasswordLengthException("Too short!");
//     } 
// if(!password.matches(".*\\d.*")){
//   throw new PasswordDigitException("No digit!");
// }
//   }
//   }
//   class ExceptionHandling
// {
//   public static void main(String[] args)
//   {
//     Scanner sc=new Scanner(System.in);
//     String username=sc.nextLine();
//     String password=sc.nextLine();
//     try{
//       validatePassword.passwordvalidation(password);
//       System.out.println("Correct");
//     }
//     catch(PasswordLengthException s){
//       System.out.println(s.getMessage());
//     }
//     catch(PasswordDigitException d){
//         System.out.println(d.getMessage());
//     }
//       sc.close();
//     }
//   }



//  Q2. Valid index of array
//----------------------------


// import java.util.*;
// public class ExceptionHandling{
//     public static void main(String[] args) {
//     System.out.println("Enter index to access ");
//     Scanner in=new Scanner(System.in);
//     int index=in.nextInt();
//     int[]arr={1,2,4,5};
//   try {
//       System.out.println("Element is at correct index ,  element present at this index is "+ arr[index]);
//   } catch (ArrayIndexOutOfBoundsException e) {
//     System.out.println("invalid index , no element found at this index ");
//   }
    
// }
// }



// import java.util.*;
// public class ExceptionHandling{
//     public static void main(String[] args) {
//     System.out.println("Enter index to access ");
//     Scanner in=new Scanner(System.in);
//     int index=in.nextInt();
//     int[]arr={1,2,4,5};
//   try {
//       System.out.println("Element is at correct index ,  element present at this index is "+ arr[index]);
//   } catch (ArrayIndexOutOfBoundsException e) {
//     System.out.println("invalid index , no element found at this index ");
//   } 
// }
// }



                              // Question 2:- Valid Email Address:-
                              //====================================


                            //   Valid email address star_border
                            //   Check an email-id for following exceptions
                            //   if id does not contain '@' OR
                            //   if id does not contain '.' (dot) OR
                            //   if no '.' (dot) appears after '@'
                            //   catch the exception and print "Invalid" or "Valid" accordingly.
                              
                              



// import java.util.Scanner;
// // Other imports go here
// // Do NOT change the class name

// // custom exception for not having @ operator
// class emailmissingatException extends Exception{
//   public emailmissingatException(String message){
//     super(message);
//   }
// }
// // custom exception for not having dot erator
// class emailmissingdotException extends Exception{
//   public emailmissingdotException(String message){
//     super(message);
//   }
// }
// // custom exception for not having dot after @operator
// class emailmissingdotafteratException extends Exception{
//   public emailmissingdotafteratException(String message){
//     super(message);
//   }
// }
// class validateemail{
//   public static void emailvalidation(String email)throws emailmissingatException,emailmissingdotException, emailmissingdotafteratException{
//     if(!email.contains("@")){
//       throw new emailmissingatException("Invalid");
//     }
//     if(!email.contains(".")){
//      throw new emailmissingdotException("Invalid");
//     }
//     int atIndex=email.indexOf('@');
//     if(atIndex==-1 || atIndex==email.length()-1){
//       throw new emailmissingdotafteratException("Invalid");
//     }
//     String domainpart=email.substring(atIndex+1);
//     if(!domainpart.contains(".")){
//       throw new emailmissingdotafteratException("Invalid");
//     }
//   }
// }
// class Main
// {
//   public static void main(String[] args)
//   {
//     Scanner sc=new Scanner(System.in);
//     String email=sc.nextLine();
//     try{
//       validateemail.emailvalidation(email);
//       System.out.println("Valid");
//     }
//     catch(emailmissingatException a ){
//       System.out.println(a.getMessage());
//     }
//         catch(emailmissingdotException b ){
//       System.out.println(b.getMessage());
//     }
//         catch(emailmissingdotafteratException c ){
//       System.out.println(c.getMessage());
//     }
//   }
// }



                                        // Question 3:- Valid Index of Array:-
                                     //==========================================

                            

// import java.util.Scanner;
// public class ExceptionHandling{
//     public static void main(String[] args) {
//         // size of array:-
//         Scanner in=new Scanner(System.in);
//         int size=in.nextInt();
//         // input elements of array:-
//         int[]arr=new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=in.nextInt();
//         }
//         // no.of times input has to be given: queries
//         int q=in.nextInt();
//         // queries of index ( 2 baar index lena hai )
//         for(int j=0;j<q;j++){
//             int index=in.nextInt();
//         try {
//             if(index<0 || index>arr.length){
//         throw new ArrayIndexOutOfBoundsException();
//             }
//             else{
//                 System.out.println(arr[index]);
//             }
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Out of Bounds");
//         }
//     }
// }
// }