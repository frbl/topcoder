public class BinaryCode {
	public String[] decode(String message){
		String[] q = message.split("");
		String[] r = new String[2];
		for(int j = 0; j< 2 ; j++) {
			String result = "0" + j;
			boolean stopped = false;
			for(int i = 0; i < q.length ; i++) {
				int p0 = sec_last(result);
				int p1 = last(result);
				int p2 = Integer.parseInt(q[i]);
				int ri = (p2 - (p0 + p1));
				if (ri < 0 || ri > 1) {
					stopped = true;
					break;
					
				}
				result += ri + "";
			}
			String sres = result.substring(1, result.length() - 1);
			if(!stopped && (last(sres) + sec_last(sres) == last(message)))
				r[j]=sres;
			else
				r[j]="NONE";
		}
		return r;
	
	}
	
	private int last(String s){
		return Integer.parseInt(s.substring(s.length() - 1));
	}
	
	private int sec_last(String s){
		if (s.length()==1) return 0;
		return Integer.parseInt(s.substring(s.length() - 2, s.length() - 1));
	}
}
