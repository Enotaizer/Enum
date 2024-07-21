package com.amisitysu.gmail;

public class Main {
    public static void main(String[] args) {
        Advisor advisor = new DailyAdvisor();

        for (Day day : Day.values()) {
            System.out.print(day + ": ");
            advisor.advise(day);
        }
    }
}
