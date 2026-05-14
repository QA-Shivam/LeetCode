import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class solution {

    public static int firstUniqChar(String s ){
        Map<Character,Long> m= new LinkedHashMap<>();
        m=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
        for(int i=0;i<s.length();i++){
            if(m.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       firstUniqChar("Swiss");
    }
    
}
