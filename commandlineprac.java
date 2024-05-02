class FFirst
{
	public static void main(String ...args)
	{
	try{
		Thread.sleep(1000);
		System.out.println(args[0]);
		Thread.sleep(1000);
	}
	catch(Exception e){
		System.out.println("Inside Exception catch");
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Inside ArrayIndexOutOfBoundsException catch");
	}
	catch(InterruptedException e){
		System.out.println("Insside InterruptException catch");
	}
	 
	/*catch(Exception e){
		System.out.println("Inside Exception catch");
	}*/
	finally{
		System.out.println("Inside finally");
	}
	}
}
