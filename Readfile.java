import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Main
{
	public static void main(String[] args)
	{
		try{
		File obj = new File("myFile.txt");
		Scanner Reader = new Scanner(obj);
		    while (Reader.hasNextLine()) {
		        String data = Reader.nextLine();
		        System.out.println(data);
		    }
		    Reader.close();
		    
		}
		catch(FileNotFoundException e)
		{
			System.out.println("An error has occured");
			e.printStackTrace();
		}	
		

}
}
