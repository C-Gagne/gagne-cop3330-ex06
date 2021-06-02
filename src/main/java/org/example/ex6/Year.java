package org.example.ex6;

import java.util.Calendar;

public class Year {
    public static Integer calculateYear()
    {
        Integer year = Calendar.getInstance().get(Calendar.YEAR);
        return year;
    }
}
