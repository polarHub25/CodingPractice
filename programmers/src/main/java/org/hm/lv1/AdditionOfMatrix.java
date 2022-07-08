package org.hm.lv1;

import java.util.Arrays;

//행렬의 덧셈
public class AdditionOfMatrix {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
         System.out.println(Arrays.deepToString(answer));
        return answer;
    }

}
