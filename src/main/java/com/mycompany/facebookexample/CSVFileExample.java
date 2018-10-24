/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facebookexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author harshitha Oct 30, 2017-Nov 5, 2017
 */
public class CSVFileExample {

    public static void main(String[] args) throws ParseException {
        String input = "2018-01-01";
        String format = "yyyy-MM-dd";

        SimpleDateFormat df = new SimpleDateFormat(format);
        Date date = df.parse(input);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        int year = cal.get(Calendar.YEAR);
        System.out.println("the week_no is..." + week);
        System.out.println("the year is..." + year);

        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse("2018-05-06");
        cal.setTime(date1);
        cal.get(Calendar.WEEK_OF_YEAR);
        System.out.println("the new week_no is..." + cal.get(Calendar.WEEK_OF_YEAR));
    }

    public static String getMonthName(int monthNo) {
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        return monthNames[monthNo];
    }
}
