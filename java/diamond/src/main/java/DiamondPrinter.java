import java.util.*;

class DiamondPrinter {
    List<Character> charList;
    DiamondPrinter()
    {
        charList=Arrays.asList('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
    }
    List<String> printToList(char a) {
        List<String> outputList=new ArrayList<>();
        int indexOfChar=charList.indexOf(a);
        for(int i=0;i<=indexOfChar;i++)
        {
            String str="";
            for(int j=indexOfChar;j>=0;j--)
                str+= i==j?charList.get(i)+"":" ";
            for(int j=1;j<=indexOfChar;j++)
                str+= i==j?charList.get(i)+"":" ";
            outputList.add(str);
        }
        for(int i=outputList.size()-2;i>=0;i--)
        {
            String s=outputList.get(i);
            outputList.add(s);
        }
        return outputList;

    }

}
