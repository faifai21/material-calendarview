package com.prolificinteractive.materialcalendarview;

import android.support.annotation.IntDef;

/**
 * Created by faisal-alqadi on 2/22/15.
 */
public class Constants {
    @IntDef(value = {NONE, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}, flag = true)
    public @interface DisabledDays {}

    @IntDef(value = {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY})
    public @interface WeekDays {}

    public static final int NONE = 0x00;
    public static final int SUNDAY = 0x01;
    public static final int MONDAY = 0x02;
    public static final int TUESDAY = 0x04;
    public static final int WEDNESDAY = 0x08;
    public static final int THURSDAY = 0x10;
    public static final int FRIDAY = 0x20;
    public static final int SATURDAY = 0x40;

    @IntDef({CHARACTER, ABBREVIATED, FULL})
    public @interface WeekDayStyle{}
    // First letter of week day
    public static final int CHARACTER = 0;
    // Name of day abbreviated to three letters (e.g. Sat, Sun)
    public static final int ABBREVIATED = 1;
    // Full name of day
    public static final int FULL = 2;
}
