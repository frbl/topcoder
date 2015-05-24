import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class PassingGrade {

    public int pointsNeeded(int[] pointsEarned, int[] pointsPossible, int finalExam) {
        int total = 0;
        int total_possible = finalExam;
        for (int i = 0; i < pointsEarned.length; i++) {
            total += pointsEarned[i];
            total_possible += pointsPossible[i];
        }

        int r = (int) Math.ceil((total_possible * 0.65)) - total;
        if (r < 0) return 0;
        return r > finalExam ? -1 : r;
    }
}
