import java.util.*;
class LargestSeriesProductCalculator {
    int[] strToInt;
    LargestSeriesProductCalculator(String inputNumber) {
        strToInt=new int[inputNumber.length()];
        for(int i=0;i<inputNumber.length();i++)
        {
            try{
                strToInt[i]=Integer.parseInt(inputNumber.charAt(i)+"");
            }
            catch (Exception e)
            {
                throw new IllegalArgumentException("String to search may only contain digits.");
            }
        }
    }


    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(numberOfDigits<0)
            throw new IllegalArgumentException("Series length must be non-negative.");
        if(numberOfDigits>strToInt.length)
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if(numberOfDigits==0)
            return 1;
        int max=0;
        for(int i=0;i<=strToInt.length-numberOfDigits;i++)
        {
            int mult=1;
            for(int j=0;j<numberOfDigits;j++)
            {
                mult*=strToInt[i+j];
            }
            if(max<mult)
                max=mult;
        }
        return max;

    }
}
