package org.hm.lv1;

public class CountOfString {
    //문자열 내 p와 y의 개수
    /*
    * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
    * s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
    * 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
    * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
    예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
    * */
    public boolean solution(String s) {
        boolean answer = true;

        //p와 y 개수 추출
        int cntP = 0;
        int cntY = 0;
        String arrS[] = new String[s.length()];

        for(int i=0; i < s.length(); i++){
            arrS[i] = s.substring(i, i+1);
            if(arrS[i].equalsIgnoreCase("p")){
                cntP++;
            }
            else if(arrS[i].equalsIgnoreCase("y")){
                cntY++;
            }
        }
        if(cntP==cntY){
            return true;
        }else{
            return false;
        }

    }

}
