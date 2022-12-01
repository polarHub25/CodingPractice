package org.hm.lv1;

import java.util.LinkedList;
import java.util.Queue;

public class MakeQueue {
    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;

        Queue<Integer> queueOne = new LinkedList<>();
        Queue<Integer> queueTwo = new LinkedList<>();

        long sum1 = 0;
        long sum2 = 0;

        for(int i = 0; i < queue1.length; i++){
            sum1 += queue1[i];
            queueOne.offer(queue1[i]);
        }
        for(int j = 0; j < queue2.length; j++){
            sum2 += queue2[j];
            queueTwo.offer(queue2[j]);
        }

        int count = 0;
        while(sum1 != sum2){
            count++;

            if(sum1 > sum2){
                int value = queueOne.poll();
                sum1 -= value;
                sum2 += value;
                queueTwo.offer(value);
            }else{
                int value = queueTwo.poll();
                sum1 += value;
                sum2 -= value;
                queueOne.offer(value);
            }

            if(count > (queue1.length + queue2.length) * 2 ) return -1;
        }
        answer = count;

        return answer;
    }
}
