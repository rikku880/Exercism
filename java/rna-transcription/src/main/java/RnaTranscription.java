import java.util.*;

class RnaTranscription {
    HashMap<Character,Character> charMap=new HashMap<>();
    RnaTranscription()
    {
        charMap.put('G','C');
        charMap.put('C','G');
        charMap.put('T','A');
        charMap.put('A','U');
    }
    String transcribe(String dnaStrand) {
        String rnaStrand="";
        for(int i=0;i<dnaStrand.length();i++)
        {
            rnaStrand+=charMap.get(dnaStrand.charAt(i));
        }
        return rnaStrand;

    }

}
