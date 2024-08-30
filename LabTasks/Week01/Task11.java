/* Write a Java program that reads an integer value S from the user and then calculates the value of L based on the following conditions:
● If S >= 100, then calculate L using the formula: L = 12000 / ( 4 + ( ( S × S ) / 14900 ) )
● If S < 100, then calculate L using the formula: L = 3000 - 125 × S × S
Hint(1): We may use the Math class to use the Math.pow() function for calculating squares.
Hint(2): The value of S (user input) will be an integer.

Sample Input:  
120  
Sample Output:  
2416.2162162162163  
Explanation: Since S (user input) given here is 120 >= 100, so L = 12000 / (4 + (120 * 120)/14900) = 2416.2162162162163  

Sample Input:  
3  
Sample Output:  
1875  
Explanation: Since S (user input) given here is 3 < 100, so L = 3000 - 125 * 3 * 3 = 1875 
 */

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        int S;
        double L;

        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();

        if (S >= 100) {
            L = 12000 / (4 + (Math.pow(S, 2) / 14900));
        } else {
            L = 3000 - 125 * Math.pow(S, 2);
        }
        
        System.out.println(L);

        sc.close();
    }
}
