public class RotateLeft {
    static int[] rotateLeft(int[] arr, int k){
        reverse(arr, k , arr.length-1);
        reverse(arr, 0 , k-1);
        reverse(arr, 0 , arr.length-1);
        return arr;
    }
    static void reverse(int[] arr, int start, int end){
        while (start <end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end --;
            start++;
        }
    }
}
