
//============================================================================================================================================
// it is a single interface having group of objects, it  consist of classes and interfaces so that u can use them 
// directly without starting from scratch.

// ArrayList:- not continous memory allocation
//             no fixed size
//             can increase it size 


// import java.util.*;
// public class collection_framework {
//     public static void main(String[] args) {
//         // 1. To print a arraylist:- using list.add and list.get;
//         // Scanner sc=new Scanner(System.in);
//         // System.out.println("Enter size of arrayList");
//         // int n=sc.nextInt();
//         // System.out.println("Enter elements of arrayList");
//         // ArrayList<Integer>list=new ArrayList<>(n);
//         //  for(int i=0;i<n;i++){
//         //     list.add(sc.nextInt());
//         //  }
// //          System.out.print("Hence elements of arrayList are:- ");
// //          for(int i=0;i<n;i++){
// //            System.out.print(list.get(i)+" ");
// //          }
// //       // 2. To sort a arraylist:- ;
// //          Collections.sort(list);
// //          System.out.println("Hence the sorted list is:- "+ list);

// //       // 3. To print size of arraylist:-
// //           int ele= list.size();
// //           System.out.println(ele);
        
// //       // 4. To add element in between
// //         list.add(1,2);
// //         System.out.println(list);

// //       // 5.  To delete element
// //          list.remove(3);
// //          System.out.println(list);

// //       // 6. list.remove(Integer.valueOf(30)); // to remove a particular value 
// //           System.out.println(list);

// //        // 7. list.set(2,1000); // replace value at 2nd index with another value
// //             System.out.println(list);

// //      // 8. Iterator:- 
//         //  Iterator<Integer>it=list.iterator(); // points to next element iterating
//         //  while(it.hasNext()){
//         //     System.out.println("iterator"+it.next());
//         //  }
//         // }}
// //     }
// // }



// LinkedList:-not continous memory allocation
//             no fixed size
//             can increase it size 
//             one element linked to another
//             Node,Data,next


// import java.util.*;;
// public class collection_framework{
//     public static void main(String[] args) {
//         LinkedList<String>list=new LinkedList<>();
//         list.add("is");
//         list.add("a ");
//         list.addFirst("this");
//         list.addLast("linked list");
//         System.out.println(list);
//         list.removeFirst();
//         list.remove(2);// removes or deletes element at 3rd index.
//         System.out.println(list);
//     }
// }


// Collection Framework allows us to write code using this predifined functions otherwise to perform functions we need to write  code from scratch.


// Scratch:-
//==========

// public class collection_framework{
//     class LinkedList{
//     Node head;
//         public class Node{
//         String data;
//         Node next;

//         Node(String data){
//             this.data=data;
//             this.next=null;
//         }
//       }

//       // ADD element in first position:-
//       //===============================

//       public void addFirst(String data){
//              Node newNode=new Node(data);
//              newNode.next=head;
//              head=newNode;
//       }
      
//       // ADD element in last position:-
//       //===============================

//       public void addLast(String data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         Node lastNode=head;
//         while(lastNode.next!=null){
//             lastNode=lastNode.next;
//       }
//       lastNode.next=newNode;
//     }

//     // Print list:-
//     //===============================
//     public void printList(){
//     Node current=head;
//     while(current!=null){
//         System.out.print(current.data+ " -> ");
//     current=current.next;
//     }
//     System.out.print("null");
// }
//     }
//     public static void main(String[] args) {
//         collection_framework cf=new collection_framework();
//         LinkedList list=cf.new LinkedList();
//         list.addFirst(" in all her upcoming exams");
//         list.addFirst("will run all her code");
//         list.addFirst("khushi");
//         list.addLast("surely");
//         list.printList();
//     }
// }




// Stack:- Last in first out(LIFO)
//================================
// three main operations: push,peek,pop
// stack can be implemented: Arraylist, Linkedlist

// import java.util.*;
// public class  collection_framework{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Stack<Integer> st=new Stack<>();
//         for(int i=0;i<n;i++){
//             st.push(sc.nextInt());
//         }
//         while(!st.empty()){
//            System.out.println(st.peek()); // to print topmost element of stack
//            st.pop(); // to remove the topmost and make next element as topmost element.
//         }
//     }
// }



// To push element at bottom:-
//=============================

// import java.util.*;
// public class collection_framework{
//     public static void pushAtbotton(int data,Stack<Integer>st){
//      if(st.isEmpty()){
//     st.push(data);
//     return;
//      }
//      int top=st.pop();
//      pushAtbotton(data, st);
//      st.push(top);
//     }
//     public static void main(String[] args) {
//         System.out.println("Enter size of stack:- ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         Stack<Integer>st=new Stack<>();
//         System.out.println("Enter elements of stack:- ");
//         for(int i=0;i<n;i++){
//             st.push(sc.nextInt());
//         }
//         System.out.println("Enter element you want at bottom of your stack:- ");
//         int data=sc.nextInt();
//         System.out.println("Hence stack after pushing element at bottom of stack is - ");
//         pushAtbotton(data, st);
//         while(!st.empty()){
//             System.out.println(st.peek());
//             st.pop();
//         }
//     }
// }



// To reverse a stack:-
//======================


// import java.util.*;
// public class collection_framework{
//      public static void pushatbottom(int data,Stack<Integer>st){
//         if(st.isEmpty()){
//           st.push(data);
//           return;
//         }
//         int top=st.pop();
//         pushatbottom(data, st);
//         st.push(top);
//      }
//     public static void reversestack(Stack<Integer>st){
//     if(st.isEmpty()){
//         return;
//     }
//     int top=st.pop(); // empty the stack
//     reversestack(st); // refill stack with pushbottom elements
//     pushatbottom(top, st); // all elements will start to push at bottom rather of stack property to push element at top.
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter size of stack:- ");
//         int n=sc.nextInt();
//         Stack<Integer>st=new Stack<>();
//         System.out.println("Enter elements of stack:- ");
//         for(int i=0;i<n;i++){
//             st.push(sc.nextInt());
//         }
//         reversestack(st);
//         while(!st.empty()){
//             System.out.println(st.peek());
//             st.pop();
//         }
//     }
// }



// Queue:- First in first out(FIFO)
//=================================
// elements are added at rear end at taken from front end
// operations:- add,remove,peek 
// add : add elements but throws exeception , offers performs same function but return true or false rather than exception.
// remove : removes and return head of queue but throws exception , poll performs same function but return null rather than exception.
// element : return head of queue but throws exeception , peek performs same function but return null rather than exception.




// import java.util.*;
// public class collection_framework{
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int n=in.nextInt();
//         // Can be created using two methods:-
//         //================================
//         // 1.
//         // Queue<Integer>q=new LinkedList<>();
//         // for(int i=0;i<n;i++){
//         //     q.add(in.nextInt());
//         // }
//         // while(!q.isEmpty()){
//         //     System.out.println(q.peek());
//         //     q.remove();
//         // }
//         // 2.
//         // Queue<Integer>q=new ArrayDeque<>();
//         // for(int i=0;i<n;i++){
//         //     q.add(in.nextInt());
//         // }
//         // while(!q.isEmpty()){
//         //     System.out.println(q.peek());
//         //     q.remove();
//         // }
//     }
// }


// Sets: Allows duplicate elements:-
// random ordering: Hashset, LinkedHashSet : as you add elements vessi ordering, Treeset : sorted order
// Hashset,Treeset,LinkedHashset



//  HashSet: Random adding: set.add()
//====================================================

// import java.util.*;
// public class collection_framework{
//     public static void main(String[] args) {
//         Set<Integer>s=new HashSet<>();
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             s.add(sc.nextInt());
//         }
//         System.out.println(s);    
//     }
// }


//  LinkedHashSet: in same order you enter elements as
//====================================================


// import java.util.*;
// public class collection_framework{
//     public static void main(String[] args) {
//         Set<Integer>s=new LinkedHashSet<>();
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             s.add(sc.nextInt());
//         }
//         System.out.println(s);      
//     }
// }


//  TreeSet: sorted order
//========================


// import java.util.*;
// public class collection_framework{
//     public static void main(String[] args) {
//         Set<Integer>s=new TreeSet<>();
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             s.add(sc.nextInt());
//         }
//         System.out.println(s);       
//     }
// }


// Maps: KEY VALUE PAIR
//=======================
// Hashmaps, TreeMap
// TreeMap is sorted on basic of key not on basics of values



// import java.util.*;
// public class collection_framework{
//     public static void main(String[] args) {
//         Map<String,Integer>m=new HashMap<>();
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter number of key value pairs ");
//         int n=sc.nextInt();
//         sc.nextLine();
//        for(int i=0;i<n;i++ ){
//         System.out.print("Enter key");
//         String key=sc.nextLine();
//         System.out.print("Enter value");
//         int value=sc.nextInt();
//         m.put(key,value);
//         sc.nextLine();
//        }
//    System.out.println(m);
//     }
// }




// collection classes and array class
//===================================
// array classes: Arrays.fill
// Arrays.sort
// Comparable Interface:- natural ordering or built in ordering, inside class (Compareto) Method is used
// Comparator Interface:- custom ordering, outside class(Compare) method is used.
// Comparator.reverseOrder()=>TO reverse order of printing if ascending=>descending.


// import java.util.*;
// public class collection_framework{
//     public static void main(String[] args) {
//         Integer[]arr={21,2,13,4,15};
//         Arrays.sort(arr,Comparator.reverseOrder());
//         System.out.println(Arrays.toString(arr));
//     }
// }




// PriorityQueue:-sets a minheap
//==============================
// We can also convert minheap back to maxheap:- Comparator.reverseOrder();
// import java.util.*;
// public class collection_framework{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder()); // => converts to maxheap
//         for(int i=0;i<n;i++){
//             pq.add(sc.nextInt());
//         }
//         System.out.print(pq);
//     }
// }

