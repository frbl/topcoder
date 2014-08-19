public class YahtzeeScore {
	public int maxPoints(int[] toss) {
		int max = -1;
		for(int i = 0; i< toss.length; i++) {
			int temp = toss[i];
			for(int j = 0; j < toss.length; j++)
				if(toss[j] == toss[i] && i != j) temp+=toss[j];
			if(temp > max) max = temp;
		}
		return max;
	}
}
