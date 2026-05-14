import java.util.HashMap;
import java.util.Map;

public class solution {
    
     public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req= target-nums[i];
            if (map.containsKey(req)) {
                return new int [] {map.get(req),nums[i]};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
                int [] arr={2,5,6,7};
        System.out.println(twoSum(arr, 9));
    }
}
