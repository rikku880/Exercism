import java.util.*;

class ProteinTranslator {
    HashMap<String,String> proteinMap=new HashMap<>();
    ProteinTranslator(){
        proteinMap.put("AUG","Methionine");
        proteinMap.put("UUU","Phenylalanine");
        proteinMap.put("UUC","Phenylalanine");
        proteinMap.put("UUA","Leucine");
        proteinMap.put("UUG","Leucine");
        proteinMap.put("UCU","Serine");
        proteinMap.put("UCC","Serine");
        proteinMap.put("UCA","Serine");
        proteinMap.put("UCG","Serine");
        proteinMap.put("UAU","Tyrosine");
        proteinMap.put("UAC","Tyrosine");
        proteinMap.put("UGU","Cysteine");
        proteinMap.put("UGC","Cysteine");
        proteinMap.put("UGG","Tryptophan");

    }
    List<String> translate(String rnaSequence) {
        List<String> rnaTranslate = new ArrayList<>();
        int i=0;
        while(i<rnaSequence.length())
        {
            String rna=rnaSequence.substring(i,i+3);
            if (rna.equals("UAA") || rna.equals("UAG") || rna.equals("UGA"))
                break;
            rnaTranslate.add(proteinMap.get(rna));
            i+=3;
        }
        return  rnaTranslate;

    }
}