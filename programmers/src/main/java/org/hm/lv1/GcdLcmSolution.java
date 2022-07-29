package org.hm.lv1;


public class GcdLcmSolution {
    static int gcdNum = 0;
    static int lcmNum = 0;

    public static int[] solution(int n, int m) {
        int[] answer = {0,0};
        int big = 0;
        int small = 0;

        if(n<m){
            big = m;
            small = n;
        }else{
            big = n;
            small = m;
        }

        if(m == 0 || n == 0){
            return answer;
        }
        if(big%small==0){
            gcdNum = small;
        }else{
            gcdNum = gcdMake(big, small);
        }
        lcmNum = (big*small)/gcdNum;
        answer[0] = gcdNum;
        answer[1] = lcmNum;

        return answer;
    }
    public static int gcdMake(int big, int small){
        int r0 = 0;
        int r1 = 0;
        //int gcdResult = 0;
        r0 = big%small;

        while(true){

            if(r0!=0){
                r1=small%r0;
                if(r1==0){
                    gcdNum = r0;
                    break;
                }
                else {
                    small = r0;
                    r0=r1;
                }
            }else {
                gcdNum = r0;
                break;
            }
        }
        return gcdNum;
    }
}
