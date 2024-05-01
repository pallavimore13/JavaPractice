class Sample{
	public static void main(String ...args){
		Sample s = new Sample();
		try{
			System.out.println(args[0]);
		}
		catch(Exception e){
			System.out.println(e);
			
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.toString());
			//e.wait(1000000);
			
			System.out.println(e.equals(e));
			System.err.println(e.getClass());
			//e.notify();
			//e.addSuppressed(e);
			
			System.err.println(e.getCause());
			
			System.err.println(e.fillInStackTrace());
			
			System.err.println(e.getStackTrace());
			
			
			System.err.println(e.hashCode());
			
			
			System.err.println(e.initCause(e));
			//e.notifyAll();
			
			System.err.println(e.getSuppressed());
			
			
			
			
			
		}
	
	
	}
}
