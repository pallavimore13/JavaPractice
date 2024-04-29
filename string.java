class SGGS{
	public static void main(String args[]){
		System.out.println("Inside main");
		SGGS sggs1 = new SGGS();
		System.out.println("Default constructor() return:" +sggs1);
		System.out.println("Class toString() return:" +sggs1.mytoString());
	}
	
	public String mytoString(){
		return "MyToString" + getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
}
