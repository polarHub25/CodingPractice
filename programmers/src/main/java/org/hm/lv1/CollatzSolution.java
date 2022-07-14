package org.hm.lv1;

public class CollatzSolution {

    public int solution(int num) {
        int answer = 0;

        if(num == 1)
        {
            answer = 0;
            return answer;
        }

        while(true){
            if(num%2==0){
                num = num/2;
                answer++;
                if(num == 1){
                    break;
                }
            }else{
                num = (num*3)+1;
                answer++;
                if(num == 1){
                    break;
                }
            }
        }

        if(answer > 500){
            answer = -1;
        }

        return answer;
    }
}
