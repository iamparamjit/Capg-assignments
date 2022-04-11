package First;

public class ArmstrongOrNot {
	public boolean armstrongCheck(int num) 
	{
		
		int temp, no_digits=0, last_digit=0, sum=0;    
		temp=num;  
		while(temp>0)    
		{   
		temp = temp/10;   
		no_digits++;   
		}   
		temp = num;   
		while(temp>0)   
		{        
		last_digit = temp % 10;   
		sum +=  (Math.pow(last_digit, no_digits));      
		temp = temp/10;   
		}   
		if(num==sum)    
		return true;      
		else return false;   
		}     
	}

