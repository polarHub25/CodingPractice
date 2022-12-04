package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {
        int[][] queries = {{1,4},{2,2},{1,3},{1,6},{3,-1},{2,-1}};
        StackBottom sol = new StackBottom();
        int[] answer = sol.solution(3, queries);

        if(answer[0]==4){
            System.out.println("pass");
        }else{
            System.out.println("fail========"+answer[0]);
        }


    }


}