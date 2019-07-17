import java.util.*;
class Series
{
    char[] charArray;
    Series(String inputNumber)
    {
        charArray=inputNumber.toCharArray();
    }
    List<String> slices(int numberOfDigits)
    {
        List<String> outputList=new ArrayList<>();
        if(numberOfDigits<=0)
            throw new IllegalArgumentException("Slice size is too small.");
        if(numberOfDigits>charArray.length)
            throw new IllegalArgumentException("Slice size is too big.");

        for(int i=0;i<=charArray.length-numberOfDigits;i++)
        {
            String str="";
            for(int j=0;j<numberOfDigits;j++)
            {
                str+=charArray[i+j];
            }
            outputList.add(str);
        }
        return outputList;

    }
}