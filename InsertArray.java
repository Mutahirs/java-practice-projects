//program to insert an element n array
package multiples;

import java.util.Arrays;

public class  InsertArray {
    public static void main(String[] args) {

        //Declaring and initializing the array
        int arr[] = {1, 2, 3, 4, 5, 6};
        //Declaring and initializing the variable n
        int n = arr.length;
        // Declaring and initializing the new array
        int newArr[] = new int[n + 1];
        //Declaring and initializing the value
        int value = 8;
        System.out.println(Arrays.toString(arr));
        //executes until the condition becomes false
        for (int i = 0; i < n; i++) {
            //storing values in new array
            newArr[i] = arr[i];
        }

        newArr[n] = value;
        //Prints the new array
        System.out.println(Arrays.toString(newArr));
    }
}

