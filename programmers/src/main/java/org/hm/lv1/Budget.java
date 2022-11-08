package org.hm.lv1;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        //배열을 오름차순
        Arrays.sort(d);
        // budget 금액 이하만큼 지급 가능한 부서 수 세기
        for(int i = 0; i < d.length; i++){
            total += d[i];
            if(total > budget){
                answer = i;
                break;
            }else{
                answer++;
            }
        }

        return answer;
    }
}
