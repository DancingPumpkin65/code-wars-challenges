class Kata {
    public static String getMiddle(String word) {
        int len = word.length();
        int mid = len / 2;
        return (len % 2 == 0) 
            ? word.substring(mid - 1, mid + 1)  // Return middle 2 characters for even length :/
            : word.substring(mid, mid + 1);     // Return middle character for odd length -_-
    }
}