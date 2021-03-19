package exception_handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally_Example {

	static String FileName = "Finally.txt";
	static BufferedReader br = null;
	static FileReader fr = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		fr = new FileReader(FileName);
		br = new BufferedReader(fr);
		
		String sCurrentLine;
		
		while((sCurrentLine = br.readLine())!= null) {
			
			System.out.println(sCurrentLine);
		}
		
	} catch(IOException e) {
			e.printStackTrace();
		}
//without finall this function throws exception (comment the finall block code & see the out put)
		
		finally {
			try {
				if (br != null)
					br.close();
				
				if (fr != null)
					fr.close();
				
			} catch (IOException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
	}
}
