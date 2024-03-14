package opps;

import java.util.Scanner;

public class string_pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char ch;
        int i, j, count = 0, n, k;
        System.out.println("Enter string: ");
        str = sc.next();
        n = str.length();
        String str2 = "";
        count = 0;
        for (i = n - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }
       
        if (str.equals(str2)) {
            count++;
            System.out.println(str + " is a palindrome string");
            System.out.println("Palindrome pairs: ");
           
            for (i = 0; i < n; i++) {
                ch = str.charAt(i);
                for (j = i + 1; j < n; j++) { // Changed i++ to i+1
                    if (str.charAt(j) == ch) {
                        count++;
                        for (k = i; k <= j; k++) { // Changed k < j to k <= j
                            System.out.print(str.charAt(k)); // Print the palindromic substring
                        }
                        System.out.print(", "); // Separate substrings with a comma
                    }
                }
            }
            System.out.println(); // Print a newline after the substrings
        } else {
            System.out.println(str+ " string is not palindrome");
        }
        if (count > 0) {
            System.out.println("Total palindrome : " + count);
        }
    }
}
