package org.hm.lv1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
* 문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항
arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.
입출력 예
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]
*
*  1. divisor로 나누어 떨어지는 값 나오게 하기
*  2. 나누어 떨어어진 값 리스트에 넣고 정렬하기
*
* */
public class DivisorZero {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> divisorZero = new LinkedList<>(); // arraylist 보다 삽입,삭제가 효율적

        for(int i =0; i< arr.length; i++)
        {
            if(arr[i] % divisor == 0){
                divisorZero.add(arr[i]);
            }
        }

        if(divisorZero.size()==0)
        {
            answer[0] = -1;
        }
        else
        {
            answer = new int[divisorZero.size()];
            Collections.sort(divisorZero);

            for(int j = 0; j< divisorZero.size(); j++)
            {
                answer[j] = divisorZero.get(j);
            }
        }

        return answer;
    }
}
