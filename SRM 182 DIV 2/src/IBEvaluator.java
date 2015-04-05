import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class IBEvaluator {

    public int[] getSummary(int[] predictedGrades, int[] actualGrades) {
        int diff = 0;
        int[] res = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < predictedGrades.length; i++) {
            diff = Math.abs(predictedGrades[i] - actualGrades[i]);
            res[diff] += 1.0;
        }

        for (int j = 0 ; j < res.length; j++) {
            res[j] = (int) Math.floor((res[j] / (double) predictedGrades.length) * 100);
        }
        return res;
    }
}
