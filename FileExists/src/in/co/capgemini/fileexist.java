package in.co.capgemini;

import java.io.File;

public class fileexist {

	public static void main(String[] args) {
		
		File f =  null;
		boolean bool = false;
		
		try {
			f = new File("test.txt"); //file created
			f.createNewFile();
			bool = f.exists();  //test if file exists
			System.out.println("the file exist " +bool);
			if(bool == true)
			{
				f.delete();  //file is being deleted
				System.out.println("the file has been deleted");
				
			}
			
			bool = f.exists();  //test file if exists
			System.out.println("the file exists " +bool);
			
		}
		catch(Exception e) {
			e.printStackTrace();  //for errors
		}
		
		
		
		
	}

}
