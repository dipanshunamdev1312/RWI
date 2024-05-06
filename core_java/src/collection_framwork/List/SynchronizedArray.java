package collection_framwork.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArray {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		
		List l = Collections.synchronizedList(l1);

	}

}
