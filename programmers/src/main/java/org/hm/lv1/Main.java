package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {

        Solution sol = new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = sol.solution(arr);
        if(answer[1]==3){
            System.out.println("pass");
        }else{
            System.out.println("fail==="+answer[1]);
        }


    }


}