public class DigPow {
	
	public static long digPow(int n, int p) {
		// Convert the integer to a string to access each digit :0
		String str = String.valueOf(n);
		long sum = 0;
		
		// Loop through each digit, raise it to the power of p, and add to the sum -_-
		for (int i = 0; i < str.length(); i++) {
			// Get the digit and raise it to the power of (p + i) *_*
			int digit = str.charAt(i) - '0';
			sum += Math.pow(digit, p + i);
		}
		
		// Check if sum is divisible by n +-+
		if (sum % n == 0) {
			return sum / n;
		}
		
		return -1;
	}

}