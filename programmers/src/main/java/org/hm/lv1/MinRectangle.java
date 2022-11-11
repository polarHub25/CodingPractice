package org.hm.lv1;

// 완전탐색 - 최소직사각형.

public class MinRectangle {
    public int solution(int[][] sizes) {
        int answer = 0;

        int row = 0;
        int col = 0;

        for(int i = 0; i < sizes.length; i++){
            int flagRow = Math.max(sizes[i][0],sizes[i][1]);
            int flagCol = Math.min(sizes[i][0],sizes[i][1]);

            row = Math.max(row , flagRow);
            col = Math.max(col , flagCol);
        }
        answer = row * col;


        return answer;
    }
}
