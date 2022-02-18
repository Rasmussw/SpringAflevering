package com.example.springaflevering.services;

import java.time.LocalDate;

public class DayOfWeekCalculator {

    public static int getDayOfWeek(){
        int q = LocalDate.now().getDayOfMonth();
        int m = LocalDate.now().getMonthValue();
        int j = (LocalDate.now().getYear())/100;
        int k = (LocalDate.now().getYear())%100;

        int h = (q+(13*(m+1)/5)+k+(k/4)+(j/4)-(2*j)) % 7;

        int d = ((h+5)%7)+1;
        return d;
    }
}
