// Counting characters in an array

class CharacterCounter {
    public static void main(String[] args) {
        String[] conjugation = {"hide", "hindered", "hiding", "hidden", "hindering", "hid", "hides", "hinder"};

        int tabLength = conjugation.length;
        int numberOfCharacters = 0;

        for (int i = 0; i < tabLength; i++) {

            String word = conjugation[i];
            numberOfCharacters += word.length();
        }
        System.out.println("There are " + numberOfCharacters + " characters in the list");
    }
}