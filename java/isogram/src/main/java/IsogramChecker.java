import java.util.*;
class IsogramChecker {

    boolean isIsogram(String phrase) {
        String newPhrase=phrase.replaceAll("[^a-zA-Z]?\\s?","");
        newPhrase=newPhrase.toLowerCase();
        Set<Character> resultPhrase=new HashSet();
        for(int i=0;i<newPhrase.length();i++)
        {
            resultPhrase.add(newPhrase.charAt(i));
        }
        return resultPhrase.size()==newPhrase.length()?true:false;

    }

}
