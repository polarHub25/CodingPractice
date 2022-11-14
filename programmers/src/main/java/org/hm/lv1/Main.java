package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        String[] param = {"sun", "bed", "car"};
        StringSort sol = new StringSort();
        String[] answer = sol.solution(param , 1);

       for(int i = 0; i < answer.length; i++){
           System.out.print("======="+answer[i]);
       }

    }


}