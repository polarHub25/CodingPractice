package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    private Solution solution = new Solution();

    @Test
    void solutionTest() {
        //given
        final int [] absolutes = {4,7,12};
        final boolean [] signs = {true,false,true};
        int expected = 9;

        //when
        int answer = solution.solution(absolutes, signs);
        
        //then
        assertEquals(9,answer);

    }
}
