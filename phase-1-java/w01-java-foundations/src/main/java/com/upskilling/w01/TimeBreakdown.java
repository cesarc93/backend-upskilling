package com.upskilling.w01;

public class TimeBreakdown {

    public int[] fromSeconds(int totalSeconds) {
        if (totalSeconds < 0) {
            throw new IllegalArgumentException("Seconds cannot be negative");
        }
        var hours = totalSeconds / 3600;
        var remaining = totalSeconds % 3600;
        var minutes = remaining / 60;
        var seconds = remaining % 60;
        return new int[]{hours, minutes, seconds};
    }
}