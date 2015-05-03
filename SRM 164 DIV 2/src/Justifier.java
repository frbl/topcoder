import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class Justifier {
	
	public String[] justify(String[] textIn) {
		int max = -1;
		for(int i = 0 ; i < textIn.length ; i++) {
			if(textIn[i].length() > max) {
				max = textIn[i].length();
			}
		}
		for(int i = 0 ; i < textIn.length ; i++) {
			while((max - textIn[i].length()) != 0) {
				textIn[i] = " " + textIn[i];
			}
		}
		return textIn;
	}
}
