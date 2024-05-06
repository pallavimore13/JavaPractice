class FFirst{
	public static void main(String ...args){
	try{
		System.out.println(args[0]);
	    }
	catch(Exception e){
		System.out.println(e);
		System.out.println(e.getMessage());
		System.out.println(e.getLocalizedMessage());
		System.out.println(e.toString());
		e.printStackTrace();//print the exception information in detail with line number or tool to handle exception and error
		System.out.println(e.equals(e));
		
		
		System.out.println(e.fillInStackTrace());//current state of the stack frame for the current thread
		System.out.println(e.getStackTrace());//the getStackTrace() method in throwable class used 
		//to return an array of stack trace element which is  the stack trace information in printStackTrace().
		System.out.println(e.getCause());
		System.out.println(e.getClass());
		
		System.out.println(e.getSuppressed());
		
		//System.out.println(e.hashcode());                                      
	}
	}

}


