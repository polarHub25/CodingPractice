package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        KNumber sol = new KNumber();
        int[] answer = sol.solution(array , commands);

       for(int i = 0; i < answer.length; i++){
           System.out.print("======="+answer[i]);
       }

    }


}