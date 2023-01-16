package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {
//        FindDecimal sol = new FindDecimal();
//        String numbers = "314"; // 11 101
//        int answer = sol.solution(numbers);
//
//        if(answer==2){
//            System.out.println("pass");
//        }else{
//            System.out.println("fail==="+answer);
//        }

        CloselyStr sol = new CloselyStr();
        String s = "banana";
        int[] answer = sol.solution(s);
        if(answer[0]==-1){
            System.out.println("pass");
        }else{
            System.out.println("fail==="+answer[0]);
        }


    }


}