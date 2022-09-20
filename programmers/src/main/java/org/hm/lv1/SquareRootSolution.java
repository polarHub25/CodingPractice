package org.hm.lv1;

public class SquareRootSolution {

    public double solution(long n) {
        double answer = 0;


        if(n%Math.sqrt(n)==0){ //Math.sqrt()
            answer = Math.pow(Math.sqrt(n)+1 , 2); // Math.pow(double a, double n)
        }else{
            answer = -1;
        }
       return answer;
    }

}
