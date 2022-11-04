package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        MakeChar sol = new MakeChar();
        String answer = sol.solution(" apPle try");  //asdf asdf asdf a a a a
        if(answer == "TrY HeLlO WoRlD"){
            System.out.println("Ok");
        }
        else{
            System.out.println("====="+answer);
        }

    }


}