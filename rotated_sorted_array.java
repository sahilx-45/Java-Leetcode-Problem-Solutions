public class rotated_sorted_array {
    public static void main(String[] args) {
        int [] arr={3,4,5,6,7,0,1,2};
        int result=pivot_ele(arr);
        System.out.println(result);

    }
    public static int pivot_ele(int[]arr){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=(start+end)/2;
                // the four cases
                if(arr[mid]>arr[mid+1] && mid<start){
                    return mid;
                }
                if(arr[mid]<arr[mid-1]  && mid>start){
                    return mid-1;
                }
                if(arr[mid]>=arr[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return -1;
    }
}
