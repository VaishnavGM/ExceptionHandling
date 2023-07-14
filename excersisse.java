package Vaish;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class excersisse {

	public static void main(String[] args) throws IOException {
		
		ArrayList <Integer>a = new ArrayList<Integer>();
		a.add(100);
a.add(200);
		a.add(3300);
		a.add(400);

		
try {
	FileOutputStream file = new FileOutputStream("F:\\vaishnav.txt");
	ObjectOutputStream s  = new ObjectOutputStream(file);
	s.writeObject(a);
	s.flush();
	s.close();
	System.out.println("done");

} catch (FileNotFoundException e) {
	
	e.printStackTrace();
}

	}
	



	}


