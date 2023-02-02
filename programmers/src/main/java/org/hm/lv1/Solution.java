package org.hm.lv1;

import java.util.Stack;

//같은 숫자는 싫어
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        //연속적인 수 제거하기

        Stack<Integer> stack = new Stack();
        //첫번째 숫자는 무조건 넣어주기
        stack.push(arr[0]);

        for(int i = 1; i < arr.length; i++){
            // 배열에서 이전숫자가 현재 i번째와 같으면 push안함
            if(arr[i-1]!=arr[i]){
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];
        System.out.println(answer.length);
        System.out.println(stack.size());
        for(int i = answer.length-1; i >= 0; i--){
            answer[i] = stack.pop();
        }

        return answer;
    }
}

