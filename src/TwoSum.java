import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    static int[] exec(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsValue(target-arr[i])) {
                return new int[]{arr[i], map.get(target-arr[i])};
            }

            map.put(arr[i], arr[i]);
        }
        return new int[]{};
    }
}
