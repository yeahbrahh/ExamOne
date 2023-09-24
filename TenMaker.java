//Write a program that contains a method called makes10() that takes
//two integer
// arguments and returns true if their sum is 10.
// The method should be called from main(),
// and main() should print a message saying if the two numbers either add up to 10 or not.
// Call the class TenMaker. 25 pts


import java.util.Scanner;
public class TenMaker {

    static boolean makes10(int numOne, int numTwo) {
        return numOne + numTwo == 10;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int numOne = sc.nextInt();

        System.out.println("Enter second number: ");
        int numTwo = sc.nextInt();

        if(makes10(numOne,numTwo)) {
            System.out.println("Those numbers make 10!");
        } else {
            System.out.println("Those numbers don't make 10!");
        }

        }

    }