
class SGGS
 {
    static int x = 786;
    int y = 2024;

    {
        System.out.println("inside SGGS init block" +this);
        System.out.println(y);
    }

    SGGS() 
    {
        System.out.println("Inside SGGS constructor" +this);
    }


    public static void main(String[] args) 
    {
        SGGS s1 = new SGGS();
         System.out.println(s1);
        System.out.println("Inside main: ");
        SGGS s2 = new SGGS();
         System.out.println(s2);
    }

    static 
    { 
        System.out.println("Inside SGGS static block");
    }
    public String toString()
    {
    	return "Hi";
    }
}
