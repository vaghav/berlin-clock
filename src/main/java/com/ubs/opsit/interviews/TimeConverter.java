package com.ubs.opsit.interviews;

import com.ubs.opsit.dto.Time;

public interface TimeConverter {

    /**
     * General function for converting the time
     * @param time
     * @return converted time
     */
    public String convertTime(String time);

    /**
     * Calculate top hour
     * @param time
     * @return converted top hour
     */
    public String calculateTopHour(Time time);

    /**
     * Calculate bottom hour
     * @param time
     * @return converted bottom hour
     */
    public String calculateBottomHour(Time time);

    /**
     * Calculate top minutes
     * @param time
     * @return converted minutes
     */
    public String calculateTopMinute(Time time);

    /**
     * Calculate bottom minutes
     *
     * @param time
     * @return converted minutes
     */
    public String calculateBottomMinute(Time time);

    /**
     * Calculate seconds
     *
     * @param time
     * @return converted seconds
     */
    public String calculateSecond(Time time);

}
