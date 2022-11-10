package org.hm.lv1;

import java.net.InterfaceAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)
    {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        SecretMap sol = new SecretMap();
        String[] answer = sol.solution(5, arr1, arr2);

        for(int i=0; i< answer.length; i++){
            System.out.print(answer[i]);
        }



    }


}