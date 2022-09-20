package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class SumOfDivisor {
    public static int solution(int n) {
        int answer = 0;
        if(n==1){
            return 1;
        }
        Integer arr[] = new Integer[n];
        int flag =0;

        for(int i = 1; i <= n; i++ ){

            if(n%i == 0){
                arr[flag] = i;
                arr[flag+1] = n/i;
                flag++;
            }
        }
        Integer[] resultArr = Arrays.stream(arr).distinct().toArray(Integer[]::new);

        for(int j = 0; j < resultArr.length-1; j++){
            answer += resultArr[j];
        }
        return answer;
    }
}
