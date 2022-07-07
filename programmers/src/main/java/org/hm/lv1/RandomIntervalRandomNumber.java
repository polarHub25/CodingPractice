package org.hm.lv1;

public class RandomIntervalRandomNumber {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long sum = 0;

        for(int i=0;i<n;i++)
        {
            sum += x;
            answer[i] = sum;
            System.out.println(answer[i]);
        }


        return answer;
    }
}
