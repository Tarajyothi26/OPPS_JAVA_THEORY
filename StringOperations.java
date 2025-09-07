import java.util.Scanner;

public class StringOperationsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        System.out.println("\n--- String Operations ---");

        // 1. Comparison of 2 strings
        if (str1.equals(str2)) {
            System.out.println("1. Strings are equal.");
        } else {
            System.out.println("1. Strings are NOT equal.");
        }

        // 2. Concatenation
        String concat = str1 + " " + str2;
        System.out.println("2. Concatenated string: " + concat);

        // 3. Length of string
        System.out.println("3. Length of first string: " + str1.length());
        System.out.println("   Length of second string: " + str2.length());

        // 4. Indexing (1D and 2D simulation)
        // 1D: Accessing single character
        if (str1.length() > 2) {
            System.out.println("4. 1D Indexing: char at index 2 in str1 = " + str1.charAt(2));
        }
        // 2D: Simulating a 2D string array
        String[][] str2D = { { "Java", "Python" }, { "C++", "JavaScript" } };
        System.out.println("   2D Indexing: str2D[1][0] = " + str2D[1][0]);

        // 5. Slicing (substring)
        if (str2.length() >= 3) {
            System.out.println("5. Slice of str2 (0 to 3): " + str2.substring(0, 3));
        }

        // 6. Reversing string
        String reversed = new StringBuilder(str1).reverse().toString();
        System.out.println("6. Reversed str1: " + reversed);

        // 7. Replacing characters
        String replaced = str1.replace('a', '@');
        System.out.println("7. Replacing 'a' with '@' in str1: " + replaced);

        sc.close();
    }
}

