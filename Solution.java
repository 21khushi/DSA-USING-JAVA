                                    // LIST:->
                        // ROTATION COUNT OR Find Kth Rotation
                     //-------------------------------------------


// import java.util.List;
// public class Solution {
//     public int findKRotation(List<Integer> arr) {
//             int pivot=findpivot(arr);
//             if(pivot==-1){
//                 return 0;
//             }
//             else{
//                 return pivot+1;
//             }
//         }
//        int findpivot(List<Integer> arr){
//            int start=0;
//            int end=arr.size()-1;
//            while(start<=end){
//                int mid=start+(end-start)/2;
//                if(mid<end && arr.get(mid)>arr.get(mid+1)){
//                    return mid;
//                }
//                else if(mid>start && arr.get(mid)<arr.get(mid-1)){
//                    return mid-1;
//                }
//                if(arr.get(mid)<=arr.get(start)){
//                    end=mid-1;
//                }
//                else{
//                    start=mid+1;
//                }
//            }
//            return -1;
//        }
//     }

