package inho;

import java.util.*;

// https://school.programmers.co.kr/learn/courses/30/lessons/42576
// 해시 - Lv1 완주하지 못한 선수
public class 완주하지_못한_선수 {
    public static void main(String[] args) {

    }

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Map<String, Integer> map = new HashMap<>(); // 맵: 완주자 이름, 수

            // 맵에 완주자와 수 등록
            for (String str : completion) {
                if (!map.containsKey(str)) {
                    map.put(str, 1);
                } else {
                    int number = map.get(str);
                    map.put(str, number + 1);
                }
            }

            // 참가자가 맵에 존재하는지 확인하고 존재하면 맵의 값을 1 뺀다. 만약 맵에 값이 존재하지 않거나 0이라면 해당 참가자가 정답
            for (String str : participant) {
                if (map.get(str) == null || map.get(str) == 0) { // 참가자가 정답인 경우
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
}
