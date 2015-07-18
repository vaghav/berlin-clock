package com.ubs.opsit.interviews;

import com.ubs.opsit.dto.Time;

/**
 * Created by vagha_000 on 16-Jul-15.
 */
public class TimeConverterImpl implements TimeConverter {

    @Override
    public String convertTime(String time) {
        final Time parsedTime = Time.parse(time);
        return calculateSecond(parsedTime) + "\r\n" + calculateTopHour(parsedTime) + "\r\n"
                + calculateBottomHour(parsedTime) + "\r\n" + calculateTopMinute(parsedTime)
                + "\r\n" + calculateBottomMinute(parsedTime);
    }


    @Override
    public String calculateSecond(Time tme) {
        return tme.getSecond() % 2 == 0 ? "Y" : "O";
    }


    @Override
    public String calculateTopHour(Time time) {
       return calculateHour(time.getHour() / 5);
    }


    @Override
    public String calculateBottomHour(Time time) {
        return calculateHour(time.getHour() % 5);
    }


    private String calculateHour(int hours) {
        StringBuilder topHour = new StringBuilder("OOOO");

        for (int i = 0; i < hours; i++) {
            topHour.setCharAt(i, 'R');
        }
        return topHour.toString();
    }

    @Override
    public String calculateTopMinute(Time time) {
        StringBuilder topMinutes = new StringBuilder("OOOOOOOOOOO");

        for (int i = 0; i < time.getMinute() / 5; i++) {

            if (i == 2 || i == 5 || i == 8) {
                topMinutes.setCharAt(i, 'R');
            } else {
                topMinutes.setCharAt(i, 'Y');
            }
        }
        return topMinutes.toString();
    }


    @Override
    public String calculateBottomMinute(Time time) {
        StringBuilder bottomMinutes = new StringBuilder("OOOO");

        for (int i = 0; i <  time.getMinute() % 5; i++) {
            bottomMinutes.setCharAt(i, 'Y');
        }
        return bottomMinutes.toString();
    }
}
