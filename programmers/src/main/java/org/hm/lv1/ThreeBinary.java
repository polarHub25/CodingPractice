package org.hm.lv1;

import java.util.ArrayList;

//효율성 테스트에서 다 런타임 에러.. ㅠㅠ 왜지ㅣ

public class ThreeBinary {
    public long solution(int N , int K){
        long answer = 0;

        ArrayList<Integer> threeArr = new ArrayList<>();
        String[] binaryInput = new String[N];


        //N:n자리 이진수
        //K: 1의 갯수
        //1이 K개 포함된 N자리 이진수 중 3의 배수 구하기
        // 0 , 1
        //예시 4,2 result4


        //n자리수를 10진법으로 바꾼 후 3의 배수 뽑기
        //1111 => 4
        for(int i = 0; i < N; i++){
            binaryInput[i] = "1";
        }
        int lastNum = Integer.parseInt(String.join("",binaryInput), 2);
        //3의 배수 뽑아내기
        for(int j = 1; j <= lastNum; j++ ){
            if(j%3==0){
                threeArr.add(j++);
            }
        }
        //3의 배수로 뽑힌 수를 2진법으로 변환 , 각 배열에 2진수넣기
        //1의 갯수가 k개만 포함하는 이진수의 갯수
        //배열의 각 자리에 있는 10진수를 2진법으로 바꾸면서 1이 나올때 카운트 함 => 이 카운트가 k가 되면
        //return asnwer카운트 1 증가

        for(int z = 0 ; z< threeArr.size(); z++){
            int oneCnt = 0;
            //10진수 => 2진수 변환
            String binaryString = Integer.toBinaryString(threeArr.get(z));
            //2진수내에서 1의 갯수 카운트
           // oneCnt = binaryString.length() - binaryString.replace("0", "").length();

            for(int r = 0; r < binaryString.length(); r++){
                if(binaryString.charAt(r) == '1'){
                    oneCnt++;
                }
            }

            if(oneCnt == K){
                answer++;
            }

        }


        return answer;
    }
}
