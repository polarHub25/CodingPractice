package org.hm.lv1;

public class Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};

        int minCnt = 0;
        int zeroCnt = 0;
        int maxCnt = 0;

        // 두개의 배열 비교 해서 맞는 수 카운트  => 최소갯수
        for(int i = 0; i < lottos.length; i++){
            for(int j=0; j< win_nums.length; j++){
                if(lottos[i] == win_nums[j]) minCnt++;
            }
            if(lottos[i]==0) zeroCnt++;
        }
        maxCnt = minCnt + zeroCnt;


        // 맞는 카운트 수 + 0의 갯수 => 최대갯수
        answer[0] = 7 - Math.max(maxCnt , 1);
        answer[1] = 7 - Math.max(minCnt , 1);

        return answer;
    }
}
