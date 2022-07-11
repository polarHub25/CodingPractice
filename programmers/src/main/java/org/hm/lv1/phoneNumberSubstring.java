package org.hm.lv1;

public class phoneNumberSubstring {
    public String solution(String phone_number) {
        String answer = "";
        answer = phone_number.substring(0, phone_number.length()-4).replaceAll("[0-9]","*") + phone_number.substring(phone_number.length()-4, phone_number.length());
        return answer;
    }
}
