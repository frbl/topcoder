public class CCipher {
	public String decode(String cipherText, int shift) {
		String result = "";
		for(String x : cipherText.split("")) {
			char temp = x.charAt(0);
			for(int i = 0; i < shift; i++)
				if(temp == 'A') temp = 'Z';
				else temp--;
			result += temp;
		}
		return result;
	}
}
