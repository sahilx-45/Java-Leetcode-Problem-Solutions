import java.util.Arrays;
public class cyclic_sort {
    public static void main(String[] args) {
        int arr[]={4,2,5,1,3};
        cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclic_sort(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}
