                            // Multithreading:- many tasks of same program is performed
                            //--------------------------------------------------------


                            
// class Mythread extends Thread{
//   public void run(){
//     System.out.println("HERE IS MULTI THREADING");
//   }
// public class Multithreading {
//     public static void main(String[] args) {
//         Mythread th1=new Mythread();  // object create
//          Mythread th2=new Mythread(); 
//         th1.start();
//         th2.start();
//     }
// }
// }
// here which thread will run will be decided by os or cpu scheduler.


// Thread.sleep Method:-  ( currentThread :-prints reference/info to the current thread running )
//                        ( getName :- prints current thread name)
//----------------------

// class Mythread extends Thread{
// public void run(){
    
// }
// }

// public class Multithreading {
//     public static void main(String[] args) {
//         Mythread th=new Mythread(); // create a object
//         th.start(); // execute code and  create a thread thread-0
//         Thread th1=Thread.currentThread();
//         String name= th1.getName(); // from current thread object get name of thread currently working.
//         // main thread execution

//         for(int i=0;i<10;i++){
//             try {
//                 Thread.sleep(250);
//                System.out.println(i);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
        
//     }
// }




// thread.join() method:-
//------------------------
// This shows that one thread has to either pause its execution until another thread completes its execution.

    class Mythread extends Thread{
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println(i+" "+ Thread.currentThread().getName());
            }
        }
    }  
public class Multithreading {
    public static void main(String[] args) {
        Mythread th=new Mythread(); // create a object
        th.start(); // execute code and  create a thread thread-0
// to pause execution of one thread until another completes its execution
        try{
            th.join();
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        for(int i=0;i<5;i++){
            System.out.println(i+" "+ Thread.currentThread().getName());
        }
    }
}


// Here in this case as we write Mythread th : main thread is called in call stack and as we write th.start() , another thread th is called in stack, so now thread scheduler or os chooses one thread, if it chooses main thread, then main thread will be scheduled to cpu
// as we enter th.join main thread will stop executing until thread-0 start (th) completes its execution. // we have used try and catch to handle interrupted exception handling.
// this.join used in public void run in Mythread class: deadlock( problem )





// Implementing Runnable Interface:-
//-----------------------------------


//     class Mythread implements Runnable{
//         public void run(){
//             for(int i=0;i<5;i++){
//                 System.out.println(i);
//             }
//         }
//     }  
// public class Multithreading {
//     public static void main(String[] args) {
//         Mythread th=new Mythread(); // create a object
//         Thread th1=new Thread(th); // invoke a constructor because we cannot directly use th.start() in runnable interface to call run function
//         th1.start(); 
// }
// }



//                                     Synchronization:- 1. process , thread
//                                ------------------------------------------------


// types of thread synchronization:-
//------------------------------------

// 1. Mutual exclusive
// 2. Cooperation


// MutuaL exclusive:-( if synchronized keyword is used: then if thread has acessed then the object acquires a lock and no other thread could further access the thread )
//--------------------------------------------------------------------------------------------------------------------------------




// class Table{
//     public synchronized void display(int n){
//         for(int i=0;i<10;i++){
//             System.out.println(n*i);
//         }
//     }
// }
// class Thread1 extends Thread{
//     Table t;
//     public Thread1(Table t){
//            this.t=t;
//     }
//     public void run(){
//         t.display(5);
//     }
// }
// class Thread2 extends Thread{
//     Table t;
//     public Thread2(Table t){
//         this.t=t;
//     }
//     public void run(){
//         t.display(6);
//     }
// }
// public class Multithreading {
//     public static void main(String[] args) {
//        Table table=new Table(); // common object for displaying both threads.
//        Thread1 th1=new Thread1(table);
//        Thread2 th2=new Thread2(table);
//        th1.start();// calls run function
//        th2.start();
// }
// }

// as soon as thread1 starts running or executing table will acquire a lock , even after not completing execution fully the thread2 would not work rather it would enter in a blocked state because of synchronization:-Mutual Exclusive Thread Synchronization