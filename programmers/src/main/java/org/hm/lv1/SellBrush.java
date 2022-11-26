package org.hm.lv1;

import java.util.HashMap;
import java.util.Map;

public class SellBrush {

    static Map<String, Integer> enrollMap = new HashMap<>();
    static Map<String, String> connect = new HashMap<>();

    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int [enroll.length];

        /* String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller ={"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};*/

        for(int i = 0; i < enroll.length; i++){
            enrollMap.put(enroll[i] , 0);
            connect.put(enroll[i] , referral[i]);
        }

        for(int j = 0; j < seller.length; j++){
            dfs( seller[j] , amount[j] * 100);
        }

        for(int z = 0; z < enroll.length; z++){
            answer[z] = enrollMap.get(enroll[z]);
        }

        return answer;
    }

    public static void dfs(String name, int money){

        if(name.equals("-") || money == 0){
            return;
        }

        int benefitMoney = (int)(Math.ceil(money * 0.9));
        int restMoney = money - benefitMoney;
        String nextName = connect.get(name);
        enrollMap.replace(name, enrollMap.get(name)+benefitMoney);
        dfs(nextName, restMoney);

    }
}
