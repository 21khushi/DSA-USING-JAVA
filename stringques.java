                
                
                 // 1. Swap first and last character of each word of a string:-
                 // store first character and increment rest characters till space is encountered
                //-------------------------------------------------------------------------------

// import java.util.*;
// public class stringques{
//     static String swap_word(char[]namearray){
//         for(int i=0;i<namearray.length;i++){
//             int k=i; // to store start character of every word
//             while(i<namearray.length && namearray[i]!=' '){
//                 i++;} // it is used to find end char of every word till space is encountered
//                 char temp=namearray[k]; // swap 
//                 namearray[k]=namearray[i-1];
//                 namearray[i-1]=temp;
//             }       
//             return new String(namearray); // convert char array back to string            
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter a string");
//         Scanner input=new Scanner(System.in);
//         String name=input.nextLine();
//         char[]namearray=name.toCharArray();
//         String final_swapped_array=swap_word(namearray);
//         System.out.println("Hence final array after swapping first and last word of each word of a string is:-");
//         System.out.println(final_swapped_array);
//     }
// }


                    // 2. Capitlaize each character of a word in String: store first character and increment rest characters till space is encountered
                    //---------------------------------------------------------------------------------------------------------------------------------------

 
// import java.util.*;
// public class stringques{
//     static String capitalize(char[]namearray){
//         for(int i=0;i<namearray.length;i++){
//             int k=i; // to store start character of every word
//             while(i<namearray.length && namearray[i]!=' '){
//              i++;} // increment in will only be there when i is not first letter
//              if(namearray[k]>='a' && namearray[k]<='z'){
//              namearray[k]=(char)((int)(namearray[k])-32);
//             }       }
//             return new String(namearray); // convert char array back to string            
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter a string");
//         Scanner input=new Scanner(System.in);
//         String name=input.nextLine();
//         char[]namearray=name.toCharArray();
//         String final_capitalize=capitalize(namearray);
//         System.out.println("Hence final array after capitalizing first letter of each word of a string is:-");
//         System.out.println(final_capitalize);
//     }
// }

                              // 3. Find occurences of palindrome words in a String: 
                            //-------------------------------------------------------


// import java.util.*;
// public class stringques{
// // to check a string is palindrome or not:-
// //==========================================
//     static boolean ispalindrome(char[]namearray, int start,int end){
//         while(start<end){
//         if(namearray[start]!=namearray[end]){
//          return false;
//         }
//         start++;
//         end--;
//     }
//  return true;         
//     }
//     static int palindrome(char[]namearray){
//         int count=0;
//         for(int i=0;i<namearray.length;i++){
//             int k=i; // store first character of every word of a string. 
//             while(i<namearray.length && namearray[i]!=' '){
//                 i++; // increment if it is not first word till it reaches or encounters a space.
//             }
//            if(ispalindrome(namearray, k, i-1)){
//             count++;
//            }
//             }
//             return count;
//         } 
//     public static void main(String[] args) {
//         System.out.println("enter a string");
//         Scanner input=new Scanner(System.in);
//         String name=input.nextLine();
//         char[]namearray=name.toCharArray();
//         int count_palindrome=palindrome(namearray);
//         System.out.println("Hence occurences of palindrome are:-");
//         System.out.println(count_palindrome);
//     }
// }




// to reverse a string
//=======================

// import java.util.*;
// public class stringques{
//   public static void main(String[] args) {
//     Scanner in=new Scanner(System.in);
//     String sentence=in.next();
//     char[]array=sentence.toCharArray(); // to convert input string to character array(indexing can be done in character array)
//     reverse(array);
//     System.out.println(Arrays.toString(array)); // to print in form of array:-
//   }
//   static void reverse(char[]array){
//     int start=0;
//     int end=array.length-1;
//     while(start<end){
//       char temp=array[start];
//       array[start]=array[end];
//       array[end]=temp;
//       start++;
//       end--;
//     }
//   }
// }



// to check if string is palindrome or not:-
//-------------------------------------

// import java.util.*;
// public class stringques{
//   public static void main(String[] args) {
//       Scanner in=new Scanner(System.in);
//       String name=in.next();
//       if(palindrome(name)){
//         System.out.println("True");
//       }
//       else{
//         System.out.println("False");
//       }
//   }
// static boolean palindrome(String name){
//     for(int i=0;i<name.length()/2;i++){
//       if(name.charAt(i)!=name.charAt(name.length()-1-i)){
//      return false;
//       }
//     }
//     return true;
//   }
// }




// reverse a string:-(without using character array )
//------------------------------------------------------



// import java.util.*;
// public class stringques{
//   public static void main(String[] args) {
//       Scanner in=new Scanner(System.in);
//       String name=in.next();
//     if(reverse_string(name)){
//       System.out.println("true");
//     }
//     else{
//       System.out.println("False");
//     }
//   }
//   static boolean reverse_string(String name){
//     String rev="";
//     for(int i=name.length()-1;i>=0;i--){
//        rev+=name.charAt(i);
//     }
//     return rev.equals(name);  }
// }



