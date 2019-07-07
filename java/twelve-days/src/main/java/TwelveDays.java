class TwelveDays {
    String[] numbers;
    String[] gifts;
    TwelveDays()
    {
        numbers=new String[] {"first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
        gifts=new String[] {"a Partridge in a Pear Tree.","two Turtle Doves","three French Hens","four Calling Birds","five Gold Rings","six Geese-a-Laying","seven Swans-a-Swimming","eight Maids-a-Milking","nine Ladies Dancing","ten Lords-a-Leaping","eleven Pipers Piping","twelve Drummers Drumming"};
    }
    String verse(int verseNumber) {
        String verseOutput="";
        verseOutput+=String.format("On the %s day of Christmas my true love gave to me: ",numbers[verseNumber-1]);
        if(verseNumber==1)
        {
            verseOutput+=gifts[verseNumber-1];
            return verseOutput+"\n";
        }
        for(int i=verseNumber-1;i>=0;i--)
        {
            verseOutput+= i==0?"and "+gifts[i]:gifts[i]+", ";
        }
        return verseOutput+"\n";
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
