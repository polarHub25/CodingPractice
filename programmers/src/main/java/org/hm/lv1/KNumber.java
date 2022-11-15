package org.hm.lv1;

import java.util.Arrays;

public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answerCnt = 0;
        /*
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        * */

        //commands 의 숫자들을 나눠야함!
        for(int row = 0; row < commands.length; row++){
            int start = commands[row][0];
            int end = commands[row][1];
            int selectNum = commands[row][2]-1;
            int[] arrayFlag = new int[end-start+1];
            int arrayFlagCnt = 0;

            for(int i = start-1; i < end; i++){
                //arrayFlag 범위만큼의 값 넣기
                arrayFlag[arrayFlagCnt++] = array[i];
            }
            //정렬
            Arrays.sort(arrayFlag);

            answer[answerCnt++] = arrayFlag[selectNum];
        }
        return answer;
    }

}
