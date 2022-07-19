package org.hm.lv1;

import java.util.ArrayList;

public class RemoveSmallestNumber {

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int flag = arr[0];
        int index = 0;

        ArrayList<Integer> arrList = new ArrayList<>();

        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        for(int i=0; i< arr.length; i++){
            if(flag > arr[i]){
                flag = arr[i];
                index = i;
                System.out.println("flag::::::"+flag);
                System.out.println("index::::::"+ index);
            }
            arrList.add(arr[i]);
        }

        arrList.remove(index);

        System.out.println(arrList);

        answer = new int[arrList.size()];

        for(int j = 0; j<arrList.size(); j++){
            answer[j] = arrList.get(j);
        }

        return answer;
    }
}
