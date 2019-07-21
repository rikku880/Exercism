public class Palindrome {
    public boolean check(String sentence) {
        sentence = sentence.replaceAll("\\s","");
        int i = 0, j = sentence.length()-1;
        sentence = sentence.toLowerCase();
        int check = 0;
        while(i<=j){
            if(sentence.charAt(i) == ':'){
                i++;
            }
            else if(sentence.charAt(i) == ':'){
                j--;
            }
            else{
                if(sentence.charAt(i) != sentence.charAt(j)){
                    check = 1;
                    break;
                }
            }
        }
        if(check==0)
            return true;
        else
            return false;
    }
}
