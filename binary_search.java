public class binary_search {
    public static void main(String[] args) {
        int[] arr={2,4,7,8,9,10};
        int target=9;
        int result=binary_search(arr, target);
        System.out.println(result);
    }
    public static int binary_search(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
               
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        } 
        return -1;
    }
}
