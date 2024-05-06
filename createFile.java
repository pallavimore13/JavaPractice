import java.io.*;
import java.io.IOException;

class demo
{
	public static void main(String[] args){
	try{
		File obj = new File("myFile.txt");
		if(obj.createNewFile())
		{
			System.out.println("File is created" +obj.getName());
		}
		else{
			System.out.println("File already exits");
		}
	}
	catch(IOException e)
	{
		System.out.println("An error has occured");
		e.printStackTrace();
	}
	}
}
