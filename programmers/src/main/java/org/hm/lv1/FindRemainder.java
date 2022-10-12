package org.hm.lv1;

public class FindRemainder {
    public int solution(int n) {
        int answer = 0;
        int result = 0;
        int flag = 1;

        while(result!=1){
                result = n%flag;
                answer = flag;
                flag++;
        }

        return answer;
    }
}
