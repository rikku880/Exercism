import java.util.*;
class NucleotideCounter
{
    Map<Character,Integer> dnaMap=new HashMap<>();
    String dnaStrad;
    NucleotideCounter(String dnaStrad)
    {
        this.dnaStrad=dnaStrad;
        if(!dnaStrad.replaceAll("[ACGT]","").equals(""))
            throw new IllegalArgumentException();
        dnaMap.put('A',0);
        dnaMap.put('C',0);
        dnaMap.put('G',0);
        dnaMap.put('T',0);
    }
    Map<Character,Integer> nucleotideCounts(){
        for(int i=0;i<dnaStrad.length();i++)
        {
            char ch=dnaStrad.charAt(i);
            dnaMap.put(ch,dnaMap.get(ch)+1);
        }
        return dnaMap;
    }
}