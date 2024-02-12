/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

  import java.util.Scanner;

public class Main {
    // Define an enum for days of the week
    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day number (0 for Sunday, 1 for Monday, ..., 6 for Saturday): ");
        int dayNumber = input.nextInt();

        // Check if the entered day number is within valid range
        if (dayNumber >= 0 && dayNumber <= 6) {
            Day day = Day.values()[dayNumber];
            System.out.println("Day: " + day + ", Name: " + getDayName(day));
        } else {
            System.out.println("Invalid day number. Please enter a number between 0 and 6.");
        }
    }

    // Method to get the name of the day
    private static String getDayName(Day day) {
        switch (day) {
            case SUNDAY:
                return "Sunday";
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WEDNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            default:
                return "Invalid day";
        }
    }
}

    
