package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class addArrayItemTest {

    private Solution solution = new Solution();

    @Test
    void test(){
        //given
        final int[] numbers = {5,0,2,7};
        final int[] expected = {2,5,7,9,12};

        //when
        int[] answer = {};
        answer = solution.solution(numbers);

        //then
        assertEquals(expected,answer);
        //assertThat()//(answer).isEqualTo(expected);

    }
}
