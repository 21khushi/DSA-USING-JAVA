



                             // String Buffer: Mutable by nature
                            //================= efficient and thread safe( one thread at a time)
                           //                 slower and safer in comparison to StringBuilder


// public class stringbuffer {
//     public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer();
//     sb.append("My name is ");
//     sb.append("Khushi Sikka ");  // no new object is created
//     String str=sb.toString();
//     System.out.println(str);
// }
// }


//  Some properties of StringBuffer:-
//=======================================



// public class stringbuffer {
//     public static void main(String[] args) {
//     StringBuffer sb=new StringBuffer();
//     sb.append("My name is ");
//     sb.append("Khushi Sikka ");  // no new object is created
//     String str=sb.toString();
//     System.out.println(str);

//     // sb.insert(2, " inserted ");
//     // String insert=sb.toString();
//     // System.out.println(insert);


//     // sb.replace(1,4," replaced "); // 1 to 3 ki range ( does not count last number , one less than last number)
//     // String replace=sb.toString();
//     // System.out.println(replace);

//     sb.delete(1,5);
//      String delete=sb.toString();
//     System.out.println(delete);}
// }


// String Properties:-
//=====================

 // to remove whitespaces:-
//==========================

    // public class stringbuffer{
    //   public static void main(String[] args) {
    //       String name="HI THIS IS CONCEPT OF STRINGS";
    //       System.out.println(name.replaceAll("\\s",""));
    //   }
    // }


 // to split strings:-
//==========================

//   public class stringbuffer{
//       public static void main(String[] args) {
//           String names="KHUSHI ,ANVI ,VASU,SHREYA,GUNN, HEMANGI, ANUBHA, KANAK ,AASTHA";
//           String[]splitnames=names.split(",");
//           System.out.println(Arrays.toString(splitnames));     
//       }
//     }


