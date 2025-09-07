public class StringOperations {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Programming";

        System.out.println("Length: " + s1.length());
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s2.toLowerCase());
        System.out.println("Concatenation: " + s1 + " " + s2);
        System.out.println("Substring (0-3): " + s2.substring(0, 3));
        System.out.println("Character at index 2: " + s1.charAt(2));
        System.out.println("Equals check: " + s1.equals("Java"));
    }
}
