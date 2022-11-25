package org.hm.lv1;

public class RotateMatrix {
    public int[] solution(int rows, int columns, int[][] queries) {

        // int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        //        int[] answer2 = sol2.solution(6,6,queries);
        int[] answer = new int[queries.length];
        int flag = 1;

        int[][] matrix = new int[rows+1][columns+1];
        for(int i = 1; i<=rows; i++){
            for(int j=1; j<=columns; j++){
                matrix[i][j] = flag++;
            }
        }
        for(int i = 0; i< queries.length;i++){
            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];

            int temp = matrix[x1][y1];
            int min = temp;

            //왼쪽
            for(int j = x1; j < x2; j++){
                matrix[j][y1] = matrix[j+1][y1];
                min = Math.min(min, matrix[j][y1]);
            }
            //하단
            for(int j = y1; j < y2; j++){
                matrix[x2][j] = matrix[x2][j+1];
                min = Math.min(min, matrix[x2][j]);
            }
            //오른쪽
            for(int j = x2; j > x1;j--){
                matrix[j][y2] = matrix[j-1][y2];
                min = Math.min(min, matrix[j][y2]);
            }
            //상단
            for(int j = y2; j > y1; j--){
                matrix[x1][j] = matrix[x1][j-1];
                min = Math.min(min, matrix[x1][j]);
            }

            matrix[x1][y1+1] = temp;
            answer[i] = min;

        }

        return answer;
    }
}
