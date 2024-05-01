class one{
	int x;
	Two t;
	
	one(Two t){
		this.t = t;
		x = 10;
	}
	void display(){
		System.out.println("One's x=" +x);
		
		t.display();
		
		System.out.println("Two's var=" +t.y);
	}
}
class Two{
	int y;
	Two(int y){
		this.y = y;
	}
	
	void display(){
		System.out.println("Two's y=" +y);
	}
	
}
class Relate{
	public static void main(String args[]){
		Two obj2 = new Two(22);
		
		one obj1 = new one(obj2);
		
		obj1.display();
	}
}
