class college
{
	String clgName;
	
	college(String clgName)
	{
		this.clgName = clgName;
	}
}

class Techuni extends college
{
	String uniName;
	Techuni(String clgName,String uniName)
	{
		super(clgName);
		this.uniName= uniName;
	}
	public static void main(String[] args)
	{
	
		Techuni sggs1 = new Techuni();
		System.out.println(" ");
	}

}
