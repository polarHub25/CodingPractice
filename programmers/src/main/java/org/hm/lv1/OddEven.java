package org.hm.lv1;

public class OddEven {

    public static String solution(int num) {
        String answer = "";

        if(num%2==0 || num == 0){
            answer = "Even";
        }else{
            answer = "Odd";
        }

        return answer;
    }
}
