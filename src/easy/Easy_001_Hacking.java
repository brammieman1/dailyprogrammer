package easy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Easy_001_Hacking {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("What is your reddit username?");
        String redditname = scanner.nextLine();
        scanner.close();
        System.out.println("Your name is " + name + " , you are " + age + "years old " + " and your username is " + redditname);
        logging(name,age,redditname);

    }

    private static void logging(String name, int age, String reddit){
        PrintStream output = null;
        try {
            output = new PrintStream(new File("data.txt"));
            output.printf("%s\n%d\n%s", name, age, reddit);
            output.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
