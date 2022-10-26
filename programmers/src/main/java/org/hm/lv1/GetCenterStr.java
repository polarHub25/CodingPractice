package org.hm.lv1;

/*
* 가운데 글자 가져오기
* 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
* 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"
* */

public class GetCenterStr {
    public String solution(String s) {
        String answer = "";
        //String 문자열 길이 구하기
        int len = s.length();
        int mid = len/2;

        if(len%2==0){
            //substring을 시작위치 , 끝위치 전까지 인데 자꾸 끝위치라고 생각함..
            answer = s.substring(mid-1, mid+1);

        }else{
            answer = s.substring(mid, mid+1);
        }

        return answer;
    }
}
