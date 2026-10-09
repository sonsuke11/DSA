public class palindromeArray {
    static boolean isPalinDromeArray(int[] arr){
        int left = 0;
        int right = arr.length -1;
        boolean result = true;
        while(left< right && result){
            result = arr[left] == arr[right];
            right--;
            left++;
        }
        return result;
    }
}
