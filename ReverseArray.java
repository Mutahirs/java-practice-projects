//write a program to reverse an array
//using for loop
package multiples;

public class ReverseArray {
    //Main method
    public static void main(String[] args) {
        //Declaring and initializing the array
        int [] a= {6,7,8,9,10};
        //printing the input array
        System.out.println("Original array: ");
        //executes until the condition becomes false
        for (int i = 0; i < a.length; i++) {
            //printing the input array
            System.out.print(a[i]  );
        }

        System.out.println("Array in reverse order: ");
        //executes until the condition becomes false
        for (int i = a.length-1; i >= 0; i--) {
            //prints the Reverse array
            System.out.print(a[i] + " ");
        }
    }
}
