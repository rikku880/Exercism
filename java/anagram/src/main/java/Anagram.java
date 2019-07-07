import java.util.*;
class Anagram {
    String anagram, sortedAnagram;

    Anagram(String anagram) {
        this.anagram = anagram.toLowerCase();
        this.sortedAnagram = sortWord(anagram);
    }

    String sortWord(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    boolean isAnagram(String word) {
        return sortWord(word).equals(sortedAnagram) ? true : false;

    }

    List<String> match(List<String> wordList) {
        List<String> anagramWords = new ArrayList();
        int anagramLen = anagram.length();
        for (String word : wordList) {
            String word1=word.toLowerCase();
            if (word.length() == anagramLen && !word1.equals(anagram) && isAnagram(word1)) {
                anagramWords.add(word);
            }
        }
        return anagramWords;
    }
}