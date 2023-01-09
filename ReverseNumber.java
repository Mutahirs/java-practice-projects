//write a program to reverse a number
//using while loop
package multiples;

public class ReverseNumber {
    //Main method
    public static void main(String[] args) {
//Declaring and Initializing Variables Name and reverse
        int number = 56789, reverse = 0;
        //executes until the condition becomes false;if number is not equal to zero
        while (number != 0) {
            //stores the remainder of the given number
            int remainder = number % 10;
            //stores the reverse number; after adding reverse and remainder
            reverse = reverse * 10 + remainder;
            //stores the number after dividing by 10
            number = number / 10;
        }
        //prints the reverse number
        System.out.println("reverse number " + reverse);
    }
}



