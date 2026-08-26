package 07-Optimizing Code in Java.01_Fundamentals of Software Performance;

public class Main {
    public static void main(String[] args) {
        TextAnalyzer analyzer = new TextAnalyzer();
        
        List<String> words = Arrays.asList(
            "Java", "is", "a", "programming", "language", 
            "Java", "is", "widely", "used", "for", "building", "applications",
            "Many", "programmers", "use", "Java", "for", "web", "development", "and", "Android", "apps"
        );
        
        Map<String, Integer> wordFrequency = analyzer.buildWordFrequencyMap(words);
        
        System.out.println("Word frequency analysis:");
        for (Map.Entry entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " occurrences");
        }
    }
}

class TextAnalyzer {
    public Map<String, Integer> buildWordFrequencyMap(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<String, Integer>();
        
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            
            word = word.toLowerCase();
            
            if (frequencyMap.containsKey(word)) {
                // Retrieve the frequency of the word
                int currentCount = frequencyMap.get(word);
                // Increment the frequency of the word
                frequencyMap.put(word, currentCount + 1);
            } else {
                // If the frequency map does not have the word, add it.
                frequencyMap.put(word, 1);
            }
        }
        
        return frequencyMap;
    }
}
