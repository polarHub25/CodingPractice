package org.hm.lv1;

import java.util.HashMap;
import java.util.Map;

public class CloselyStr {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<String, Integer> indexMap = new HashMap<>();
        String[] strings = s.split("");

        for (int i = 0; i < s.length(); i++) {
            String temp = strings[i];
            if (!indexMap.containsKey(temp)) {
                answer[i] = -1;
            } else {
                int index = indexMap.get(temp);
                answer[i] = i - index;
            }

            indexMap.put(temp, i);
        }

        return answer;
    }
}
