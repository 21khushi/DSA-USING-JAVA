// import java.util.*;

// public class bug {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = in.nextInt();
//         }
//         String msg = Integer.toString(n) + "[";
//         for (int i = 0; i < n; i++) {
//             msg += Integer.toString(arr[i]);
//             if (i != n - 1)
//                 msg += ",";
//         }
//         msg+="]";
//         throw new RuntimeException(msg);

//     }
// }