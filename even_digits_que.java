public class even_digits_que {

    // leetcode question 1295
    
    public static void main(String[] args) {
        int[]arr={12,345,2,6,7896};
        int count=0;
        int result=evendigits(arr, count);
        System.out.println("Count of even digit numbers : "+result);
    }
    public static int evendigits(int[]arr, int count){
        for(int i=0;i<arr.length;i++){
            int len=String.valueOf(arr[i]).length();
            if(len%2==0){
                count++;
            }
        }
        return count;
    }
}
