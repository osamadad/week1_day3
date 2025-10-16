import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //1) Write a program that checks the role of the user
        System.out.println("what type of user are you (admin, superuser, user)");
        String user = input.nextLine();
        if (user.equals("admin")) {
            System.out.println("welcome admin");
        } else if (user.equals("superuser")) {
            System.out.println("welcome superuser");
        } else {
            System.out.println("welcome user");
        }

        //2) Take three numbers from the user and print the greatest number.

        System.out.println("enter 3 numbers to find the greatest");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the greatest");
        } else {
            System.out.println(num3 + " is the greatest");
        }

        //3) Write a Java program that generates an integer between 1 and 7
        //and displays the name of the weekday.

        Random rand = new Random();
        int num = rand.nextInt(7) + 1;
        System.out.println(num);
        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("out of bound number");
                //4) Write a program that takes a numeric score as input and prints
                //the corresponding letter grade using the following grading scale:
        }

        System.out.println("Please enter your grade in numeric score");
        int grade = input.nextInt();

        if (grade >= 90) {
            System.out.println("your grade is A");
        } else if (grade >= 80) {
            System.out.println("your grade is B");
        } else if (grade >= 70) {
            System.out.println("your grade is C");
        } else if (grade >= 60) {
            System.out.println("your grade is D");
        } else {
            System.out.println("your grade is F");

        }


        //5) Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if (age >= 20) {
            System.out.println("you are an adult");
        } else if (age >= 13) {
            System.out.println("you are a teenager");
        } else {
            System.out.println("you are a child");
        }

    }
}