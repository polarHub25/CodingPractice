package org.hm.lv1;

import java.util.ArrayList;

public class AnswerQuestion {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] oneArr = {1,2,3,4,5};
        int[] twoArr = {2,1,2,3,2,4,2,5};
        int[] threeArr = {3,3,1,1,2,2,4,4,5,5};

        int[] resultCnt = {0,0,0};

        //각 수포자들의 방식과 답 비교해서 맞힌 문제수 카운트
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == oneArr[i%oneArr.length]) resultCnt[0]++;
            if(answers[i] == twoArr[i%twoArr.length]) resultCnt[1]++;
            if(answers[i] == threeArr[i%threeArr.length]) resultCnt[2]++;
        }

        int bigest = Math.max(Math.max(resultCnt[0],resultCnt[1]), resultCnt[2]);
        ArrayList<Integer> resultList = new ArrayList<>();
        for(int j=0; j< resultCnt.length;j++){
            if(bigest==resultCnt[j]) resultList.add(j+1);
        }
        answer = new int[resultList.size()];

        for(int z=0; z< resultList.size(); z++){
            answer[z] = resultList.get(z);
        }

        return answer;
    }
}
