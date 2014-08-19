import java.util.*;

public class ImageDithering {

	public int count(String dithered, String[] screen) {
		int r = 0;
		for(String x : screen)
			for(String y : x.split(""))
				if(dithered.indexOf(y) >= 0)
					r += 1;
		return r;
	}

}
