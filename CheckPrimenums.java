//Program to print Prime Numbers from 1 to 100
//using for loop and If statements

package multiples;

public class CheckPrimenums {
    //Main method
    public static void main(String[] args)
    {
        //Declaring the variables
        int i, number, count;
        //printing the statement
        System.out.println(" Prime Numbers from 1 to 100 are : ");
        ////executes until the condition becomes false
        for(number = 1; number <= 100; number++)
        {
            //initiating the variable count
            count = 0;
            //executes until the condition becomes false
            for (i = 2; i <= number/2; i++)
            {
                //equating reminder with zero
                if(number % i == 0)
                {
                   //incrementing variable count
                    count++;
                    //breaking the loop
                    break;
                }
            }
            // Equating count and number
            if(count == 0 && number != 1 )
            {
                //printing the prime number
                System.out.print(number + " ");
            }
        }
    }

    }


