package org.improving;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        while (true) {
            int num = getInteger(scanner);

            if (Prime.isPrime(num)) {
                System.out.println(num + " is a prime number.");
            }
        }




    }

    public static boolean isPrime(int num){
        int i = 2;
        boolean flag = false;

        // Test if number divided by 2 is 2 or greater
        while(i <= Math.sqrt(num))
        {
            // Condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                System.out.println(num + " divided by " + i + " is " + num/i);
                break;
            }

            // Test for all numbers between 2 and num/2 (num cannot be divided by a number grater than half itself)
            ++i;
        }
        if (!flag) return true;
        else return false;
    }

    public static int getInteger(Scanner scanner) {
        System.out.print("> ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter an integer.");
            System.out.print("> ");
            scanner.nextLine();
        }
        int num = scanner.nextInt();
        return num;
    }
}
