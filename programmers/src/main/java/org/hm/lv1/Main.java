package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        CaesarCipher sol = new CaesarCipher();
        String answer = sol.solution("AB" , 1);
        if(answer.equals("BC")){
            System.out.print("PASS::"+answer);
        }else{
            System.out.print("FAIL::"+answer);
        }

    }


}