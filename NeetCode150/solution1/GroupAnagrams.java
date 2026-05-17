package NeetCode150.solution1;

import java.util.*;

public class GroupAnagrams {

    public static String getFrequenceyString(String str){
        str.toLowerCase();
        // frequency bucket 
        int[] freq= new int[26];
        // iterate over each char of string store to bucket 
        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }
        // create the frequency string 
        StringBuilder sb= new StringBuilder();
        char c='a';
        for(int i : freq){
            sb.append(c);
            sb.append(i);
        }

        return sb.toString();
    }

    public static List<List<String>> groupAnagrams(String[] str){
        if (str==null || str.length==0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> frequencyStringMap = new HashMap<>();
        for(String s: str){
            String frequencyString= getFrequenceyString(s);
            if (frequencyStringMap.containsKey(frequencyString)) {
                frequencyStringMap.get(frequencyString).add(s);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                frequencyStringMap.put(frequencyString, list);
            }
        }
        return new ArrayList<>(frequencyStringMap.values());
    }
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(strs));

    }
    
}
