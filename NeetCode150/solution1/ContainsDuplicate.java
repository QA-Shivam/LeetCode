package NeetCode150.solution1;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums) {
      Set<Integer> s= new HashSet<>();
      for(int n : nums){
        if(s.contains(n)){
            return true;
        }else{
            s.add(n);
        }
      }
      return false;
    }

    public static void main(String[] args) {
         int [] nums = {1, 2, 3, 3};
        System.out.println(hasDuplicate(nums));
    }
}