package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {

        AnswerQuestion sol = new AnswerQuestion();

        int[] param = {1,2,3,4,5};

        int[] answer = sol.solution(param);


        if(answer[0]==1){
            System.out.println("pass");
        }
        else{
            for(int i =0; i < answer.length; i++) {
                System.out.println("fail======" + answer[i]);
            }
        }
    }


}