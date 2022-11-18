package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {

        CalDate sol = new CalDate();
        String answer = sol.solution(5,24);


        if(answer=="TUES"){
            System.out.println("pass");
        }
        else{
            System.out.println("fail=="+ answer);
        }
    }


}