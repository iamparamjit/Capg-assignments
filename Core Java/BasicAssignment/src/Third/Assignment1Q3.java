package Third;

public class Assignment1Q3 {
    public static void main (String args[]) 
    {
    	
    	SiCi a=new SiCi();
    	double d1=a.simpleInterest(10000,2,3);
    	double d2=a.compoundInterest(10000, 3, 5);
    	
    	System.out.println(d1);
    	System.out.println(d2);
    }
}