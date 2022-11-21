package org.hm.lv1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class PoketSol {
    public int solution(int[] nums) {
        int answer = 0;
        //중복제거한 배열 수
        int distinctArr = 0;
        //총 포켓몬 수 /2
        int divisionTwo = 0;
        // 총포켓몬 수 / 2
        // 중복값 제거한 배열의 수
        // 둘 중 최솟값 리턴
        //HashSet과 LinkedHashSet 차이점은?
        //=> HashSet은 정렬을 안해주고 LinkedHashSet은 정렬 가능 그러므로 여기서는 HashSet 써도 가능!
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));

        Integer[] convertArr = linkedHashSet.toArray(new Integer[] {});

        distinctArr = convertArr.length;
        divisionTwo = nums.length/2;

        if(distinctArr > divisionTwo){
            answer = divisionTwo;
        }else{
            answer = distinctArr;
        }

        return answer;
    }
}
