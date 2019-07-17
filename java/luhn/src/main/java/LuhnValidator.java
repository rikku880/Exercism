class LuhnValidator {

    boolean isValid(String candidate) {
        int sum=0;
        boolean odd=true;
        candidate = candidate.replaceAll(" ","");
        if (candidate.length() <= 1) return false;
        for(int i=candidate.length()-1;i>=0;i--)
        {
            if((candidate.charAt(i)+"").matches("[\\d]"))
            {
                if(odd)
                {
                    sum+=Integer.parseInt(candidate.charAt(i)+"");
                    odd=false;
                }
                else
                {
                    int n=Integer.parseInt(candidate.charAt(i)+"")*2;
                    n=n>9?n-9:n;
                    sum+=n;
                    odd=true;
                }
            }
            else{
                return false;
            }

        }
        return sum%10==0;
    }
}

