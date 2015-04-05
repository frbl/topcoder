import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class SkipRope {
	public int[] partners(int[] candidates, int height) {
		int[] r = {-1, -1};
		Arrays.sort(candidates);
		for(int c : candidates) {
			if( Math.abs(height - c) <= Math.abs(height - r[0])  ) {
				r[1] = r[0];
				r[0] = c;
			} else if (Math.abs(height - c) <= Math.abs(height - r[1])) {
				r[1] = c;
			}
		}
		Arrays.sort(r);
		return r;
	}
}
