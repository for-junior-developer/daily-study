import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String str : completion) {
            if (!map.containsKey(str)) {
                map.put(str, 1);
            } else {
                int number = map.get(str);
                map.put(str, number + 1);
            }
        }
        
        for (String str : participant) {
            if (map.get(str) == null || map.get(str) == 0) {
                answer = str;
                break;
            } else {
                int number = map.get(str);
                map.put(str, number - 1);
            }
        }
        
        return answer;
    }
}
