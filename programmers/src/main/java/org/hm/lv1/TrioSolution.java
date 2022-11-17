package org.hm.lv1;

public class TrioSolution {
    public int solution(int[] number) {
        int answer = 0;

        for(int i=0;i<number.length;i++){
            for(int j=i+1;j< number.length;j++){
                for(int z=j+1;z< number.length;z++){
                    int sum = number[i]+number[j]+number[z];
                    if(sum == 0){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}
