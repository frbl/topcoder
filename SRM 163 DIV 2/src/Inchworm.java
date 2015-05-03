import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Inchworm {
	
	public int lunchtime(int branch, int rest, int leaf) {
		int leafs_eaten = 0;
		for(int i = 0 ; i <= branch ; i += rest)
			if (i % leaf == 0) leafs_eaten++;
		return leafs_eaten;
	}
}
