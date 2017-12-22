package easy;

import java.util.Scanner;

public class Easy_338_WhatDayWasItAgain {
    //Using Zeller's algorithm


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a date (YYYY MM DD)");
        String date = scanner.nextLine();
        System.out.println("This day in history was a " + getDay(date));
    }

    public static String getDay(String date){
        String[] splitDate = date.split(" ");
        int year;
        int month;
        int dayOfMonth = Integer.parseInt(splitDate[2]);

        if(splitDate[1].equals("1") || splitDate[1].equals("2")){
            year = Integer.parseInt(splitDate[0])-1;
            month = Integer.parseInt(splitDate[1]) + 12;
        } else {
            year = Integer.parseInt(splitDate[0]);
            month = Integer.parseInt(splitDate[1]);
        }

        int day = (int)(dayOfMonth+Math.floor(13*(month+1)/5)+ year + Math.floor(year/4) - Math.floor(year/100) + Math.floor(year/400))%7;

        return dayToString(day);
    }

    public static String dayToString(int day){

        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        return daysOfWeek[day];
    }

}
