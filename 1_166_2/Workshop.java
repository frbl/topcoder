import java.util.*;
public class Workshop {
	public int pictureFrames(int[] pieces) {
		Arrays.sort(pieces);
		int r = 0;
		for(int i = 0 ; i < pieces.length; i++)
			for(int j = i + 1 ; j < pieces.length; j++)
				for(int k = j + 1 ; k < pieces.length; k++)
					if(pieces[i]+pieces[j] > pieces[k]) r++;
		return r;
	}
}
