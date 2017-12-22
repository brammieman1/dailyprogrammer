package easy;

import java.util.Scanner;

public class Easy_321_TalkingClock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Time:");
        String input = scanner.nextLine();

        String[] split = input.split(":");

        int hour = Integer.parseInt(split[0]);
        int minutes = Integer.parseInt(split[1]);



        String[] list = {"Oh","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve"};



    }


}
