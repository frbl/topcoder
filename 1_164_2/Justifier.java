public class Justifier {
	public String[] justify(String[] textIn) {
		int m = -1;
		String[] r = new String[textIn.length];
		
		for(String s : textIn)
			if(s.length() > m) m = s.length();		
		
		int temp = 0;
		for(int i = 0; i < textIn.length; i++) {
			String s = textIn[i];
			temp = m - s.length();
			r[i]=gen(temp) + s;
		}
		return r;
	}
	private String gen(int i){
		String res = "";
		for(int j = 0 ; j < i ; j++) res += " ";
		return res;
	}
}
