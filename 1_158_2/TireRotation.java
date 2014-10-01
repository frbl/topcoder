public class TireRotation {
	public int getCycle(String initial, String current) {
		String rotation = initial;
		for(int i = 1 ; i <= 4 ; i++){
			if(rotation.equals(current))
				return i;
			rotation = rotate(rotation);
		}
		return -1;
	}
	
	public String rotate(String x) {
		char[] j = x.toCharArray();
		return "" + j[3] + j[2] + j[0] + j[1];
	}
}
