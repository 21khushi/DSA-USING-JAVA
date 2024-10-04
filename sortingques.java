                               // Ques 1: Square of Sorted Array:-
                            //----------------------------------------
// import java.util.*;
// public class sortingques{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter size of array:-");
//         int n=input.nextInt();
//         int[]arr=new int[n];
//         System.out.println("Enter elements of array:-");
//         for(int i=0;i<n;i++){
//             arr[i]=input.nextInt();
//         }
//         arr=square(arr);
//         sortarray(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     static int[]square(int[]arr){
//         for(int i=0;i<arr.length;i++){
//             arr[i] = (int) Math.pow(arr[i], 2);
//         }
//         return arr;
//     }
//     static void sortarray(int[]arr){
//         for(int i=0;i<arr.length;i++){
//             for(int j=1;j<arr.length;j++){
//                 if(arr[j]<arr[j-1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j-1];
//                     arr[j-1]=temp;
//           }
//             }
//         }
//     }
// }


// LEETCODE APPROACH:-
//--------------------

// class Solution {
//    public int[] sortedSquares(int[] nums) {
//    int[]squares=new int[nums.length];
//        for(int i=0;i<nums.length;i++){
//            squares[i]=nums[i]*nums[i];
//        }
//        sortarray(squares);
//        return squares;
//    }
//     void sortarray(int[]nums){
//        for(int i=0;i<nums.length;i++){
//            for(int j=1;j<nums.length;j++){
//                if(nums[j]<nums[j-1]){
//                    int temp=nums[j];
//                    nums[j]=nums[j-1];
//                    nums[j-1]=temp;
//                }
//            }
//        }
//     }
// }



  // Ques 2: Merge two Sorted Array:-
  //----------------------------------------


//  class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i=m-1; // last element of nums1
//          int j=n-1; // last element of nums2
//           int k=(m+n)-1; // last element of m+n size array
//                      while(j>=0){
//                                if(i>=0 && nums1[i]>nums2[j]){
//                                          nums1[k--]=nums1[i--];
//                                      }
//                                else{
//                               nums1[k--]=nums2[j--];
//                                      }
//                                 }
//                             }}





 
  // Ques 3: Missing Number ( 1toN ):- https://leetcode.com/problems/missing-number/
  //---------------------------------------------------------------------------------
  // 1. Sort the Array first 
  // 2. Here index==value
  // 3. then find missing value , any index whose element is not equal to index value is missing else N(arr.length) is missing value.
  // sort swap missing
  //-------------------------



// import java.util.*;
// public class sortingques{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter size of array:-");
//         int n=input.nextInt();
//         int[]arr=new int[n];
//         System.out.println("Enter elements of array:-");
//         for(int i=0;i<n;i++){
//             arr[i]=input.nextInt();
//         }
//         sort(arr);
//        int result= missing_num(arr);
//         System.out.println("Hence the missing number is:-"+result);
//       }
//       //  sort array using cycle sort(index==value){ range 0 to n }
//       static void sort(int[]arr){
//             int i=0;
//             while(i<arr.length){
//                   int correct=arr[i]; // same index same value
//                   if(arr[i]<arr.length && arr[i]!=arr[correct]){  // Donot include n since an element is missing.
//                         swap(arr,i,correct);
//                   }
//                   else{
//                         i++;
//                   } 
//             }
//       }
//       static void swap(int[]arr,int first,int last){
//                   int temp=arr[first];
//                   arr[first]=arr[last];
//                   arr[last]=temp;
//             }
//       // to find which number is missing: whose index value does not matches to value of element. 
//       // or case 2 : N ( arr.length ) ... last number is missing.
//       static int missing_num(int[]arr){
//             for(int j=0;j<arr.length;j++){
//                   if(arr[j]!=j){
//                         return j;
//                   }    
//             }
//             return arr.length;
//       }    
// }

 
  // Ques 4: Find All Numbers Disappeared in an Array:-https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/solutions/
  //------------------------------------------------------------------------------------------------------------------------------------
  // 1 to N: index sort:- index=value-1
  // 0 to N index sort:- index=value;


//   class Solution {
//       public List<Integer> findDisappearedNumbers(int[] nums) {
//           int i=0;
//           while(i<nums.length){
//               int correct=nums[i]-1;
//               if(nums[i]!=nums[correct]){
//                   swap(nums,i,correct);
//               }
//               else{
//                   i++;
//               }
//           }
//           List<Integer>ans=new ArrayList<>();
//           for(int j=0;j<nums.length;j++){
//               if(nums[j]!=j+1){
//                   ans.add(j+1);
//               }
//           }
//           return ans;
//       }
//       void swap(int[]nums,int first,int last){
//           int temp=nums[first];
//           nums[first]=nums[last];
//           nums[last]=temp;
//       }
//   }


 //    Ques 5. Find  a Duplicate Number:-
 //-----------------------------------------
 // example: 1,2,3,4,2: dup==2;



// import java.util.*;
// public class sortingques{
//   public static void main(String[] args) {
//             Scanner input=new Scanner(System.in);
//             System.out.println("Enter size of array:-");
//             int n=input.nextInt();
//             int[]arr=new int[n];
//             System.out.println("Enter elements of array:-");
//             for(int i=0;i<n;i++){
//                 arr[i]=input.nextInt();
//             }
//           int ans=duplicate(arr);
//           System.out.println(ans);
// }
// static int duplicate(int[]arr){
//   int i=0;
//   while(i<arr.length){
//   if(arr[i]!=i+1){ // not at original index: can be duplicate or a unique element.
//       int correct=arr[i]-1;
//       if(arr[i]!=arr[correct]){ // unique element so swap to bring to correct index.
//         swap(arr,i,correct);
//       }
//       else{
//         return arr[i]; // duplicate element
//       }
//     }
//     else{
//         i++;
//     }
//     }
//   return -1;
// }
//     static void swap(int []arr , int first, int second){
//       int temp=arr[first];
//       arr[first]=arr[second];
//       arr[second]=temp;
//     }
//   }




// Ques 6. Find all duplicate numbers:-
//---------------------------------------

// import java.util.ArrayList;
// import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// public class sortingques {
//     public List<Integer> findDuplicates(int[] arr) {
//         int i = 0;
//         while (i < arr.length) {
//             int correct = arr[i] - 1;
//             if (arr[i] != arr[correct]) {
//                 swap(arr, i , correct);
//             } else {
//                 i++;
//             }
//         }
//         List<Integer> ans = new ArrayList<>();
//         for (int index = 0; index < arr.length; index++) {
//             if (arr[index] != index+1) {
//                 ans.add(arr[index]);
//             }
//         }
//         return ans;
//     }
//     static void swap(int[] arr, int first, int second) {
//         int temp = arr[first];
//         arr[first] = arr[second];
//         arr[second] = temp;
//     }
// }





// Ques 7. Set Mismatch:-(find duplicate and  missing no. both):( arr[i]: duplicate element , i+1=missing element)
//--------------------------------------------------------------------------------------------------------------------


// import java.util.*;
// public class sortingques{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//             System.out.println("Enter size of array:-");
//             int n=input.nextInt();
//             int[]arr=new int[n];
//             System.out.println("Enter elements of array:-");
//             for(int i=0;i<n;i++){
//                 arr[i]=input.nextInt();
//             }
//            int[]result= setmismatch(arr);
//            System.out.println(Arrays.toString(result));
//     }
//    static int[] setmismatch(int[]arr){
//      int i=0;
//      while(i<arr.length){
//         int correct=arr[i]-1; // determines correct position of element(index=value-1)
//                 if(arr[i]!=arr[correct]){
//                     swap(arr,i,correct);
//                 }
//                 else{
//                     i++;
//                 }
//      }
//      // sorted the array already now look for missing and duplicate elements.
//      for( i=0;i<arr.length;i++){
//         if(arr[i]!=i+1){
//             return new int[]{arr[i],i+1}; // duplicate , missing 
//         }
//      }
//      return new int[]{-1, -1};
//    }
//    static void swap(int[]arr,int first,int last){
//     int temp=arr[first];
//     arr[first]=arr[last];
//     arr[last]=arr[first];
//    }



// Ques 8.  Find Missing Positive:-
//----------------------------------

// import java.util.*;
// public class sortingques{
//   public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);
//                 System.out.println("Enter size of array:-");
//                 int n=input.nextInt();
//                 int[]arr=new int[n];
//                 System.out.println("Enter elements of array:-");
//                 for(int i=0;i<n;i++){
//                     arr[i]=input.nextInt();
//                 }
//                 int result=missing(arr);
//                 System.out.println(result);
//   }
//   static int missing(int[]arr){
//     int i=0;
//     // sort the array:-
//     while(i<arr.length){
//       int correct=arr[i]-1;
//       if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correct]){
//         swap(arr,i,correct);
//       }
//       else{
//         i++;
//       }
//     }
//     // find missing no. which is nothing but index+1:-
//     for ( i = 0; i < arr.length; i++) {
//       if(arr[i]!=i+1){
//         return i+1;
//       }  
//     }
//     return arr.length;
//   }
// // swap two numbers:-
//   static void swap(int[]arr,int first,int last){
//      int temp=arr[first];
//      arr[first]=arr[last];
//      arr[last]=temp;
//   }
// }


// Ques 9.  Find Majority element:-
//----------------------------------


// import java.util.*;
// public class sortingques{
//       public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);
//                 System.out.println("Enter size of array:-");
//                 int n=input.nextInt();
//                 int[]nums=new int[n];
//                 System.out.println("Enter elements of array:-");
//                 for(int i=0;i<n;i++){
//                     nums[i]=input.nextInt();
//                 }
//               int result=majorityele(nums);
//               System.out.println(result);
// }
// static int majorityele(int[]nums){
//       int count;
//       int max=0;
//       int majorityele=nums[0];
// for(int i=0;i<nums.length;i++){
//   count=1; // reset count for every new number 
//   for(int j=i+1;j<nums.length;j++){
//     if(nums[i]==nums[j]){
//       count++;
//     }
//   }
//   if(count>max){
//       max=count; // store count of every number in max
//       majorityele=nums[i]; // return max occuring number
//   }
// }
// if(max>nums.length/2){ // max element needs to appear more than n/2 times
//   return majorityele;
// }
// else{
//   return -1;
// }
//   }
// }




// Ques 10.  Contains Duplicate-
//----------------------------------

// import java.util.*;
// public class sortingques{
//       public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);
//                 System.out.println("Enter size of array:-");
//                 int n=input.nextInt();
//                 int[]nums=new int[n];
//                 System.out.println("Enter elements of array:-");
//                 for(int i=0;i<n;i++){
//                     nums[i]=input.nextInt();
//                 }
//                 boolean result=contain_duplicate(nums);
//                 System.out.println(result);
//               }
//               static boolean contain_duplicate(int[]nums){
//                       int count=0;
//                       boolean ans=false;
//                       for(int i=0;i<nums.length;i++){
//                           count=1;
//                           for(int j=i+1;j<nums.length;j++){
//                               if(nums[i]==nums[j]){
//                                 count++;
//                               }
//                           }
//                       if(count>1){
//                          ans=true;
//                       }
//                       }
//                       return ans;
//                   }
//               }
            


// Approach2:- reduced time complexity:-
//----------------------------------------


// class Solution {
//   public boolean containsDuplicate(int[] nums) {
// HashSet<Integer>duplicate=new HashSet<>(); "duplicate": name of hashset.
// for(int i=0;i<nums.length;i++){
//   if(duplicate.contains(nums[i])){
//       return true;
//   }
//   duplicate.add(nums[i]); // add elements into hashset named "duplicate" so that if any element appears more than 1 time it can be compared 
 //  and return false.
// }
// return false;
// }
// }