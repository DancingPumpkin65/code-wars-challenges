import java.util.*;
import java.util.regex.*;

public class TopWords {
    
    public static List<String> top3(String s) {
        if (s == null || s.isEmpty()) return Collections.emptyList();

        s = s.toLowerCase();

        // Regex: Match words containing letters, allowing apostrophes anywhere inside :/
        Pattern pattern = Pattern.compile("[a-z']*[a-z]+[a-z']*");
        Matcher matcher = pattern.matcher(s);
      
        // Count word occurrences :p
        Map<String, Integer> frequencyMap = new HashMap<>();
        while (matcher.find()) {
            String word = matcher.group();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Sort words by frequency and return the top 3 -_-
        return frequencyMap.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .map(Map.Entry::getKey)
                .toList();
    }
}