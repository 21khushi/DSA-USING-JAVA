
// LINEAR SEARCH:->
// ----------------------
// import java.util.*;

// public class linear_search {
// public static void main(String[] args) {
// System.out.println("Enter the string:-> ");
// Scanner input = new Scanner(System.in);
// String str = input.next();
// System.out.println("Enter the alphabet you want to search:-> ");
// char target = input.next().charAt(0);

// }

// static int search(int[] arr, int target) {
// if (arr.length == 0) { // Array is empty.
// return -1;
// }
// for (int i = 0; i < arr.length; i++) {
// int element = arr[i];
// if (element == target) {
// return i;
// }
// }
// return -1;
// }
// }

// QUESTIONS:->

// Q1: Search in String
// ----------------------

// import java.util.*;

// public class linear_search {
// public static void main(String[] args) {
// System.out.println("Enter the string:-> ");
// Scanner input = new Scanner(System.in);
// String str = input.next();
// System.out.println("Enter the alphabet you want to search:-> ");
// char target = input.next().charAt(0);
// System.out.print("Hence the alphabet is found at index:-> ");
// int ans = search(str, target);
// System.out.println(ans);
// }

// static int search(String str, char target) {
// if (str.length() == 0) {
// return -1;
// }
// for (int i = 0; i < str.length(); i++) {
// if (target == str.charAt(i)) {
// return i;
// }
// }
// return -1;
// }
// }

// Q2: Search in range:-
// ------------------------

// import java.util.*;
// public class linear_search{
// public static void main(String[] args) {
// System.out.print("Enter size of array:- ");
// Scanner input=new Scanner(System.in);
// int n=input.nextInt();
// int[]arr=new int[n];
// System.out.println("Enter elements of array:- ");
// for(int i=0;i<n;i++){
// arr[i]=input.nextInt();
// }
// System.out.print("Enter start value of range");
// int start=input.nextInt();
// System.out.print("Enter end value of range");
// int end=input.nextInt();
// System.out.print("Enter Target value of range");
// int target=input.nextInt();
// int ans= search_range(arr, start, end, target);
// System.out.println(ans);
// }
// static int search_range(int[]arr, int start,int end,int target){
// if(arr.length==0){
// return -1;
// }
// for(int i=start;i<=end;i++){
// int element=arr[i];
// if(element==target){
// return i;
// }
// }
// return -1;
// }
// }

// Q3 Minimum no.
// --------------------

// import java.util.*;
// public class linear_search{
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int n=input.nextInt();
// int[]arr=new int[n];
// for(int i=0;i<n;i++){
// arr[i]=input.nextInt();
// }
// int ans= minimum_num(arr);
// System.out.println(ans);
// }
// static int minimum_num(int[]arr){
// int min=arr[0];
// for(int i=0;i<arr.length;i++){
// if(arr[i]<min){
// min=arr[i];
// }
// }
// return min;
// }
// }

// Q4 SEARCH ELEMENT IN 2D ARRAY:-
// ------------------------------------

// import java.util.*;
// public class linear_search{
// public static void main(String[] args) {
// Scanner input=new Scanner(System.in);
// int r=input.nextInt();
// int c=input.nextInt();
// int[][]arr=new int[r][c];
// for(int i=0;i<arr.length;i++){
// for(int j=0;j<arr[i].length;j++){
// arr[i][j]=input.nextInt();
// }
// }
// int target=input.nextInt();
// int[]ans=search2d(arr, target);
// System.out.println(Arrays.toString(ans));
// }
// static int[] search2d(int[][]arr,int target){
// if(arr.length==0){
// return new int[]{-1,-1};
// }
// for(int i=0;i<arr.length;i++){
// for(int j=0;j<arr[i].length;j++){
// if(arr[i][j]==target){
// return new int[]{i,j};
// }
// }
// }
// return new int[]{-1,-1};
// }
// }

// Q5 To check whether a number contains even no.of digits:-
// --------------------------------------------------------

// import java.util.*;
// public class linear_search{
// public static void main(String[] args) {
// Scanner input = new Scanner(System.in);
// int n=input.nextInt();
// int[]arr=new int[n];
// for(int i=0;i<n;i++){
// arr[i]=input.nextInt();
// }
// int ans=findNumbers(arr);
// System.out.println(ans);
// }
// static int findNumbers(int[] nums) {
// int count=0;
// // to find no.of digits of each element in array
// for(int i=0;i<nums.length;i++){
// int n=nums[i]; // modifies the original value in array.
// int digit=0; // digit needs to be reset inside as zero inside or it will
// continue with digits of previous elements.
// while(n>0){
// n=n/10;
// digit++;
// }
// // to find count of even digit in array
// if(digit%2==0){
// count++;
// }
// }
// return count;
// }
// }

// Richest Wealth:-
// --------------------

// class Solution {
// public int maximumWealth(int[][] accounts) {
// int ans=Integer.MIN_VALUE;
// for(int i=0;i<accounts.length;i++){
// int sum=0;
// for(int j=0;j<accounts[i].length;j++){
// sum+=accounts[i][j];
// }
// if(sum>ans){
// ans=sum;
// }}
// return ans;
// }
// }