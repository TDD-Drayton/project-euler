import java.util.Scanner; // imports the Scanner class from the Java standard library, which is used to read user input from the keyboard.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // creates a new instance of the Scanner class, which reads input from the standard input stream (the keyboard).
        System.out.print("Enter a number: ");
        long number = sc.nextLong(); //reads the user's input and stores it in the variable number.
        long largestFactor = 1;

        for (long i = 2; i <= number; i++) { //starts a for loop that iterates over all numbers from 2 to number.
            while (number % i == 0) { //starts a while loop that continues as long as number is divisible by i.
                largestFactor = i; //updates the value of largestFactor to be i.
                number /= i; //divides number by i.
        }

        System.out.println("The largest prime factor of " + number + " is " + largestFactor);
    }
}

/*
public static void main(String[] args) {
    long number = 600851475143L;
    long largestFactor = 1;

    for (long i = 2; i <= number; i++) {
        while (number % i == 0) {
            largestFactor = i;
            number /= i;
        }
    }

    System.out.println("The largest prime factor of " + number + " is " + largestFactor);
}
*/

//The largest prime factor of 600851475143 is 6857
