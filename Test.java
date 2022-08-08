import java.util.HashMap;
import java.util.Set;
public class Test {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String,String>();
        userMap.put("adrianmorales2635@gmail.com", "Adrian Morales");
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        String name = userMap.get("nninja@codingdojo.com");
        System.out.println(name);
        Set<String> keys = userMap.keySet();
        for(String key: keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}