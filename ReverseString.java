//Program to Reverse a String
//using for loop
package multiples;

public class ReverseString {
    //Main method
    public static void main(String[] args) {

        //Declaring and Initializing Variables Name and rev
        String name = "Happy";
        String rev = "";
       //executes until the condition becomes false;it initiates from last
        for (int i = name.length()-1; i>=0 ; i--) {
            //extracts each character and stores in rev
            rev = rev + name.charAt(i);
        }
        //prints the string
        System.out.println("Reversed string: " +rev);

    }
}