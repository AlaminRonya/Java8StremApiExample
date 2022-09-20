package com.alamin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {
    private DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    private Date date = new Date();
    public String getDate(){
        return dateFormat.format(date);
    }
}
