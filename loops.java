                                // for loop:->
// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         System.out.println("Enter number upto which loop should run: ");
//         Scanner input=new Scanner(System.in);
//         int number=input.nextInt();
//         for(int i=0;i<number;i+=2){
//             System.out.println("Hence number "+i +"is =>"+i);
//         }
//     } 
// }



                    //      Q1: Largest of three numbers:-
                    //      Q2: Alphabet Check(lowercase and uppercase)
                    //      Q3: Count no. of occurences
                    //      Q4: Fibonacci series
                    //      Q5: Reverse of a number
                    //      Q6: Calculator program


//                                          // Largest of three numbers:->
// //Method 1:->
                    
// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args) {
//         Scanner inputone=new Scanner(System.in);
//         int a=inputone.nextInt();
//         Scanner inputtwo=new Scanner(System.in);
//         int b=inputone.nextInt();
//         Scanner inputthree=new Scanner(System.in);
//         int c=inputone.nextInt();
//         int max=a;
//         if(b>max){
//             max=b;
//             if(c>max){
//                 max=c; 
//             }
//         }else{
//         max=a;
//        }
// System.out.println("The greatest of all three numbers is:- "+ max);
//     }
// }


//Method 2:->
// OR


// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner inputone=new Scanner(System.in);
//         int a=inputone.nextInt();
//         Scanner inputtwo=new Scanner(System.in);
//         int b=inputone.nextInt();
//         Scanner inputthree=new Scanner(System.in);
//         int c=inputone.nextInt();

//         int result=Math.max(c,Math.max(a, b));
//         System.out.println("Hence largest of three numbers is: "+result);
//     }
// }


                                    // Q2:- To count number of occurences:-


// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//     System.out.print("Enter total number of elements: ");// size 
//     Scanner input=new Scanner(System.in);
//     int n=input.nextInt();
//     System.out.print("Enter number whose occurence you want to find:  ");// whose count:->find element
//     Scanner inputele=new Scanner(System.in);
//     int ele=inputele.nextInt();
// int count=0;
// for(int i=0;i<n;i++){
//     Scanner element=new Scanner(System.in);// input all list of elements
//     int resultant=element.nextInt();
//     if(resultant==ele){// if matches 
//     count++;// increment count variable
// }
// }
// System.out.println("Hence the count of "+ ele+"is "+count);// print count
//     }
// }


// Method 2:->
// OR

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args) {
//         Scanner input=new  Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int number=input.nextInt();
//         System.out.print("Enter the digit to count: ");
//         int n=input.nextInt();
//         int count=0;
//     while(number>0)
//     {
//         int rem=number%10;
//         if(rem==n){
//             count++;
//         }
//        number=number/10;
//     } 
//     System.out.println("Hence the count of "+ n+ " is"+ count);   
//     }}



                                           //      Q3: Alphabet Check(lowercase and uppercase)

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         char ch=input.next().trim().t(0);
//         if(ch>='a' && ch<='z'){
//             System.err.println("The character is lowercase");
//         }
//         else{
//             System.err.println("The character is uppercase");
//           }
//     }
// }

                                       
                                        // Fibonacci Series:-

//    import java.util.Scanner;
//    public class loops{
//  public static void main(String[] args) {
//     System.out.print("Enter upto which  number: ");
//     Scanner input=new Scanner(System.in);
//     int num=input.nextInt();
//     int a=0;
//     int b=1;
//     System.out.print("The Fibonacci series up to " + num + " terms is: ");
//     int count=2;
//     while(count<=num){
//         int temp=b;
//         b=b+a;
//         a=temp;
//         count++;
//         }
//      System.out.println("Hence the number at position "+ num+ " is "+ b);   
//  }
// }


                                                  // Reverse a number

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         System.out.print("Enter a number to reverse : ");
//             Scanner input=new Scanner(System.in);
//             int num=input.nextInt();
//             int digit=0;
//             while(num>0){
//                 int rem=num%10;
//                  digit=(digit*10)+rem;
//                  num=num/10;
//             }
//             System.out.print("Hence Reversed Number is: "+digit);   
//     }
// }


                                             // Calculator program

// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);// to input character and numbers
//         int ans=0;
//         while (true){
//             System.out.print("Enter charater:- "); // print character 
//             char op=input.next().trim().charAt(0);// remove space and char at index 0
//             System.out.println();
//             if(op=='+'|| op=='-'||op=='*'||op=='/'|| op=='%'){
//                 System.out.print("Enter two numbers:- "); // enters two numbers if matches following conditions.
//                 int num1=input.nextInt();
//                 int num2=input.nextInt();
//                 System.out.println();
//                 if(op =='+'){
//                     ans=num1+num2;                   
//                 }
//                 if(op =='-'){
//                     ans=num1-num2;                  
//                 }
//                 if(op=='*'){
//                     ans=num1*num2;                   
//                 }
//                 if(op=='/'){
//                     if(num2!=0){
//                         ans=num1/num2;
//                         }                        
//                     }
//                 if(op=='%'){
//                     ans=num1%num2;                   
//                 }}
//                 else if (op=='x'||op=='X') {
//                    break;
//                 }
//                 else{
//                     System.out.println("Invalid");
//                 }
//                 System.out.println(ans);
//             }
// }}


