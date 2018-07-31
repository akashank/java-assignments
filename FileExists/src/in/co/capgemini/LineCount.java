package in.co.capgemini;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class LineCount {

	public static void main(String[] args) {
		
		try {
			File file ;
			file = new File("c:\\Users\\aakash\\Desktop\\akash.txt\\"); //file created
			
			if (file.exists())
			{
				FileReader fr = new FileReader(file);
				LineNumberReader lnr = new LineNumberReader(fr);
				
				int linenumber = 0;
				while(lnr.readLine()!=null)
				{
					linenumber++ ;
					
							
				}
				
				System.out.println("total number of lines "+linenumber);
				
				lnr.close();
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
