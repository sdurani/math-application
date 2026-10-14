import java.util.Scanner;
import java.util.*;

public class MathApp {

    public static void main(String[] args) {

        // QUESTION 1:
        double bobSalary = 83000;
        double garySalary = 52000;
        double highestSalary;

        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary + ".");

        // QUESTION 2:
        double carPrice = 23500;
        double truckPrice = 49000;
        double cheapestPrice;

        cheapestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest vehicle costs " + cheapestPrice + ".");

        // QUESTION 3:
        double radiusOfCircle = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radiusOfCircle, 2);
        System.out.println("The area of the circle is: " + areaOfCircle);

        // QUESTION 4:
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root is: " + squareRoot);

        // QUESTION 5:
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;
        double minusX = x2 - x1;
        double minusY = y2 - y1;

        double distance = Math.sqrt(Math.pow(minusX, 2) + Math.pow(minusY, 2));
        System.out.println("The distance is: " + distance);

        // QUESTION 6:
        double value = -3.8;
        double absoluteValue = Math.abs(value);
        System.out.println("The absolute value is: " + absoluteValue);

        // QUESTION 7:
        double randomNumber = Math.random();
        System.out.println("The random number is: " + randomNumber);

        // QUESTION 8:
        int days = 24;
        int hoursPerDay = 24;
        int minsPerHour = 60;

        int totalMins = days * hoursPerDay * minsPerHour;
        System.out.println("Minutes in 24 days: " + totalMins);

        // BONUS:
        int secsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        long totalMilliseconds = (long) totalMins * secsPerMinute * millisecondsPerSecond;
        System.out.println("Milliseconds in 24 days: " + totalMilliseconds);
        System.out.println();

//        Scanner read = new Scanner(System.in);
//        System.out.println("What is your name? ");
//        String name = read.nextLine();
//        System.out.println("I read the name " + name);
//        int age = read.nextInt();


        Scanner read = new Scanner(System.in);

        System.out.println("How many hours a day do you watch movies? ");
        double hrsWatch = read.nextDouble();
        read.nextLine(); // switching from number to Line so eat the leftover ENTER
        System.out.println("What is your favorite movie? ");
        String favMovie = read.nextLine();
        read.close();


    }

}
