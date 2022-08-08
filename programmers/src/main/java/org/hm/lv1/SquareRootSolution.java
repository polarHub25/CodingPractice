package org.hm.lv1;
//정수 제곱근 판별
public class SquareRootSolution {

    public double solution(long n) {
        double answer = 0;

        //제곱근일 경우
        if(n%Math.sqrt(n)==0){ //Math.sqrt() : 제곱근 반환
            answer = Math.pow(Math.sqrt(n)+1 , 2); // Math.pow(double a, double n) : a의 n승
        }else{
            answer = -1;
        }
       return answer;
    }

}
