public class Palindrome {
    public boolean check(String sentence) {
        sentence=sentence.replaceAll("[^a-zA-Z]","").toLowerCase();
        int first=0,last=sentence.length()-1;
        while(first<=last)
        {
            if(sentence.charAt(first)==sentence.charAt(last))
            {
                first++;
                last--;
                continue;
            }
            return false;
        }
        return true;
    }
}
