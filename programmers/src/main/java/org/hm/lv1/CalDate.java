package org.hm.lv1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalDate {
    public String solution(int a, int b) {
        String answer = "";
        String[] dayOfWeekName = {"MON","TUE","WED","THU","FRI","SAT","SUN"};

        LocalDate date = LocalDate.of(2016,a,b);

        DayOfWeek dayOfWeek = date.getDayOfWeek();

        int dayOfWeekNum = dayOfWeek.getValue();

        answer = dayOfWeekName[dayOfWeekNum-1];

        return answer;
    }
}
