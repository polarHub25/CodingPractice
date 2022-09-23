package org.hm.lv1;

import java.util.*;

public class AddDigit {
    public int solution(int n) {
        int answer = 0;
        int length = (int) Math.log10(n)+1;
        String arrNum[] = new String[length];
        String input = String.valueOf(n);

        for(int i = 0; i < length; i++){
           arrNum[i]  = input.substring(i , i+1);
           answer += Integer.parseInt(arrNum[i]);
        }
        return answer;
    }
}
