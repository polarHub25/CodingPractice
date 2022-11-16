package org.hm.lv1;

public class NumString {
    public int solution(String s) {
        int answer = 0;

        String[] flag = {"zero","one","two","three","four", "five", "six","seven","eight","nine"};

        for(int i = 0; i < flag.length; i++ ){
            s = s.replace(flag[i] , Integer.toString(i));
        }
        answer = Integer.parseInt(s);

        return answer;
    }

}
