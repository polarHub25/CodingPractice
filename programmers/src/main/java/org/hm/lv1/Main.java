package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {
        Camouflage sol = new Camouflage();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        int answer = sol.solution(clothes);

        if(answer==5){
            System.out.println("pass");
        }else{
            System.out.println("fail==="+answer);
        }


    }


}