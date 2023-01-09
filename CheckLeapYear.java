//program to check leap year
package multiples;
@getter

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args){
        //Declaring the variable
        int year;
        System.out.println("Enter an Year :: ");
        //scanner class to get input from user
        // sc is an object made of Scanner Class
        Scanner sc = new Scanner(System.in);
        //initializing the variable
        year = sc.nextInt();
        // 1st condition check- It is leap year or not
        // 2nd condition check- It is century year
        // 3rd condition check- It is century leap year
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            // Both conditions true-Print leap year
            System.out.println("Specified year is a leap year");
        else
            // Any condition fails-Print Non-leap year
            System.out.println("Specified year is not a leap year");
    }
}
