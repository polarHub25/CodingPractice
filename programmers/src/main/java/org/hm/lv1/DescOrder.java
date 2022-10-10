package org.hm.lv1;

/*
  정수 내림차순으로 배치하기
* 함수 solution은 정수 n을 매개변수로 입력받습니다.
*  n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
* 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * */

import java.util.Arrays;
import java.util.Collections;

public class DescOrder {
    public long solution(long n) {

        long answer = 0;
      /*  int length = (int)Math.log10(n) + 1;
        String invertN = String.valueOf(n);
        // 각 한자리씩 배열에 넣기
        String arrStr[] = new String[length];
        String flag = "";

        for(int i = 0; i< length; i++){
            arrStr[i] = invertN.substring(i, i+1);
        }

        for(int j=0; j<length;j++){
            for(int z=j+1; z<length;z++){
                if(Integer.parseInt(arrStr[j]) < Integer.parseInt(arrStr[z])){
                    flag = arrStr[j];
                    arrStr[j] = arrStr[z];
                    arrStr[z] = flag;
                }
            }
        }

        answer = Long.parseLong(String.join("",arrStr));*/

        //sort() , split() , Collections  사용해서 코드 작성
        String[] arrN = String.valueOf(n).split("");

        Arrays.sort(arrN , Collections.reverseOrder());

        answer = Long.parseLong(String.join("",arrN));

        return answer;
    }
}
