package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {
        SellBrush sol = new SellBrush();
        String[] enroll = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] referral = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] seller ={"young", "john", "tod", "emily", "mary"};
        int[] amount = {12, 4, 2, 5, 10};

        int[] answer = sol.solution(enroll, referral, seller, amount);

       /* if(answer.length!=0) {
            for (int i = 0; i < answer.length; i++) {
                System.out.println("====" + answer[i]);
            }
        }else{
            System.out.println("Fail============");
        }*/


    }


}