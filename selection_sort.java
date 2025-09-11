import java.util.Arrays;
public class selection_sort {
    public static void main(String[] args) {
        int[] arr={3,1,6,5,2};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection_sort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int maxindex=getMaxIndex(arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static int getMaxIndex(int[]arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void swap(int []arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
