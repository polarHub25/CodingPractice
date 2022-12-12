package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        UnfinishedPlayer sol = new UnfinishedPlayer();
        String answer = sol.solution(participant,completion);

        if(answer=="leo"){
            System.out.println("pass");
        }else{
            System.out.println("fail========"+answer);
        }


    }


}