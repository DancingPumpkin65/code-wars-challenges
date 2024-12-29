class Diamond {
    public static String print(int n) {
        // Check for invalid input: even number or negative size O_o
        if (n <= 0 || n % 2 == 0) {
            return null;
        }
        
        StringBuilder diamond = new StringBuilder();
        int mid = n / 2;
        
        // Build the upper half of the diamond, including the middle row i_i
        for (int i = 0; i <= mid; i++) {
            int spaces = mid - i;
            int stars = 2 * i + 1;
            diamond.append(" ".repeat(spaces))
                   .append("*".repeat(stars))
                   .append("\n");
        }
        
        // Build the lower half of the diamond :p
        for (int i = mid - 1; i >= 0; i--) {
            int spaces = mid - i;
            int stars = 2 * i + 1; 
            diamond.append(" ".repeat(spaces))
                   .append("*".repeat(stars))
                   .append("\n");
        }
        
        return diamond.toString();
    }
}