package NeetCode150.solution1;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int requires= target-nums[i];
            if (map.containsKey(requires)) {
                return new int[]{map.get(requires),i};
            }else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {

       int[] nums = {3,4,5,6};
       int target = 7;

System.out.println(Arrays.toString(twoSum(nums, target)));
        
    }
    
}
