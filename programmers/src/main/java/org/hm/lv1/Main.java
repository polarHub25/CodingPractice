package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};
        MakeQueue sol = new MakeQueue();
        int answer = sol.solution(queue1, queue2);

        if(answer==2){
            System.out.println("pass");
        }else{
            System.out.println("fail========"+answer);
        }


    }


}