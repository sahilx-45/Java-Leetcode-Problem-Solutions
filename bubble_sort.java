import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
       int []arr={5,3,7,2,1}; 
       bubble_sort(arr);
       System.out.println(Arrays.toString(arr));
    }
    public static void bubble_sort(int[]arr){
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;

                }
            }
            if(!swap){
                break;
            }
        }
    }

}
