package com.amisitysu.gmail;

public class DailyAdvisor implements Advisor {
    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("Be productive at work!");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Enjoy your weekend! How about visiting a park or a museum?");
                break;
        }
    }
}
