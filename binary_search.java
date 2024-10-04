
                                  // BINARY SEARCH ( All Sorted Array Questions)
                                 //-------------------------------------------->
                                 
                                 
// import java.util.*;
// public class binary_search {
//     public static void main(String[] args){
//         System.out.println("Enter the size of array:-");
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int[]arr=new int[n];
//         System.out.println("Enter the elements of array:-");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=input.nextInt();
//         }
//         System.out.println("Enter the number you want to search in array:-");
//         int target=input.nextInt();
//         int ans= binarysearch(arr,target);
//         System.out.println(ans);
//     }
//     static int binarysearch(int[]arr,int target){
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target<arr[mid]){ // present on left side.
//                 end=mid;
//             }
//             else if(target>arr[mid]){ // present on right side.
//                 start=mid+1;
//             }
//             else{
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }



                                      //  Order of Agnostic Binary Search:-
                                    //-----------------------------------------


// import java.util.*;
// public class binary_search {
//     public static void main(String[] args){
//         System.out.println("Enter the size of array:-");
//         Scanner input=new Scanner(System.in);
//         int n=input.nextInt();
//         int[]arr=new int[n];
//         System.out.println("Enter the elements of array:-");
//         for(int i=0;i<arr.length;i++){
//             arr[i]=input.nextInt();
//         }
//         System.out.println("Enter the number you want to search in array:-");
//         int target=input.nextInt();
//         int ans=order_agnostic(arr, target);
//         System.out.println("Hence the number you want to search is at index:-> "+ans);
//     }
//     static int order_agnostic(int[]arr,int target){
//         int start=0;
//         int end=arr.length-1;
//         boolean isAsc;
//         if(arr[start]>arr[end]){
//             isAsc= false;
//         }
//         else{
//            isAsc= true;
//         }
//         while(start<=end){
//             int mid=start+(end-start)/2;
//             if(target==arr[mid]){
//                 return mid;
//             }
//             if (isAsc){
//                 if(target<arr[mid]){
//                     end=mid;
//                 }
//                 else if (target>arr[mid]){
//                     start=mid+1;
//                 }
//             }
//             else{
//                 if(target>arr[mid]){
//                     end=mid-1;
//                 }
//                 else if (target<arr[mid]){
//                     start=mid+1;
//                 }
//             }            
//         }
//         return -1;
//     }
// }


                              

                       // QUES 1: FIND CEILING OF A NUMBER:->
                    //------------------------------------------------


// import java.util.*;
// public class binary_search{
//   public static void main(String[] args) {
//       System.out.println("Enter size of array:- ");
//       Scanner input=new Scanner(System.in);
//       int n=input.nextInt();
//       int[]arr=new int[n];
//       System.out.println("Enter a sorted array:- ");
//       for(int i=0;i<arr.length;i++){
//         arr[i]=input.nextInt();
//       }
//       System.out.println("Enter target element:- ");
//       int target=input.nextInt();
//       int ans=ceiling(arr, target);
//       System.out.println(ans);
//   }
//   static int ceiling(int[]arr,int target){
//     if(target>arr[arr.length-1]){
//       return -1;
//     }
//     int start=0;
//     int end=arr.length-1;
//     while(start<=end){
//       int mid=start+(end-start)/2;
//       if(target>arr[mid]){
//         start=mid+1;
//       }
//       else if(target <arr[mid]){
//         end=mid-1;
//       }
//       else{
//         return mid;
//       }
//     }
//     return start;
//   }
// }


                             // QUES 2:- FIND FLOOR OF A NUMBER:-
                          //----------------------------------------



// import java.util.*;                      
// public class binary_search{
//   public static void main(String[] args) {
//     System.out.println("Enter size of array:- ");
//           Scanner input=new Scanner(System.in);
//           int n=input.nextInt();
//           int[]arr=new int[n];
//           System.out.println("Enter a sorted array:- ");
//           for(int i=0;i<arr.length;i++){
//             arr[i]=input.nextInt();
//           }
//           System.out.println("Enter target element:- ");
//           int target=input.nextInt();
//           int ans=floor(arr, target);
//           System.out.println(ans);
//   }
//   static int floor(int[]arr,int target){
//     int start=0;
//     int end=arr.length-1;
//     while(start<=end){
//       int mid=start+(end-start)/2;
//       if(target>arr[mid]){
//         start=mid+1;
//       }
//       else if(target<arr[mid]){
//         end=mid-1;
//       }
//       else{
//         return mid;
//       }

//     }
//     return end;
//   }
// }


                           // QUES 3. FIND GREATEST SMALLEST LETTER (NOT EQUAL):-  
                        //---------------------------------------------------------
                           //  ["c","f","j"], target = "a"
                           // Here we have to only find next greater letter(not equal);
                           // even if a is present in array we donot have to find it, hence we have not used return mid;
                           // if we reach to last element of array from where we cannot find next greater element then it must return first elemet =>arr[0];
                        



// import java.util.*;
// public class binary_search{
//     public static void main(String[] args) {
//         System.out.println("Enter size of array:- ");
//               Scanner input=new Scanner(System.in);
//               int n=input.nextInt();
//               char[]arr=new char[n];
//               System.out.println("Enter a sorted array:- ");
//               for(int i=0;i<arr.length;i++){
//                 arr[i] = input.next().charAt(0);
//               }
//               char target=input.next().charAt(0);
//               char ans=greatestletter(arr, target);
//               System.out.println(ans);
//             }
//             static char greatestletter(char[]arr,char target){
//                 int start=0;
//                 int end=arr.length-1;
//                 if(target>=arr[end]){
//                     return arr[0];
//                 }
//                 while(start<=end){
//                     int mid=start+(end-start)/2;
//                     if(arr[mid]>target){
//                         end=mid-1;
//                     }
//                     else{
//                         start=mid+1;
//                     }
//                 }
//                 return arr[start];
//             }
// }





                            //  QUES 4. Find last and first occurence of a number in sorted array:-
                        //----------------------------------------------------------------------------

               // EXAMPLE:-
               //----------------
            // The user inputs the sorted array: [1, 2, 2, 2, 3, 4, 5].

// firstOccurrence(arr, 2, true):
// Initial start = 0, end = 6, ans = -1.
// First iteration: mid = 3, arr[mid] = 2. ans is updated to 3, end is updated to 2.
// Second iteration: mid = 1, arr[mid] = 2. ans is updated to 1, end is updated to 0.
// Third iteration: mid = 0, arr[mid] = 1. start is updated to 1.
// Loop ends with ans = 1.
// Finding Last Occurrence:

// firstOccurrence(arr, 2, false):
// Initial start = 0, end = 6, ans = -1.
// First iteration: mid = 3, arr[mid] = 2. ans is updated to 3, start is updated to 4.
// Second iteration: mid = 5, arr[mid] = 4. end is updated to 4.
// Third iteration: mid = 4, arr[mid] = 3. end is updated to 3.
// Loop ends with ans = 3.



// import java.util.*;
// public class binary_search {
//    public static void main(String[] args) {
//       Scanner input=new Scanner(System.in);
//                 int n=input.nextInt();
//                 int[]arr=new int[n];
//                 System.out.println("Enter a sorted array:- ");
//                 for(int i=0;i<arr.length;i++){
//                   arr[i]=input.nextInt();
//                 }
//                 System.out.println("Enter a target element:- ");
//                 int target=input.nextInt();

//                 int[] result=findocc(arr, target);
//                 System.out.println(Arrays.toString(result));
                            
//    }
//    static int[] findocc(int[]arr,int target){
//              int[] ans={-1,-1};
//                 int start=firstoccurence(arr, target, true);
//                 int end=firstoccurence(arr, target, false);
//                 ans[0]=start;
//                 ans[1]=end;

//                 return ans;
//    }
//    static int firstoccurence(int[]arr,int target,boolean firstocc){
//       int ans=-1;
//       int start=0;
//       int end=arr.length-1;
//       while(start<=end){
//          int mid=start+(end-start)/2;
//          if(target>arr[mid]){
//             start=mid+1;
//          }
//          else if(target<arr[mid]){
//             end=mid-1;
//          }
//          else{
//             ans=mid;
//             if(firstocc){
//                end=mid-1;
//             }
//             else{
//             start=mid+1;
//             }

//          }

//       }
//       return ans;

//    }
// }



//                     QUES 5.  Find position of element in infinite array:-(till target is greater than end element double size each time)
//                    ---------------------------------------------------------------------------------------------------------------------




// import java.util.*;
// public class binary_search{
//    public static void main(String[] args) {
//       Scanner input=new Scanner(System.in);
//          int [] arr={1,2,3,4,5,6,7,8,9};
//                 int target=input.nextInt();
//                 int ans=position(arr, target);
//                 System.out.println(ans);
//    }
//    static int position(int[]arr, int target){
//       int start=0;
//       int end=1;
//       while(target>arr[end]){
//          int temp=end+1;// start
//          end=end+(end-start+1)*2; // double the size each time
//          start=temp;
//       }
//       return binarysearch(arr,target,start,end);
//    }
//    static int binarysearch(int[]arr,int target,int start,int end){
//        start=0;
//        end=arr.length-1;
//       while(start<end){
//          int mid=start+(end-start)/2;
//          if(target>arr[mid]){
//             start=mid+1;
//          }
//          else if(target<arr[mid]){
//             end=mid-1;
//          }
//          else{
//             return mid;
//          }
//       }
//       return -1;
//    }
// }




//                             QUES 6.  Peak Index in Mountain Array
//                             --------------------------------------

// import java.util.*;
// public class binary_search {
//    public static void main(String[] args) {
//          Scanner input=new Scanner(System.in);
//          int n=input.nextInt();
//          int[]arr=new int[n];
//          for(int i=0;i<n;i++){
//             arr[i]=input.nextInt();
//          }
//          int ans=peakelement(arr);
//          System.out.println(ans);
//    }
//    static int peakelement(int[]arr){
//       int start=0;
//       int end=arr.length-1;
//       while(start<end){
//          int mid=start+(end-start)/2;
//          if(arr[mid]>arr[mid+1]){
//             end=mid;
//          }
//          else{
//             start=mid+1;
//          }
//       }
//       return start;
//    }
// }




//                             QUES 7.  Find element in Mountain Array
//                             --------------------------------------
//                             Example:- 1 2 3 5 3 1 :- here target is 3 answer=2
//                             Step 1. Find peak element
//                             Step 2. Search on leftside for target and then search on rightside for target.
//                             Step3. Since we donot know whether the two array are sorted in ascending or descending order
//                             so use order agnostic approach to solve.



// import java.util.*;
// public class binary_search{
//    public static void main(String[] args) {
//       Scanner input=new Scanner(System.in);
//       System.out.print("Enter size of array:- ");
//          int n=input.nextInt();
//          int[]arr=new int[n];
//       System.out.print("Enter elements of array:- ");
//          for(int i=0;i<n;i++){
//             arr[i]=input.nextInt();
//          }
//       System.out.print("Enter target that you want to search in a array:-");
//         int target=input.nextInt();
//         int result=find_mountain(arr, target);
//         System.out.println("Hence the target in Mountain Array is found at:- "+result);
//    }
//    static int find_mountain(int[]arr,int target){
//       int peak=peakelement(arr);
//       int searchleft=order_agnostic(arr,target,0,peak);    // gives preference to minimum index first.
//       if(searchleft!=-1){
//          return searchleft;
//       } 
//       return order_agnostic(arr, target, peak, arr.length);     // We cannot predict whether first part is sorted in ascending/descending array.
//    }
//    static int peakelement(int[]arr){
//       int start=0;
//       int end=arr.length-1;
//       while(start<end){
//          int mid=start+(end-start)/2;
//          if(arr[mid]>arr[mid+1]){
//             end=mid;
//          }
//          else{
//             start=mid+1;
//          }
//       }
//       return start;
//    }
//    static int order_agnostic(int[]arr,int target,int start,int end){
//        start=0;
//        end=arr.length-1;
//       boolean isAsc;
//       if(arr[start]>arr[end]){
//          isAsc=false;
//       }
//       else{
//          isAsc=true;
//       }
//       while(start<=end){
//          int mid=start+(end-start)/2;
//          if(isAsc){
//             if(target<arr[mid]){
//                end=mid-1;
//             }
//             else{
//                start=mid+1;
//             }
//          }
//          else{
//             if(target<arr[mid]){
//                start=mid+1;
//             }
//             else{
//                end=mid-1;
//             }
//          }
//       }
//       return -1;
//    }
// }




                                  // Search in rotated sorted array:-
                                 //-------------------------------------
                                 // STEP 1: FIND PIVOT ELEMENT( AFTER WHICH ASCENDING ORDER NUMBER STARTS)
                                 // STEP 2: TWO ASCENDING SORTED ARRAYS:-BINARY SEARCH ON BOTH LEFT AND RIGHT SIDE
                                 // 1. PIVOT
                                 // 2. BINARY SEARCH
                                 // 3. SEARCH (LEFT AND RIGHT ARRAY)


// import java.util.*;
// public class binary_search{
//    public static void main(String[] args) {
//       Scanner input=new Scanner(System.in);
//       System.out.print("Enter size of array:- ");
//          int n=input.nextInt();
//          int[]arr=new int[n];
//       System.out.print("Enter elements of array:- ");
//          for(int i=0;i<n;i++){
//             arr[i]=input.nextInt();
//          }
//          System.out.print("Enter target element you want to search in array:- ");   
//          int target=input.nextInt();
//          int ans=search(arr, target);
//          System.out.print("Hence the element is at position:  "+ans);   
//    }
//    static int search(int[]arr,int target){
//       int pivot=pivotelement(arr);
//       if(pivot==-1){
//          return binary_search(arr, target, 0,arr.length-1);
//       }
//       // CASES: 
//       // CASE1 :->
//       if(arr[pivot]==target){
//          return pivot;
//       }
//       // CASE 2:->
//       if(target>= arr[0]){
//          return binary_search(arr, target, 0, pivot-1);
//       }
//       else{
//          return binary_search(arr, target, pivot+1, arr.length-1);
//       }
//    }
//    // To find pivot element:-
//      static int pivotelement (int[]arr){
//       int start=0;
//       int end=arr.length-1;
//       while(start<=end){
//          int mid=start+(end-start)/2;
//          // CASE 1:
//          if(mid<end && arr[mid]>arr[mid+1]){
//             return mid;
//          }
//          // CASE 2:
//          else if(mid>start &&arr[mid]<arr[mid-1]){
//             return mid-1;
//          }
//          // CASE 3:
//          if(arr[mid]<=arr[start]){
//             end=mid-1;
//          }
//          // CASE 4:
//          else{
//             start=mid+1;
//          }
//       }
//       return -1;
//    }
//    // To do binary search after finding pivot element on 2 ascending sorted arrays:-
//    static int binary_search(int[]arr,int target,int start,int end){
//       // start=0;            // We will not use them since we are not intented to search at entire array again and again 
//      // end=arr.length-1    //  We are intended to search in a given subarray
//       while(start<=end){
//          int mid=start+(end-start)/2;
//          if(target>arr[mid]){
//             start=mid+1;
//          }
//          else if(target<arr[mid]){
//             end=mid-1;
//          }
//          else{
//             return mid;
//          }
//       }
//       return -1;
//    }
// }


                                   // Search in rotated sorted array by removing duplicates:-
                                 //-----------------------------------------------------------



// import java.util.Scanner;

// public class binary_search {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = input.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Enter elements of array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = input.nextInt();
//         }
//         System.out.print("Enter target element you want to search in array: ");
//         int target = input.nextInt();
//         int ans = search(arr, target);
//         if (ans != -1) {
//             System.out.print("Hence the element is at position: " + ans);
//         } else {
//             System.out.print("Element not found in the array.");
//         }
//     }
//     static int search(int[] arr, int target) {
//         int pivot = pivotelement(arr);
//         if (pivot == -1) {
//             return binary_search(arr, target, 0, arr.length - 1);
//         }
//         if (arr[pivot] == target) {
//             return pivot;
//         }
//         if (target >= arr[0]) {
//             return binary_search(arr, target, 0, pivot - 1);
//         } else {
//             return binary_search(arr, target, pivot + 1, arr.length - 1);
//         }
//     }
//     static int pivotelement(int[] arr) {
//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (mid < end && arr[mid] > arr[mid + 1]) {
//                 return mid;
//             }
//             if (mid > start && arr[mid] < arr[mid - 1]) {
//                 return mid - 1;
//             }
//             // Handle duplicates
//             if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
//                 // Skip duplicates
//                 if (arr[start] > arr[start + 1]) {
//                     return start;
//                 }
//                 start++;
//                 if (arr[end] < arr[end - 1]) {
//                     return end - 1;
//                 }
//                 end--;
//             } else if (arr[start] <= arr[mid] && arr[mid] > arr[end]) {
//                 start = mid + 1;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return -1;
//     }
//     static int binary_search(int[] arr, int target, int start, int end) {
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
//             if (target > arr[mid]) {
//                 start = mid + 1;
//             } else if (target < arr[mid]) {
//                 end = mid - 1;
//             } else {
//                 return mid;
//             }
//         }
//         return -1;
//     }
// }


                              // ROTATION COUNT:- HOW MANY TIMES ARRAY IS ROTATED:- PIVOT+1;
                             //------------------------------------------------------------
                     
// import java.util.*;
// public class binary_search{
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//         System.out.print("Enter size of array: ");
//         int n = input.nextInt();
//         int[] arr = new int[n];
//         System.out.print("Enter elements of array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = input.nextInt();
//         }
//         int ans=rotationcount(arr);
//         System.out.println("Hence the following array has been rotated : "+ ans);
//     }
// TO DO ROTATION COUNT( PIVOT +1 ):->
//     static int rotationcount(int[]arr){
//         int pivot=findpivot(arr);
//         if(pivot==-1){
//          return 0;
//         }
//         else{
//          return pivot+1;
//         }
//     }
// TO FIND PIVOT ELEMENT:->
//     static int findpivot(int[]arr){
//       int start=0;
//       int end=arr.length-1;
//       while(start<=end){
//          int mid=start+(end-start)/2;
//          if(mid<end && arr[mid]>arr[mid+1]){
//             return mid;
//          }
//          else if(mid>start && arr[mid]<arr[mid-1]){
//             return mid-1;
//          }
//          if(arr[mid]<=arr[start]){
//             end=mid-1;
//          }
//          else{
//             start=mid+1;
//          }
//       }
//       return -1;
//     }
// }


// BY USING LIST WHERE LIST.SIZE() AND .GET METHOD IS USED:-
//------------------------------------------------------------

// class Solution {
//    public int findKRotation(List<Integer> arr) {
//            int pivot=findpivot(arr);
//            if(pivot==-1){
//                return 0;
//            }
//            else{
//                return pivot+1;
//            }
//        }
//       int findpivot(List<Integer> arr){
//           int start=0;
//           int end=arr.size()-1;
//           while(start<=end){
//               int mid=start+(end-start)/2;
//               if(mid<end && arr.get(mid)>arr.get(mid+1)){
//                   return mid;
//               }
//               else if(mid>start && arr.get(mid)<arr.get(mid-1)){
//                   return mid-1;
//               }
//               if(arr.get(mid)<=arr.get(start)){
//                   end=mid-1;
//               }
//               else{
//                   start=mid+1;
//               }
//           }
//           return -1;
//       }
//    }



                                   // SPLIT ARRAY OF LARGEST SUM:->(eg: 7,2,5,10,8)
                                 //-------------------------------------------------



                              
// import java.util.*;
// public class binary_search{
//    public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//               System.out.print("Enter size of array: ");
//               int n = input.nextInt();
//               int[] arr = new int[n];
//               System.out.print("Enter elements of array: ");
//               for (int i = 0; i < n; i++) {
//                   arr[i] = input.nextInt();
//               }
//               System.out.print("Enter no. of subarray you want: ");
//               int m=input.nextInt();
//              int ans=splitarray(arr, m);
//              System.out.println("Hence the minimum sum of a split subarray is:- "+ans);
//    }
//    static int splitarray(int [] arr ,int m){
//       int start=0;
//       int end=0;
//       for(int i=0;i<arr.length;i++){
//          // FINDING A RANGE:-(Maximum and minimum value)
//          start=Math.max(start,arr[i]); // Largest no. of array (Minimum value)
//          end+=arr[i]; // sum of complete array   (Maximum Value)
//       }
//       //  Add elements into sum if it is greater than a new subarray would be formed else it will continue adding to same subarray.  
//       while(start<end){
//          int mid=start+(end-start)/2;
//          int sum=0; // sum of numbers of subarray formed
//          int pieces=1; // count of subarray
//       for(int i=0;i<arr.length;i++){
//          int num=arr[i];
//          if(sum+num>mid){
//             sum=num; // a new subarray created
//             pieces++; // when a newsubarray is formed increment the count of subarray
//          }
//          else{
//             sum+=num; // continue adding to same array.
//          }
//       }
//       if(pieces>m){ // if no. of subarray formed are greater than given(m):- This means we are choosing way to small number therefore more subarray created ,hence increase the value of mid to decrease no. of subarray formed.(eg 15)
//          start=mid+1; 
//       }
//       else{
//          end=mid; // if no.of subarray are less ore equal means a greater number is then , hence we would decrease number(eg 21).
//       }
//       }
//       return end; // here start == end when start and end become equal loop ends and we get ans(18)
//    }
// }

