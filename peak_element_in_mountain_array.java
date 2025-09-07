public class peak_element_in_mountain_array {
    public static void main(String[] args) {
        int[] arr={0,2,3,0};
        int result=peak_element_in_mountain(arr);
        System.out.println(result);
    }
    public static int peak_element_in_mountain(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start; //or return end as both are equal
    }
}
