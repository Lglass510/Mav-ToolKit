package com.mav.toolkit;
import java.util.Scanner;

public class ConsoleUtils {
    private static final Scanner sc = new Scanner(System.in);

    public static String prompt(String input){
        System.out.print(input + " ");
        return sc.nextLine();
    }
    public static int promptInt(String input){
        while(true){
            try{
                return Integer.parseInt(prompt(input));
            } catch (NumberFormatException e){
                System.out.println("Please enter a valid integer.");
            }
        }
    }
    public static double promptDouble(String input){
        while(true){
            try{
                return Double.parseDouble(prompt(input));
            } catch(NumberFormatException e){
                System.out.println("Please enter a valid number.");
            }
        }
    }

}
