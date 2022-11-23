package suyeon;

import java.util.HashMap;
import java.util.Set;

public class Hash01 {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        String name = solution(participant, completion);
        System.out.println(name);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> partMap = new HashMap<>();
        for(String p : participant){
            partMap.put(p, partMap.getOrDefault(p,1)+1);
        }

        for(String c : completion){
            partMap.put(c, partMap.get(c)-1);
        }

        Set<String> keys = partMap.keySet();
        for (String key : keys) {
            if(partMap.get(key)!=0){
                answer = key;
                break;
            }
        }

        return answer;
    }
}

