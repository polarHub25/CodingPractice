package org.example;
import java.util.*;

public class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        //int answer = 123456789;
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++){

            if (!signs[i]) {
                absolutes[i] = absolutes[i] * (-1);
            } else {
                absolutes[i] = absolutes[i] * (1);
            }
        answer += absolutes[i];
        }
        
        return answer;
    }
}