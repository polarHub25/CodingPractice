package org.hm.lv1;

import java.util.Stack;

public class StackBottom {
    public int[] solution(int n, int[][] queries){
        int[] answer = {};
        // n : 스택 갯수
        //queries : [][] => 앞은 스택 번호 , 뒤는 넣을 번호
        // 뒤가 -1이면 pop 숫자이면 그 숫자를 해당 스택에 넣는다

        // 스택 자체를 호출해서 확인하는 재귀함수 생성
        //스택 초기화하기
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for(int i=0;i< queries.length; i++){
            if(queries[i][1] != -1){
                stack.push(queries[i][1]);
            }else if(queries[i][1] == -1){
                answer[cnt++] = stack.peek();
                stack.pop();
            }

        }



        return answer;
    }
}
