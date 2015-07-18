package com.ubs.opsit.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vagharshaka on 7/17/2015.
 */
public final class Time {

    private final int hour;

    private final int minute;

    private final int second;

    private Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public static Time parse(String time) {

        final Pattern pattern = Pattern.compile("([01]\\d|2[0-4]):([0-5]\\d):([0-5]\\d)");
        final Matcher matcher = pattern.matcher(time);

        if (matcher.matches()) {
            return new Time(Integer.parseInt(matcher.group(1)),
                    Integer.parseInt(matcher.group(2)),
                    Integer.parseInt(matcher.group(3)));
        } else {
            throw new RuntimeException("Invalid time format");
        }
    }
}
