class LongestFinder {
    static String findLongestIn(String [] wordsList) {
        String longest = "";

        for (String word : wordsList) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }
    public static void main(String [] args) {
        String[] words = {"possible", "first", "null", "avoidance", "mineral", "pretty", "tree", "rather", "innocuous"};

        System.out.println(findLongestIn(words));
    }
}