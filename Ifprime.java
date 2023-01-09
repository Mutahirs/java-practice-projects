package even;

import lombok.Getter;

@Getter

public class Ifprime {
    public static void main(String[] args) {
        int n,ct;
        System.out.println(" Prime Numbers from 1 to 100 are : ");
        for ( n = 1; n <= 100; n++)
        {
            ct = 0;
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    ct++;
                    break;
                }
            }
                if (ct == 0 && n != 1) {
                    System.out.print(n + " " );
                }
            }

        }
    }

