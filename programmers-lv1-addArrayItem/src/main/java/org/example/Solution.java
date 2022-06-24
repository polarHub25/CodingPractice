package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> temp = new ArrayList<Integer>();

        for(int i = 0; i< numbers.length; i++){
            for(int j = i+1; j <numbers.length; j++){
                temp.add(numbers[i] + numbers[j]);
            }
        }

        temp = temp.stream().distinct().collect(Collectors.toList());

        Collections.sort(temp);

        answer =  new int[temp.size()];
        for(int z=0; z<temp.size(); z++){
            answer[z] = temp.get(z).intValue();
           // System.out.println(answer[z]);
        }

        return answer;
    }

}
