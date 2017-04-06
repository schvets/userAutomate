package com.selenium.test.tools;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Aleksandr on 06.04.2017.
 */
public class DayQualifier {
    public int getWeekDay( Date date )
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        --day;
        if ( day == 0 )
            day = 7;
        return day;
    }

    public String getFormatedDate(Date date)
    {
        System.out.println(date);
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(df.format(new Date()));
        return df.format(new Date());
    }

}
