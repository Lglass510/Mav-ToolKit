package com.mav.toolkit;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

 // Get today's date as a string
    public static String getTodaysDate(){
        return LocalDate.now().toString();//yyyy-MM-dd
    }
 //Format a LocalDate to a custom patter
    public static String formatDate(LocalDate date, String pattern){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}
