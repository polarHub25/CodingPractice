package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {

        PoketSol sol = new PoketSol();

        int[] param = {3,1,2,3};

        int answer = sol.solution(param);


        if(answer==2){
            System.out.println("pass");
        }
        else{
            System.out.println("fail=="+ answer);
        }
    }


}