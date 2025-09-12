import java.util.List;

public class leetcode_448 {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(arr));
    }
        public static List<Integer> findDisappearedNumbers(int[] arr) {
            int i=0;
            while(i<arr.length){
            int correct=arr.length-1;
            if(arr[i] < arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        
    }
}
