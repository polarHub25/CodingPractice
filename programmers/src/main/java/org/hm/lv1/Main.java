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

        TargetNum sol = new TargetNum();
        int[] numbers = {1, 1, 1, 1, 1};
        int answer = sol.solution(numbers, 3);
        if(answer==5){
            System.out.println("pass");
        }else{
            System.out.println("fail==="+answer);
        }


    }


}