//program to find sum of 10 natural numbers
// using the for loop
package multiples;

public class SumNumbers {
    //main method
    public static void main(String[] args) {
        //declaring variables number and sum and initializing them
        int number=10;
        int sum=0;
        //executes until the condition becomes false
        for (int i = 0; i < number; i++) {
            //adding the value of i to the sum variable
            sum = sum+i;
        }
        // prints the sum
        System.out.println("Sum of 10 natural numbers: " +sum);
    }

}
