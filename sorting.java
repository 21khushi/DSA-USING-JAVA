                                   

                                // BUBBLE SORT:-( ADJACENT ELEMENT SWAP , FIXING GREATEST ELEMENT AT THE END )
                            //------------------------------------------------------------------------------------
                        
                            
// import java.util.*;
// public class sorting{
//     public static void main(String[]args){
//     System.out.println("Enter size of array:-");
//       Scanner input=new Scanner(System.in);
//       int n=input.nextInt();
//     System.out.println("Enter elements of array:-");
//     int[]arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=input.nextInt();
//     }
//     bubble_Sort(arr);
//     System.out.println("Hence the sorted array is:- "+Arrays.toString(arr));
//     }
//     static void bubble_Sort(int[]arr){
//         boolean swapped;
//         for(int i=0;i<arr.length;i++){
//             swapped=false;
//             for(int j=1;j<arr.length-i;j++){  // fixing last element(greatest)
//                if(arr[j]<arr[j-1]){
//                int temp=arr[j];
//                arr[j]=arr[j-1];
//                arr[j-1]=temp;
//                swapped=true;
//                }
//             }
//         if(swapped==false){
//             break;
//         }
//     } 
// }
// }


                         // Selection Sort(Take maximum value of the array and swap the last element to bring it to correct index):-
                    //-----------------------------------------------------------------------------------------------------------------


// import java.util.*;
// public class sorting{
//     public static void main(String[]args){
//     System.out.println("Enter size of array:-");
//       Scanner input=new Scanner(System.in);
//       int n=input.nextInt();
//     System.out.println("Enter elements of array:-");
//     int[]arr=new int[n];
//     for(int i=0;i<n;i++){
//         arr[i]=input.nextInt();
//     }
//    selection_sort(arr);
//    System.out.println(Arrays.toString(arr));
// }
// // Two steps : select maximum element
// // Swap with element at last .. keep on fixing last element(arr.length-i-1)
// static void selection_sort(int[]arr){
// for(int i=0;i<arr.length;i++){
//     int last=arr.length-i-1;
//     int maxIndex=getmax(arr,0,last);
//     swap(arr,maxIndex,last);
// }
// }
// // maximum elememt
// static int getmax(int[]arr,int start,int last){
//     int max=start;
//     for(int i=0;i<=last;i++){
//         if(arr[max]<arr[i]){
//             max=i;
//         }
//     }
//     return max;
// }
// // Swap
// static void swap(int[]arr,int first ,int second){
//     int temp=arr[first];
//     arr[first]=arr[second];
//     arr[second]=temp;
// }
// }


                        // Insertion Sort( Takes element at current index , keeps on sorting left side of array by incrementing i and decrementing j)
                        //----------------------------------------------------------------------------------------------------------------------------
                        // UPTO N-2 SINCE J+1 SO OUT OF BOUND
                        // TAKES LESS NO.OF SWAPS IN COMPARISON TO BUBBLE SORT.
        


                        
// import java.util.*;
// public class sorting{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter size of array:-");
//         int n=input.nextInt();
//         int[]arr=new int[n];
//         System.out.println("Enter elements of array:-");
//         for(int i=0;i<n;i++){
//             arr[i]=input.nextInt();
//         }
//         insertion_sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void insertion_sort(int[]arr){
//         for(int i=0;i<=arr.length-2;i++){ // otherwise j=i+1 so index out of bound.
//             for(int j=i+1;j>0;j--){
//                 if(arr[j]<arr[j-1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j-1];
//                     arr[j-1]=temp;
//                 }
//             }
//         }
//     }
// }

        


                                            // Cyclic Sort (index=value-1, eg: 3,4,2,1,5 .... here 3 index=3-1=2 so swap both values)
                                        //---------------------------------------------------------------------------------------------
                                              // It is used for n distinct numbers from 1 to n:
// import java.util.*;
// public class sorting{
//     public static void main(String[] args) {
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter size of array:-");
//         int n=input.nextInt();
//         int[]arr=new int[n];
//         System.out.println("Enter elements of array:-");
//         for(int i=0;i<n;i++){
//             arr[i]=input.nextInt();
//         }
//         cyclic_sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     static void cyclic_sort(int[]arr){
//         int i=0;
//         while(i<arr.length){
//             int correct=arr[i]-1; // index=value-1;
//             if(arr[i]!=arr[correct]){ // to check if value of arr[i] and the index it should be actually are same
//                 swap(arr,i,correct);  // if not swap their values
//             }
//             else{
//                 i++; // if right value is present at index just check for all values.
//             }
//         }
//     }
//     static void swap(int[]arr,int first,int last){
//         int temp=arr[first];
//         arr[first]=arr[last];
//         arr[last]=temp;
//     }
// }


 