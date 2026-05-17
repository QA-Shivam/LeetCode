package NeetCode150.solution1;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        s=s.toLowerCase();
        t=t.toLowerCase();
        s=s.replace(" ", "");
        t=t.replace(" ", "");
        int counts[]= new int[26];
        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            counts[t.charAt(i)-'a']--;
        }

        for(int c: counts){
            if (c!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s, t));
    }
    
}
