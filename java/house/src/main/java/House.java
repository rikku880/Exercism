import java.util.*;
class  House{
    String[] fitstLines;
    String[] nextLines;
    House()
    {
        fitstLines=new String[]{"","This is the house that Jack built.","This is the malt ","This is the rat ","This is the cat ","This is the dog ","This is the cow with the crumpled horn ","This is the maiden all forlorn ","This is the man all tattered and torn ","This is the priest all shaven and shorn ","This is the rooster that crowed in the morn ","This is the farmer sowing his corn ","This is the horse and the hound and the horn "};
        nextLines=new String[]{"","that lay in the house that Jack built.","that ate the malt ","that killed the rat ","that worried the cat ","that tossed the dog ","that milked the cow with the crumpled horn ","that kissed the maiden all forlorn ","that married the man all tattered and torn ","that woke the priest all shaven and shorn ","that kept the rooster that crowed in the morn ","that belonged to the farmer sowing his corn "};

    }
    String verse(int verseNumber)
    {
        String verseOutput="";
        for(int i=verseNumber;i>0;i--)
        {
            if(i==verseNumber)
            {
                verseOutput+=fitstLines[verseNumber];
                continue;
            }
            verseOutput+=nextLines[i];
        }
        return verseOutput;
    }
    String verses(int startVerse, int endVerse) {
        String outputVerse="";
        for(int i=startVerse;i<=endVerse;i++)
        {
            outputVerse+=verse(i);
            if(i!=endVerse)
                outputVerse+="\n";
        }
        return  outputVerse;
    }

    String sing() {
        return verses(1,12);

    }
}