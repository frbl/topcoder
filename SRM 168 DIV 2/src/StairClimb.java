import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class StairClimb {

    public int stridesTaken(int[] flights, int stairsPerStride) {
        int result = 0;
        double steps = 0;
        for(int f : flights) {
            steps = Math.floor(f / stairsPerStride);
            result += (steps * stairsPerStride) % f == 0 ? steps : steps + 1;
        }
        int landings = (flights.length - 1) * 2;
        return result + landings;
    }
}
