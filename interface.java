interface Voter{
	void castVote();
}

interface EC{
	void checkValidityOfVoter(int age) throws InvalidVoterException;
}

class ECIndia implements Voter,EC{
	final int minAge;
	
	ECIndia(int minAge){
		this.minAge = minAge;
	}
	
	public void castVote(){
		
		int arr[] = {1,2,3};
		try{
			System.out.println("In castVote::ECIndia"+arr[3]);
		}
		catch(Exception ex){
			System.out.println(ex);
			for(StackTraceElement element:ex.getStackTrace()){
				System.out.println(element);
				System.out.println(element.getClassName()+""+element.getMethodName()+"("+element.getFileName()+":"+element.getLineNumber());
				
			}
		}
	}
	

	public void checkValidityOfVoter(int age){
		try{
		if(age<minAge){
			InvalidVoterException invVoter = new InvalidVoterException("Invalid Voter::Required age >="+minAge);
			throw invVoter;
		}
		else if(age >= 150){
			throw new Exception("Not a human");
		}
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
}
class ECBrazil implements Voter,EC{
	public void castVote(){
		System.out.println("In castVote::ECBrazil");
	}
	public void checkValidityOfVoter(int age){
	
	}
	
	
}
class Election2024{
	public static void main(String args[]){
		ECIndia ecIndia = new ECIndia(18);
		ecIndia.checkValidityOfVoter(400);
		ecIndia.castVote();
	}
}
class InvalidVoterException extends Exception{
	InvalidVoterException(String error){
		super(error);
	}
	}





	
