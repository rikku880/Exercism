
class RomanNumeral
{
    String[] ones,tens,hundreds,thousands;
    int number;
    RomanNumeral(int num)
    {
        this.number=num;
        ones =      new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};
        tens =      new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        hundreds=   new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        thousands=  new String[]{"","M","MM","MMM"};

    }
    String getRomanNumeral()
    {
        int rem;
        String roman="";
        roman+=ones[number%10];
        number=(int)number/10;
        roman=tens[number%10]+roman;
        number=(int)number/10;
        roman=hundreds[number%10]+roman;
        number=(int)number/10;
        roman=thousands[number%10]+roman;
        return roman;
    }
}
