package cl01_list;

import java.util.Vector;

public class Ch02_Vector {

	public static void main(String[] args) {
		Vector<String> vlist = new Vector<>();
		vlist.add("Vector");
		vlist.add("ArrayList");
		
		vlist.remove(0);
		vlist.remove("ArrayList");
	}

}
