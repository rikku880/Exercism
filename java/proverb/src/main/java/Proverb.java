class Proverb {
    String[] words;
    Proverb(String[] words) {
        this.words=words;
    }

    String recite() {
        String outputProverb="";
        if (words.length==0)
            return outputProverb;
        for(int i=0;i<words.length-1;i++)
        {
            outputProverb+="For want of a "+words[i]+" the "+words[i+1]+" was lost.\n";
        }
        outputProverb+="And all for the want of a "+words[0]+".";
        return  outputProverb;
    }

}
