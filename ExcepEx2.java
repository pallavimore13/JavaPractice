class CheckExcep{
	public static void main(String ...args){
		try{
			Thread.sleep(5000);
			System.out.println("try1");
			Thread.sleep(1000);
			System.out.println("try2");
			System.out.println(args[0]);
			Thread.sleep(1000);
			System.out.println("try3");
			
		}
		/*catch(Exception ex){
			System.out.println("Exception ex");
		}*/
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("ArrayIndexOutOfBoundsException ex");
		}
		catch(InterruptedException ex){
			System.out.println("InterrupteException ex");	
		}
		catch(Exception ex){
			System.out.println("Exception ex");
		}
		
		finally{
			System.out.println("Inside finally");
		}
	}	
}
