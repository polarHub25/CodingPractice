package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {

//        Lotto sol = new Lotto();
//
//        int[] lottos = {44, 1, 0, 0, 31, 25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};
//
//        int[] answer = sol.solution(lottos,win_nums);
//
//        if(answer[0]==3){
//            System.out.println("pass");
//        }
//        else{
//            for(int i =0; i < answer.length; i++) {
//                System.out.println("fail======" + answer[i]);
//            }
//        }

        //행렬 테두리 회전하기
        RotateMatrix sol2 = new RotateMatrix();
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[] answer2 = sol2.solution(6,6,queries);

//        if(answer2[0]==8){
//            System.out.println("pass");
//        }
//        else{
//            for(int i =0; i < answer2.length; i++) {
//                System.out.println("fail======" + answer2[i]);
//            }
//        }

    }


}