import java.io.*;

/**
 * Read a text file one character at a time then append
 * all the character to a String and return the String.
 * 
 * @author Patiphan Srisook
 *
 */
public class AppendStringTask implements Runnable {

	private String filename;
	// create a string for the data to read
	private String data;
	
	public AppendStringTask(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void run() {
		data = "";
		InputStream in = null;
		try {
			// open the file
			in = new FileInputStream(filename);
			// read as characters, so what to do?
			InputStreamReader reader = new InputStreamReader(in);
			// read the file
			int c;
			while ( true ) { // while (c=reader.read() >= 0)
				c = reader.read();
				if (c<0) { reader.close(); break; }
				data = data + (char) c;
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		// close the file
		if(in!=null) try {
			in.close();
		} catch (IOException ioe) { }
	}
	
	// Describe class information.
	public String toString() {
		return String.format("Read %d chars",data.length());
	}

}
