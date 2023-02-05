public class Main {
    public static void main(String[] args) {
        int prev1 = 1, prev2 = 2, next = 0, sum = 2;
        //This line declares and initializes four variables: "prev1" and "prev2"
        //are used to keep track of the two previous Fibonacci numbers, "next" is used
        //to store the next Fibonacci number, and "sum" is used to keep track of the
        //sum of the even-valued terms.
        while (next < 4000000) { //loop that will continue to execute until the value of "next" is greater than or equal to 4 million.
            next = prev1 + prev2; //calculates the next Fibonacci number
            if (next % 2 == 0) { //checks if the value of "next" is an even number. if true the code block will execute
                sum += next; // will add the "next" number if it is even
            }
            prev1 = prev2;
            prev2 = next;
            //update the values of "prev1" and "prev2" to be the values of "prev2" and "next" respectively, so that they are ready for the next iteration of the loop.
        }
        System.out.println("The sum of the even-valued terms in the Fibonacci sequence whose values do not exceed four million is: " + sum);
    }
}

//The sum of the even-valued terms in the Fibonacci sequence whose values do not exceed four million is: 4613732
