package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        NumString sol = new NumString();
        int answer = sol.solution("one4seveneight");

        if(answer==1478){
            System.out.println("pass");
        }
        else{
            System.out.println("fail=="+ answer);
        }
    }


}