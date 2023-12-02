package ComplementaryDNA.src;

import java.util.HashMap;
import java.util.Map;

public class DnaStrand {
    static Map<Character, Character> complementsMap = new HashMap<Character, Character>() {
        {
            put('A', 'T');
            put('T', 'A');
            put('C', 'G');
            put('G', 'C');
        }
    };

    public static String makeComplement(String dna) {
        String complement = "";

        for (char base : dna.toCharArray()) {
            complement += DnaStrand.complementsMap.get(base);
        }

        return complement;
    }
}
