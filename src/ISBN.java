public class ISBN {
    public static String isbn13(String isbn) {
        // Check if the length is 13
        if (isbn.length() == 13) {
            int sum = 0;
            // Loop through the string
            for (int i = 0; i < 13; i++) {
                int num = Character.getNumericValue(isbn.charAt(i));
                // If the index is even, multiply by 1
                if (i % 2 == 0) {
                    sum += num;
                  // If the index is odd, multiply by 3
                } else {
                    sum += num * 3;
                }
            }
            // If the sum is divisible by 10, return "Valid"
            if (sum % 10 == 0) {
                return "Valid";
              // If the sum is not divisible by 10, return "Invalid"
            } else {
                return "Invalid";
            }
          // If the length is not 13, return "Invalid"
        } else if (isbn.length() == 10) {
            int sum = 0;
            // Loop through the string
            for (int i = 0; i < 10; i++) {
                char c = isbn.charAt(i); // Get the character at the index
                // If the character is a digit, convert it to an integer
                if (c == 'X') {
                    sum += 10 * (10 - i);
                  // If the character is not a digit, return "Invalid"
                } else {
                    int num = Character.getNumericValue(c);
                    sum += num * (10 - i);
                }
            }
            // If the sum is divisible by 11, return "Valid"
            if (sum % 11 == 0 && sum != 0) {
                String newIsbn = "978" + isbn.substring(0, 9);
                int checkDigit = 0;
                newIsbn += checkDigit;
                return newIsbn; // Return the new ISBN
            } else {
                return "Invalid";
            }
        } else {
            return "Invalid";
        }
    }
}
