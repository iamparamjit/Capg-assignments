package third;
import java.util.*;
public class Bank 
{
	int cash;
	int totalCash=0;
	public int getCash()
	{
		return this.cash;
	}
	
	public int  totalCashInBank(ArrayList<Integer> cash)
	{
		for(int i:cash)
		{
			totalCash+=i;
		}
		return totalCash;
	}
}
class CurrentAccount extends Bank
{
	 int totalDeposits = 10000;
	    int creditLimit = 2000;
	    @Override
	    public int getCash() 
	    {
	    	int total =totalDeposits+creditLimit;
	    	return total;
	    }
}
class SavingsAccount extends Bank {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash()
    {
    	int total=totalDeposits+fixedDepositAmount;
    	return total;
    }
}

