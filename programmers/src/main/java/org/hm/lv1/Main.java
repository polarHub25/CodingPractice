package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        int[] param = {-3, -2, -1, 0, 1, 2, 3};
        TrioSolution sol = new TrioSolution();
        int answer = sol.solution(param);

        if(answer==5){
            System.out.println("pass");
        }
        else{
            System.out.println("fail=="+ answer);
        }
    }


}