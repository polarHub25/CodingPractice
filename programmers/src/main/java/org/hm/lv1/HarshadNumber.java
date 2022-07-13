package org.hm.lv1;

import java.util.stream.Stream;

public class HarshadNumber {
    public boolean solution(int x) {
        boolean answer = true;

        int[] input = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;

        for(int i = 0; i < input.length; i++){
            sum += input[i];
        }
        if(x%sum==0){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}
