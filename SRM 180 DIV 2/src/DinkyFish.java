import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class DinkyFish {
	
	public int monthsUntilCrowded(int tankVolume, int maleNum, int femaleNum) {
		int couples = Math.min(maleNum, femaleNum);
		int dinkies = maleNum + femaleNum;
		for(int i = 1 ; i < 10000000 ; i++) {
			if(dinkies > (tankVolume * 2)) {
				return i - 1;
			}
			dinkies += couples + couples;
			couples = couples + couples;
		}
		return 0;
	}
}
