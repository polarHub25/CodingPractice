package org.hm.lv1;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String answerFlag = "";

        String nam1 = "";
        String nam2 = "";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String[] namArr1 = new String[n];
        String[] namArr2 = new String[n];

        //10진법을 2진법으로 변환하고, 2개를 더하라는..?
        //1이면 # 공백이면 공백
        for(int z = 0; z < n; z++){
            nam1 = "";
            nam2 = "";
            sb1.setLength(0);
            sb2.setLength(0);
            int flag1 = arr1[z];
            int flag2 = arr2[z];
            for(int i = n-1; i >= 0; i--){
                nam1 += Integer.toString(flag1%2);
                flag1 = flag1/2;
                nam2 += Integer.toString(flag2%2);
                flag2 = flag2/2;
            }
            namArr1[z] = sb1.append(nam1).reverse().toString();
            namArr2[z] = sb2.append(nam2).reverse().toString();
        }

        for(int a = 0; a < n; a++){
            answerFlag = "";
            for(int b = 0; b < n; b++){
                if(namArr1[a].charAt(b)=='0' && namArr2[a].charAt(b)=='0'){
                    answerFlag += " ";
                }else{
                    answerFlag+= "#";
                }
            }
            answer[a] = answerFlag;
        }

        return answer;
    }
}
