package Fifth;

public class TaxAmount {
	public double calculateTaxAmount(int ctc)
	{
		
		if(ctc>=0 && ctc<=180000)
		{
			//double taxAmount=0*ctc;
			return ctc*0;
		}
		else if(ctc>180000 && ctc<=300000)
		{
			//double taxAmount=0.1*ctc;
			return ctc*0.1;
		}
		else if(ctc>300000 && ctc<=500000)
		{
			//double taxAmount=0.2*ctc;
			return ctc*0.2;
		}
		else if(ctc>500000 && ctc<=1000000)
		{
			//double taxAmount=0.3*ctc;
			return ctc*0.3;
		}
		else 
		{
			return 0;
		}
		
	}
	
	
	

}
