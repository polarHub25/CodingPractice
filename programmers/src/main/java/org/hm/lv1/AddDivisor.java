package org.hm.lv1;
/*
*
* 약수의 개수와 덧셈
문제 설명
두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ left ≤ right ≤ 1,000
입출력 예
left	right	result
13	17	43
24	27	52
* */
public class AddDivisor {
    public int solution(int left, int right) {
        int answer = 0;
        int flag = 0;
        //left 부터 right까지 돌아야하는 반복문
        //약수 찾는 반복분
        //약수의 개수에 따라 더할지 뺄지
        for(int i = left; i <= right; i++){
            flag = 0;
            for(int j=1; j <=i; j++){
                if(i%j==0){
                    flag +=1;
                }
            }
            if(flag%2==0){
                answer +=i;
            }else{
                answer -=i;
            }
        }

        return answer;
    }
}
