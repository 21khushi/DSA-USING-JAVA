// BINARY SEARCH IN 2D ARRAY:-
// --------------------------------

// import java.util.Arrays;
// import java.util.Scanner;
// public class binary_search2d {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter rows of array: ");
// int r = input.nextInt();
// System.out.print("Enter cols of array: ");
// int c= input.nextInt();
// int[] []arr = new int[r][c];
// System.out.print("Enter elements of array: ");
// for (int i = 0; i < arr.length; i++) {
// for(int j=0;j<arr[i].length;j++){
// arr[i][j]=input.nextInt();
// }
// }
// System.out.print("Enter target of array: ");
// int target=input.nextInt();
// int[]ans=binary(arr, target);
// System.out.print(Arrays.toString(ans)); // Array cannot be printed directly.
// }
// static int[] binary(int[][]arr,int target){
// for(int i=0;i<arr.length;i++){
// for(int j=0;j<arr[i].length;j++){
// if(arr[i][j]==target){
// return new int[]{i,j};
// }
// }
// }
// return new int[]{};
// }
// }

// Row wise or col wise sorted:-
// ----------------------------------
// import java.util.*;
// public class binary_search2d {
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// System.out.print("Enter rows of array: ");
// int r = input.nextInt();
// System.out.print("Enter cols of array: ");
// int c= input.nextInt();
// int[] []arr = new int[r][c];
// System.out.print("Enter elements of array: ");
// for (int i = 0; i < arr.length; i++) {
// for(int j=0;j<arr[i].length;j++){
// arr[i][j]=input.nextInt();
// }
// }
// System.out.print("Enter target of array: ");
// int target=input.nextInt();
// System.out.print(Arrays.toString(binaryrowwise(arr, target)))
// ;
// }

// static int[] binaryrowwise(int[][]arr,int target){
// int row=0;
// int col=arr.length-1;
// while(row<arr.length && col>=0){
// if(arr[row][col]==target){
// return new int[]{row,col};
// }
// if(arr[row][col]<target){
// row++;
// }
// else{
// col--;
// }
// }
// return new int[]{-1,-1};
// }
// }
