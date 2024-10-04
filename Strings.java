
// import java.lang.reflect.Array;


                //---------------------
                  // immutable in nature 
                 // denoted by " "
                //  always concatenate
                // comparison:-> == method( pointing to same refernce object )
              //                .equals ( compares by value )




// String Pool:- when both point to same object then it gets stored in memory inside heap.
// public class string{
//     public static void main(String[] args) {
//         String name="Khushi";
//         String b="Khushi";
//        System.out.println(b); 
//     }
// }


// Strings are immutable in nature:- you cannot update existing string , a new string needs to be created.
// public class string{
//     public static void main(String[] args) {
//         String name="Khushi";
//         String name="Sikka"; // String is already created
//         name="Sikka"; // New object is created.
//        System.out.println(name); 
//     }
// }



// Comparison operator in strings:- (==  or .equals)
// import java.util.*;
// public class Strings{
//     public static void main(String[] args) {
//         String name="Khushi";
//         String b="KHUSHI";
//        System.out.println(name==b);  // compares by reference (False)
//        System.out.println(name.equals (b)); // compares by values, matches all characters. (false)
//        String c="Khushi" ;
//        System.out.println(name==c);
//        System.out.println(name.equals(c));
//        String d=new String("Khushi");
//        System.out.println(name==d); // here since new string is created so both name and d are pointing to different objects(different refernces )
//        System.out.println(name.equals(d));
//        }
// }



// // TO create a String object
// public class string{
//     public static void main(String[] args) {
//         String object=new String("New object created");
//         System.out.println(object);
//        }
// }



// to print a specific character in a String:=>
// public class string{
//     public static void main(String[] args) {
//         String object=new String("New object created");
//         System.out.println(object.charAt(1));
//        }
// }


// Concatenation of Strings in Java->
//-----------------------------------
// 1. Strings: do concatenate/join.("a"+"b"):-ab
// 2. Char: ASCII VALUES ADD UP: ('a'+1)=66
// 3. If there is atleast one string also then the objects can be concatenated.


// public class Strings{
//     public static void main(String[] args) {
//         System.out.println('a'+'b');
//         System.out.println("a"+"b");
//         System.out.println("a"+1);
//         System.out.println('a'+1);
//         System.out.println("Khushi"+56);
//         System.out.println('a'+" "+66+10); // a 6610 // strings always concatenate
//         System.out.println('a'+66+10); //  173
//        }
// }



// Java does not perform operator overloading
//--------------------------------------------



// String Builder:-to avoid string wastage,to reduce time complexity:-O(N)
//------------------------------------------------------------------------


// public class string{
//         public static void main(String[] args) {
//            StringBuilder builder=new StringBuilder();
//            for(int i=0;i<26;i++){
//             char ch=(char)('a'+i);
//             builder.append(ch); // appends to end of string without always creating a new object.
//            }
//            System.out.println(builder.toString());
//            }





// Character Array:-
//------------------
 
// import java.util.*;
// public class string{
//         public static void main(String[] args) {
//           String name="KHUSHI SIKKA";
//           System.out.println(Arrays.toString(name.toCharArray()));
//         }
//         }




// import java.util.*;
// public class string{
//         public static void main(String[] args) {
//           String name="My name is Khushi";
//           for(int i)
//         }
//         }






