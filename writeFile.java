import java.io.FileWriter;
import java.io.IOException;

class Write
{
	public static void main(String[] args)
	{
		try{
			FileWriter Writer = new FileWriter("myFile.txt");
				Writer.write("This is program to write in a file using filewriter");
				Writer.close();
				System.out.println("Successfully written");
				
		}
		catch(IOException e)
		{
			System.out.println("An has occured");
			e.printStackTrace();
		}
	}
}
