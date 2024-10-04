                              // Generics:- To achieve Type-Safety
                              //-----------------------------------------
                              //            To declare type of object before
                              //          Generalized using angle brackets : <T>
                              //        prevents error in compile and runtime
                              //       Generic Constructor and Generic Interface( which use Number(wrapper class) so that T can extend its qualities and can be any data type: Integer , Float , double)
                              //       Generics only uses class(<Integer>) not data types: int,float etc.



// class Container<T>{
//     T value;
//     public void show(){
//         System.out.println(value.getClass().getName()); // to print class name( java.lang.Integer )
//     }
// }
// public class generic {
//     public static void main(String[] args) {
//     Container<Integer>object=new Container<Integer>();
//     object.value=9;
//     object.show();
// }
// }