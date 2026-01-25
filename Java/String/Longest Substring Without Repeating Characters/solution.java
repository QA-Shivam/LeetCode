import java.util.HashSet;
import java.util.Set;

public class solution{
    public static int lengthOfLongestSubstring(String str ){
        int right=0;
        int left=0;
        int maxlen=0;
     /* We use a HashSet to maintain the set of unique characters
      in the current window and to detect duplicates in O(1) time,
      which allows the sliding window algorithm to run in linear time.*/
        Set<Character> set= new HashSet<>();
        for(right=0;right<str.length();right++){
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxlen=Math.max(maxlen, right-left+1);
        }
        return maxlen;

    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("Shivam"));
    }
}