package org.hm.lv1;


public class Main {
    public static void main(String[] args)
    {
        PhoneNumList sol = new PhoneNumList();
        String[] phone_book = {"119", "97674223", "1195524421"};
        boolean answer = sol.solution(phone_book);

        if(answer==false){
            System.out.println("pass");
        }else{
            System.out.println("fail==="+answer);
        }


    }


}