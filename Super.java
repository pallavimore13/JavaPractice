/*
class College
{
	String collName;
	
	College(String collName)
	{
		this.collName = collName;
		System.out.println(collName);
	}
}

class TechUni extends College
{
	String uniName;
	
	TechUni(String uniName)
	{
		super("myname");
		this.uniName = uniName;
		System.out.println(uniName);
	} 
	
	public static void main(String args[])
	{
		System.out.println("Inside main");
		TechUni t = new TechUni("SGGS");
		
	}
	
}*/




class College
{
	String collName;
	
	College(String collName)
	{
		this.collName = collName;
		System.out.println(collName);
	}
	void funSample(){
		System.out.println("Hello MY name is Pallavi");
	}
}

class TechUni extends College
{
	String uniName;
	
	TechUni(String uniName)
	{
		super("myname");
		super.funSample();
		this.uniName = uniName;
		System.out.println(uniName);
		//super("Myname");
	} 
	
	public static void main(String[] args)
	{
		System.out.println("Inside main");
		TechUni t = new TechUni("SGGS");
		t.funSample();
		//super.funSample();
		
	}
	
}
