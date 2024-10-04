 
                                         // Switch Case Statements:-
// Choose a fruit:-
// import java.util.Scanner;
// public class Switch {
//     public static void main(String[] args){
//     Scanner input=new Scanner(System.in);
//     String fruit=input.next();
//     switch (fruit){
//         case "Apple":
//         System.out.println("My favourite red color fruit");
//         break;   
//         case "Orange":
//         System.out.println("This is a orange color fruit");
//         break;
//         case "Mango":
//         System.out.println("This is king of fruits yellow color");
//         break;
//         case "Grapes":
//         System.out.println("This is a sour green color fruit");
//         break;
//         default:
//         System.out.println("This is not a fruit");
//         break;
//    }
//    }
// }
                          // Choose a day from 1 to 7:-

// import java.util.Scanner;
// public class Switch{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         int number=input.nextInt();
//         switch(number){
//             case 1:
//             System.out.println("Monday");
//             break;
//             case 2:
//             System.out.println("Tuesday");
//             break;
//             case 3:
//             System.out.println("Wednesday");
//             break;
//             case 4:
//             System.out.println("Thursday");
//             break;
//             case 5:
//             System.out.println("Friday");
//             break;
//             case 6:
//             System.out.println("Saturday");
//             break;
//             case 7:
//             System.out.println("Sunday");
//             break;
//             default:
//             System.out.println("Not a valid day");
//         }
//      }   
// }

                          // Enhanced Switch:-

// import java.util.Scanner;
// public class Switch{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         int number=input.nextInt();
//         switch(number){
//             case 1->  System.out.println("Monday");
//             case 2-> System.out.println("Tuesday");
//             case 3->  System.out.println("Wednesday");
//             case 4-> System.out.println("Thursday");
//             case 5->  System.out.println("Friday");
//             case 6-> System.out.println("Saturday");
//             case 7-> System.out.println("Sunday");
//             default->System.out.println("Not a valid day");        
//         }
//      }
//     }
                             

                              // Weekday and Weekend


// import java.util.Scanner;
// public class Switch{
//     public static void main(String[] args){
//     Scanner input=new Scanner(System.in);
//     int num=input.nextInt();
//     switch(num){
//         case 1:
//         case 2:
//         case 3:
//         case 4:
//         case 5:
//         System.out.println("Its a Weekday ");
//         break;
//         case 6:
//         case 7:
//         System.out.println("Its a Weekend ");
//         break;
//         default:
//         System.out.println("Invalid ");
//     }}
// }



                    // Nested Switch

// Given empid and department number 

// import java.util.Scanner;
// public class Switch{
//     public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);
//     int empid=input.nextInt();
//     String departname=input.next();
//     switch(empid){
//         case 1:
//         System.out.println("Khushi Sikka");
//         break;
//         case 2:
//         System.out.println("Anvi Malik");
//         break;
//         case 3:
//         System.out.println("Vaishnavi Singh");
//         // Enter department:-
//         switch(departname){
//             case "IT":
//             System.out.println("Belongs to IT department");
//             break;
//             case "CSE":
//             System.out.println("Belongs to CSE department");
//             break;
//             case "AI":
//             System.out.println("Belongs to AI department");    
//             break;
//             default:
//             System.out.println("Not a valid department");  
//         }
//         break;
//         default:
//         System.out.println("Enter correct Employee ID ");
//     }
// }}