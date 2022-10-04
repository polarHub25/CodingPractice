package org.hm.lv1;

public class DigitFlip {

    public int[] solution(long n) {
        int[] answer = {};

        int length = (int)Math.log10(n)+1;

        String convertN = String.valueOf(n);
        String arrConver[] = new String[length];
        answer = new int[length];


        for(int i = 0; i < length; i++){
            arrConver[i] = convertN.substring(i , i+1);
        }

        for(int j = 0; j < length; j++){
            answer[j] = Integer.parseInt(arrConver[length-1-j]);
        }
        return answer;
    }

}
