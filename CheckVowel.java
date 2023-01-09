//program to check vowels in the given input
package multiples;

public class CheckVowel {
    public static void main(String args[]) {
        //creating object and storing the input in str by new keyword
        String str = new String("My name is Bear");
        //executes until the condition becomes false
        for(int i=0; i<str.length(); i++) {
            //checking vowels in the given string
            if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u')
                //prints the vowels and its index number in a given string
                System.out.println("Given string contains " +
                        str.charAt(i)+" at the index " + i);
        }
    }
}
