public class BritishCoins {
	public int[] coins(int pence) {
		int[] v = {(20*12), 12, 1};
		int[] r = new int[3];
		for(int i = 0 ; i < v.length ; i++)
			while(pence >= v[i]){
				pence -= v[i];
				r[i]+= 1;
			}
		return r;
	}
}
