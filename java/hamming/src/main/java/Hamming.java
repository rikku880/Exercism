import java.util.*;
class Hamming {
    String leftStrand,rightStrand;
    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand=leftStrand;
        this.rightStrand=rightStrand;
        if(rightStrand.isEmpty() && !leftStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");
        if(leftStrand.isEmpty() && !rightStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");

        if(leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

    }

    int getHammingDistance() {
        if(leftStrand.equals("") && rightStrand.equals(""))
            return 0;
        int hamming=0;
        for(int i=0;i<leftStrand.length();i++)
        {
            if(! (leftStrand.charAt(i)+"").equals(rightStrand.charAt(i)+""))
                hamming++;

        }
        return hamming;

    }

}
