
                                         // MULTI DIMENSION ARRAY:-
                                       //----------------------------
                                    
// import java.util.*;
//    public class MD_array{
//       public static void main(String[] args) {
//          Scanner input=new Scanner(System.in);
//          int[][]arr=new int[3][3];
//          for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                arr[i][j]=input.nextInt();
//             }}
//             for(int i=0;i<3;i++){
//                for(int j=0;j<3;j++){
//                  System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
              
//          }
//       }

//    }      

                                       // Concatenation of array:->
                                       //-----------------------------

// import java.util.*;
// public class MD_array {
// public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);
//     int n=input.nextInt();
//     int[]nums=new int[n];
//     for(int i=0;i<n;i++){
//        nums[i]=input.nextInt();
//     }
//    int[]result=getConcatenation(nums);
//    System.out.println(Arrays.toString(result));
// }
            
//    static int[] getConcatenation(int[] nums) {
//  int []ans=new int[nums.length*2];// double the size of array
//  for(int i=0;i<nums.length;i++){
//     ans[i]=nums[i];// duplicate the original array: 1 2 1
//     ans[i+nums.length]=nums[i]; // i=0+3=> 3rd index pr firse num[0],num[1],num[2];
//  }
//  return ans;
//     }
// }
    


                             //  Valid Anagram:(example: ccaa , accc, not anagram):->
                            // ----------------------------------------------------------

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         int[]arr=new int[26];
//         for(int i=0;i<s.length();i++){
//             arr[s.charAt(i)-'a']++;
//         }
//          for(int i=0;i<t.length();i++){
//             arr[t.charAt(i)-'a']--;
//         }

//        for(int count:arr){
//      if(count!=0){
//             return false;
//         }
//        }
//        return true;
//     }
// }
    


                       // Replace element with greatest on right side: example:( {17, 18, 5, 4, 6, 1} )
                       //  -------------------------------------------    ans:-   [18, 6, 6, 6, 1, -1] 


                       // to right of 17 what is greatest element:[18,5,4,6,1]: 18(replace 18 with 17)
                       // to right of 18 what is greatest element:[5,4,6,1]: 6 (replace 18 with 6)
                       // to right of 5 what is greatest element:[4,6,1]: 6 (replace 5 with 6)
                       // to right of 4 what is greatest element:[6,1]: 6 (replace 4 with 6)
                       // to right of 6 what is greatest element:[1]: 1 (replace 6 with 1)
                       // to right of 1 what is greatest element:[]: -1 (no greater element so -1 int max=-1(original value))
                       //  ans:-   [18, 6, 6, 6, 1, -1]

                      

                    //   import java.util.*;
                    //    public class MD_array {
                    //     public static void main(String[] args) {
                    //     int [] arr= {17,18,5,4,6,1};
                    //     int[] ans=replaceElements(arr);
                    //     System.out.println(Arrays.toString(ans));
                       
                        
                    //     }
                                    
                    //        static int[] replaceElements(int[] arr) {
                    //             for(int i=0;i<arr.length;i++){
                    //                   int max=-1;
                    //                 for(int j=i+1;j<arr.length;j++){
                    //                     if(arr[j]>max){
                    //                        max=arr[j];
                    //                     }
                    //                 }
                    //                 arr[i]=max;}
                                        
                    //                    return arr;
                        
                    //             }
                    //     }
               
                        

                       
                    //      Is Subsequence
                    //-----------------------
                    // example: axc , xahbgdc: a check on xahbgdc(matches then increment j to 2 to search on subsequent part)
                    // x searches on hbgdc // not matches on subsequent part then increment i 
                    // c search


                
//    public class MD_array {
//     public static void main(String[] args) {
//     String s= "axc";
//     String t= "xahbgdc";
//     boolean ans=isSubsequence(s, t);
//     System.out.println(ans);
//     }            
//   static boolean isSubsequence(String s, String t) {
//     int j=0;
//               for(int i=0;i<s.length();i++){
//                     char ch=s.charAt(i);
//                     boolean found=false;
//                    while( j<t.length()){
//                     char ch2=t.charAt(j);
//                     if(ch==ch2){
//                         found=true;
//                         j++; // subsequent search
//                         break;
//                     }
//                     j++; // move to next character if not found
//                     }
//                     if(!found){
//                         return false;
//                     }
//                 }
//                 return true;
//             }}
        




                                       // Length of last word:->
                                       //---------------------------


// import java.util.*;
//    public class MD_array {
//     public static void main(String[] args) {
//     String s= " fly me   to   the moon ";
//     int ans=lengthOfLastWord(s);
//     System.out.println(ans);
//     }     
//   static int lengthOfLastWord(String s) {
//        // to reverse a string
//        int count=0;
//        boolean word=false;
//        for(int i=s.length()-1;i>0;i--){
//         if(s.charAt(i)!=' '){
//          word=true;
//          count++;
//         }
//         else if(word) {
//          break;
//         }
//       }
//         return count;
//   }}

  
                                // Sum of left and right diagonal of a matrix:-
                              //------------------------------------------------
// APPROACH 1:-
//--------------


// import java.util.*;
// public class MD_array{
//   public static void main(String[]args){
//     Scanner input=new Scanner(System.in);
//     System.out.println("Enter no.of rows: ");
//     int r=input.nextInt();
//     System.out.println("Enter no.of cols: ");
//     int c=input.nextInt();
//     int[][]arr=new int[r][c];
//     System.out.println("Enter elements of array: ");
//     for(int i=0;i<r;i++){
//       for(int j=0;j<c;j++){
//         arr[i][j]=input.nextInt();
//       }
//     }
//     int sum1=0;
//     for(int i=0;i<r;i++){
//       for(int j=0;j<c;j++){
//         if(i==j){
//           sum1+=arr[i][j];
//         }
//       }
//     }
// int sum2=0;
//     for(int i=0;i<r;i++){
//       for(int j=0;j<c;j++){
//         if(i+j==r-1){
//           sum2+=arr[i][j];
//               }
//     }}
//     int ans=sum1+sum2;
// System.out.println("Hence sum of diagonal elements is: "+ans);
//   }
// }

 

// APPROACH 2:-(Optimized Approach)
//------------------------------------


// import java.lang.reflect.Array;
// import java.util.*;
// public class MD_array{
//   public static void main(String[]args){
//     Scanner input=new Scanner(System.in);
//     System.out.println("Enter no.of rows: ");
//     int r=input.nextInt();
//     System.out.println("Enter no.of cols: ");
//     int c=input.nextInt();
//     int[][]arr=new int[r][c];
//     System.out.println("Enter elements of array: ");
//     for(int i=0;i<r;i++){
//       for(int j=0;j<c;j++){
//         arr[i][j]=input.nextInt();
//       }
//     }
//     int ans=sumofdiagonals(arr);
//     System.out.println(ans);
//   }
// static int sumofdiagonals(int[][]arr){
// int leftsum=0;
// int rightsum=0;
// int n=arr.length;
//       for(int i=0;i<n;i++){
// leftsum+=arr[i][i];
// rightsum+=arr[i][n-1-i];
//       }
//       return leftsum+rightsum;
//     }
//   }


                                 // Ques:- [0 0]  => 4 increment row(0) or col(1) then find odd no. 
                                //  [0 0]
                              //--------------------------------------------------------------------


// import java.util.*;
// public class MD_array{
//   public static void main(String[] args) {
//     Scanner input=new Scanner(System.in);
//     System.out.println("Enter no.of rows: ");
//     int r=input.nextInt();
//     System.out.println("Enter no.of cols: ");
//     int c=input.nextInt();
//     int[][]arr=new int[r][c];
// int q=input.nextInt(); // no.of times run 
// for(int i=1;i<=q;i++){
//   int a=input.nextInt(); // 0 0 ( 0 means row  : 0th row )
//   int b=input.nextInt(); // 1 1 ( 1 means col : 1st col )
//   solve(arr,r,c,a,b);
// }
// int count=0; // odd no. find 
// for(int i=0;i<r;i++){
//   for(int j=0;j<c;j++){
//     if(arr[i][j]%2!=0){
//       count++;
//     }
//   }
// }
// System.out.println("Answer is: "+count);
// }
// public static void solve(int[][]arr,int r,int c,int a,int b){
//   if(a==0){
//     for(int i=0;i<c;i++){
//            arr[b][i]+=1;
//     }
//   }
//   else{
//     for(int i=0;i<r;i++){
//       arr[i][b]+=1;
//     }
//   }
// }
// }




                                // SPIRAL MATRIX
                              //------------------


// public class MD_array{
//   public static void main(String[] args) {
//     int[][] arr = {
//       {1, 2, 3, 4},
//       {5, 6, 7, 8},
//       {9, 10, 11, 12},
//       {13, 14, 15, 16}
//   };
//   int row=arr.length;
//   int col=arr[0].length;
//   int minrow=0;
//   int maxrow=row-1;
//   int mincol=0;
//   int maxcol=col-1;
//   int totalele=row*col;
//   int count=0;

//   while(count<totalele){
//     // FOR MINIMUM ROW:-
//     // ROW FIX, COL CHANGE
//     for(int j=mincol;j<=maxcol && count<totalele;j++){
//         System.out.print(arr[minrow][j]+" ");
//         count++;
//     }
//     minrow++;

//     // FOR MAXIMUM COLUMN
//     // COL FIX ROW CHANGE
// for(int i=minrow;i<=maxrow && count<totalele;i++){
//   System.out.print(arr[i][maxcol]+" ");
//   count++;
// }
// maxcol--;

// //FOR MAXIMUM ROW
// // ROW FIX COL CHANGE

// for(int j=maxcol;j>=mincol && count<totalele;j--){
//   System.out.print(arr[maxrow][j]+" ");
//   count++;
// }
// maxrow--;

// //FOR MINIMUM COL
// // COL FIX ROW CHANGE

// for(int i=maxrow;i>=minrow && count<totalele;i--){
//    System.out.print(arr[i][mincol]+" ");
//    count++;
//   }
//   mincol++;
// }
// }
// }


                               // Multiplication of matrix:-
                            //---------------------------------

                        //     public class MatrixMultiplication {
                        //       public static void main(String[] args) {
                        //           int[][] matrix1 = {
                        //               {1, 2, 3},
                        //               {4, 5, 6}
                        //           };
                          
                        //           int[][] matrix2 = {
                        //               {7, 8},
                        //               {9, 10},
                        //               {11, 12}
                        //           };
                          
                        //           // Get the dimensions of the matrices
                        //           int rows1 = matrix1.length;
                        //           int cols1 = matrix1[0].length;
                        //           int rows2 = matrix2.length;
                        //           int cols2 = matrix2[0].length;
                          
                        //           // Check if the matrices can be multiplied
                        //           if (cols1 != rows2) {
                        //               System.out.println("Matrices cannot be multiplied");
                        //               return;
                        //           }
                          
                        //           // Resultant matrix
                        //           int[][] result = new int[rows1][cols2];
                          
                        //           // Multiply the matrices
                        //           for (int i = 0; i < rows1; i++) {
                        //               for (int j = 0; j < cols2; j++) {
                        //                   for (int k = 0; k < cols1; k++) {
                        //                       result[i][j] += matrix1[i][k] * matrix2[k][j];
                        //                   }
                        //               }
                        //           }
                          
                        //           // Print the resulting matrix
                        //           System.out.println("Resulting Matrix:");
                        //           for (int i = 0; i < rows1; i++) {
                        //               for (int j = 0; j < cols2; j++) {
                        //                   System.out.print(result[i][j] + " ");
                        //               }
                        //               System.out.println();
                        //           }
                        //       }
                        //   }
                          

 

