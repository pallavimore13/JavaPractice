

		
class Father{
	public static void main(String[] args){
		Father son = new Father();
		System.out.println(son.fun(5,10,15));
		//son.fun(10,10);
		//System.out.println(son.fun(Integer.MAX_VALUE,10));
		//System.out.println(son.fun(son));
	}
	public void fun(int a,int b){
		System.out.println("Inside fun(int,int)");
		System.out.println(a+b);
	}
	public long fun(int a,int b){
		System.out.println("Inside fun(Long,int)");
		System.out.println(a+b);
		return a+b;
	}
	public int fun(int...b){
		System.out.println(b[0]);
		return 0;
	}
	public int fun(int a,int...b){
		System.out.println(a);
		System.out.println(b[0]+"length is"+b.length);
		return 0;
	}
	public long fun(Father b)
	{
		System.out.println(b);
		b.balance = 30;
		return b.balance;
	}
	
}
