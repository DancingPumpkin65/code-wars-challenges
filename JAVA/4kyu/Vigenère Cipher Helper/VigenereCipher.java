public class VigenereCipher {
    private final String key;
    private final String alphabet;
    private final int alphLen;

    public VigenereCipher(String key, String alphabet) {
        this.key = key;
        this.alphabet = alphabet;
        this.alphLen = alphabet.length();
    }
    
    public String encode(String str) {
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Use the key character corresponding to this position *_*
            char keyChar = key.charAt(i % key.length());
            int pos = alphabet.indexOf(currentChar);
            if (pos != -1) { // currentChar is in the alphabet o_O
                int shift = alphabet.indexOf(keyChar);
                int newPos = (pos + shift) % alphLen;
                encoded.append(alphabet.charAt(newPos));
            } else { // leave character as is -_-
                encoded.append(currentChar);
            }
        }
        return encoded.toString();
    }
    
    public String decode(String str) {
        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // AGAIN use the key character corresponding to this position ~_~
            char keyChar = key.charAt(i % key.length());
            int pos = alphabet.indexOf(currentChar);
            if (pos != -1) {
                int shift = alphabet.indexOf(keyChar);
                int newPos = (pos - shift) % alphLen;
                if (newPos < 0) { // handle negative modulo :0
                    newPos += alphLen;
                }
                decoded.append(alphabet.charAt(newPos));
            } else {
                decoded.append(currentChar);
            }
        }
        return decoded.toString();
    }
}