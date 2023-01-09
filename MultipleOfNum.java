//Program to find Multiples of 6
package multiples;

public class MultipleOfNum {
    //Main method

    public static void main(String[] args) {
        //executes until the condition becomes false
        for (int i = 6; i < 100; i++) {
            //equating remainder of number to zero
            if (i%6 == 0) {
             //Printing multiples of 6
                System.out.println(i);
            }

        }
    }
}
