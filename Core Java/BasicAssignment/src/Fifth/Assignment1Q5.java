package Fifth;

import java.util.Scanner;

public class Assignment1Q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TaxAmount a=new TaxAmount();
		System.out.println("Enter the ctc");
		int ctc=sc.nextInt();
		sc.close();
		System.out.println(a.calculateTaxAmount(ctc));
		
		

	}

}
