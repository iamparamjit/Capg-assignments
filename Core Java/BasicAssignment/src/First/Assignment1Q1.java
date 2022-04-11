package First;

import java.util.Scanner;
public class Assignment1Q1 {

	public static void main(String[] args) {
		ArmstrongOrNot a=new ArmstrongOrNot();
		int num;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number: ");    
		num=sc.nextInt();  
		sc.close();
		if(a.armstrongCheck(num))  
		{  
		System.out.print("Armstrong");  
		}  
		else   
		{  
		System.out.print("Not Armstrong");  
		}  
		}   
		 
	}



