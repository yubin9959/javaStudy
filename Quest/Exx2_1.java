package Quest;

import java.util.Iterator;

public class Exx2_1 {

	public static void main(String[] args) {
		String star ="*****";
		for(int i = 5 ; i > 0; i--) {
			String suString = star.substring(0, i);
			System.out.println(suString);
		}

	}

}
