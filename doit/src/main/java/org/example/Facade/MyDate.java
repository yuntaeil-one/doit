package org.example.Facade;

import org.example.exception.NoeDateFormatException;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public void setYear(int year) throws NoeDateFormatException {
        if(year < 0) {
            throw new NoeDateFormatException("invalid year format");
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if(0 > month || month > 13) {
            throw new NoeDateFormatException("invalid month format");
        }
        this.month = month;
    }

    public void setDay(int day) {
        if(0 > month || month > 31) {
            throw new NoeDateFormatException("invalid day format");
        }
        this.day = day;
    }
}
