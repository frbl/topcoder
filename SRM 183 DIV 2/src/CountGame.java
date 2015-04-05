import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class CountGame {

    public int howMany(int maxAdd, int goal, int next) {
        while (goal > (next + (maxAdd - 1))) goal = goal - (maxAdd + 1);
        int x = (goal - next) + 1;
        return x <= maxAdd && x > 0 ? x : -1;
    }
}
