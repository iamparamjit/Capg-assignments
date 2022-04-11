package third;

import java.util.*;



public class Assignment2Q3 {

	public static void main(String[] args) 
	{
		Bank bank=new Bank();
		CurrentAccount curr=new CurrentAccount();
		SavingsAccount save=new SavingsAccount();
		ArrayList<Integer> a=new ArrayList<>();
		a.add(save.getCash());
		a.add(curr.getCash());
		
		System.out.println(bank.totalCashInBank(a));
		
		

	}

}
