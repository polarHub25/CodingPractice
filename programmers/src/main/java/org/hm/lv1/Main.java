package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        int[][] param = {{60,50},{30,70},{60,30},{80,40}};
        MinRectangle sol = new MinRectangle();
        int answer = sol.solution(param);

        if(answer==4000){
            System.out.println("pass");
        }else{
            System.out.println("fail========="+answer);
        }

    }


}