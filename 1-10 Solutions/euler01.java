public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) { // loop that will iterate over the numbers from 0 to 999 (inclusive). The variable "i" is declared and initialized to 0, and it will be incremented by 1 with each iteration of the loop.
            if (i % 3 == 0 || i % 5 == 0) { //checks if the current value of "i" is divisible by 3 or 5. If it is, the code inside the if block will be executed.
                sum += i; //adds value of i to sum
            }
        }
        System.out.println("The sum of all multiples of 3 or 5 below 1000 is: " + sum);
    }
}

//The sum of all multiples of 3 or 5 below 1000 is: 233168
