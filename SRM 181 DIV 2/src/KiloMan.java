import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class KiloMan {

    public int hitsTaken(int[] pattern, String jumps) {
        String[] jmps = jumps.split("");
        int hits = 0;
        for(int i = 0 ; i < pattern.length ; i++) {
            if(pattern[i] > 2 && jmps[i].equals("J") || pattern[i] <= 2 && jmps[i].equals("S") ) {
                hits++;
            }
        }
        return hits;
    }
}
