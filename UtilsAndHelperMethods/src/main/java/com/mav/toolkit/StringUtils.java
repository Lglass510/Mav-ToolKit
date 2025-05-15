package com.mav.toolkit;

public class StringUtils {

 //Capitalize the first letter of a string
 public static String titleCase(String text){
     if (text == null || text.isEmpty()) return text;
     return Character.toUpperCase(text.charAt(0)) + text.substring(1).toLowerCase();
 }

 //Remove all whitespace from a string
    public static String removeWhitespace(String text){
     if (text == null) return null;
     return text.replaceAll("\\s+","");
    }
 // Check if string is null or empty
    public static boolean isNullOrEmpty(String text) {
     return text == null || text.isEmpty();
    }


}
