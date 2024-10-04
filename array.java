

                                  // ARRAY:- 
                                
// KEY POINTS:-
// 1. COLLECTION OF SAME DATA TYPES
//2. DOES NOT STORE DATA IN CONTINOUS MEMORY LOCATION
//-----------------------------|
// STRINGS: Immutable in Java. |
// ARRAYS: Mutable in Java.    |
//-----------------------------|



                                     // INPUT OF ARRAY + Searching for target (linear search)
                                  //-----------------------------------------------------------
// METHOD 1:-
// --------------                                     
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();//SIZE
//         int target= input.nextInt();
//         // DECLARATION AND INITIALISATION OF ARRRAY:-
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=input.nextInt();
//         } 
//         boolean ans =false;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==target){
//                 ans=true;
//             }     
//         }
//         if(ans){
//             System.out.println("Target found");
//         }
//         else{
//             System.out.println("Target not found");
//         }
//     }
// }


// METHOD 2:-
//------------

// import java.util.*;
// public class arrayintro {
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();//SIZE
//         // DECLARATION AND INITIALISATION OF ARRRAY:-
//         int[] arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=input.nextInt();
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }



// Modify array:-
//----------------


// import java.util.*;
// public class arrayintro{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int[]arr=new int[n];
//         for(int i=0;i<arr.length;i++){
//             arr[i]=input.nextInt();
//         }
//         change(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     static void   change(int[]nums){
//         nums[0]=2;
//     }
// }



// Strings:-
//---------


// import java.util.*;
// public class arrayintro{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//        int n=input.nextInt();
//         String[]str=new String[n];
//         for(int i=0;i<str.length;i++){
//             str[i]=input.next();
//         }
//         System.out.println(Arrays.toString(str));
//     }  
// }



 import java.util.Arrays;
public class array {
   public static void main(String[] args) {
      int[]nums={100,4,200,1,3,2};
      System.out.println(longestConsecutive(nums));
   }
   static int longestConsecutive(int[] nums) {
      // sort array
   Arrays.sort(nums);
   System.out.println("Here is sorted array: "+Arrays.toString(nums));
     // find longest subsequence
   int count=0;
   for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
         if(nums[j]==nums[i]+1){
            count++;
            break;
         }
      }
   }
   return count+1;
   }
}