package Java-Leetcode-Problem-Solutions;

public class ceiling_number_leetcode {
        public static void main(String[] args) {
        int[] arr={2,4,8,12,15,19};
        int target=13;
        int result=ceiling_number(arr, target);
        System.out.println(result);
    }
    public static int ceiling_number(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if (target<arr[mid]) {
                end=mid-1;

            }
            else{
                start=mid+1;
            }
        }
        return arr[start];
    }
}
