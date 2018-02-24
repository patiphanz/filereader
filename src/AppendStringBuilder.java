import java.io.*;


public class AppendStringBuilder implements Runnable {

	private String filename;
	// create a string for the data to read
	private StringBuilder data;
	
	public AppendStringBuilder(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void run() {
		
		InputStream in = null;
		try {
			data = new StringBuilder();
			// open the file
			in = new FileInputStream(filename);
			// read as characters, so what to do?
			InputStreamReader reader = new InputStreamReader(in);
			// read the file
			int c;
			while ( true ) { // while (c=reader.read() >= 0)
				c = reader.read();
				if (c<0) { reader.close(); break; }
				data.append((char) c);
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		// close the file
		if(in!=null) try {
			in.close();
		} catch (IOException ioe) { }
	}
	
	public String toString() {
		return String.format("Read %d chars",data.length());
	}

}
