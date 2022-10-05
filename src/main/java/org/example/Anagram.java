package org.example;

public class Anagram {

    public static String flipWordInLine(String string) {
        if (string == null) {
            return null;
        }
        if (string.equals("")) {
            return "";
        }

        String[] words = string.split(" ");
        String[] flippedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            flippedWords[i] = flipWord(word);
        }

        return String.join(" ", flippedWords);
    }

    private static String flipWord(String word) {
        char[] flippedWord = new char[word.length()];
        boolean[] indexesLetters = new boolean[word.length()];

        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            if ((symbol >= 'a' && symbol <= 'z') ||
                    (symbol >= 'A' && symbol <= 'Z')) {
                indexesLetters[i] = true;
            }
        }

        int indexLastLetter = word.length() - 1;
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);
            if (indexesLetters[i]) {
                for (int currentIndex = indexLastLetter; currentIndex >= 0; currentIndex--) {
                    if (indexesLetters[currentIndex]) {
                        indexLastLetter = currentIndex;
                        break;
                    }
                }
                flippedWord[indexLastLetter] = symbol;
                indexLastLetter--;

            } else {
                flippedWord[i] = symbol;
            }
        }

        StringBuilder builder = new StringBuilder();
        for (char c : flippedWord) {
            builder.append(c);
        }
        return builder.toString();
    }
}
