import java.io.*;

/**
 * Read the file as text one line at a time by using a BufferedReader
 * and append the result to a String.
 * 
 * @author Patiphan Srisook
 *
 */
public class AppendLineString implements Runnable {

	private String filename;
	private String result;
	private String line;
	
	public AppendLineString(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void run() {
		FileReader reader = null;
		BufferedReader br = null;
		result = "";
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			while((line = br.readLine()) != null) {
				result = result + line + '\n';
			}
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		if(br != null) try {
			br.close();
			reader.close();
		}catch (IOException ioe) { }
		
	}

	// Describe class information.
	public String toString() {
		return String.format("Read %d chars", result.length());
	}
}
