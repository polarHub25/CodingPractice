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

        GameMapDst sol = new GameMapDst();
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int answer = sol.solution(maps);
        if(answer==11){
            System.out.println("pass");
        }else{
            System.out.println("fail==="+answer);
        }


    }


}