package Third;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate)
    {
    	double si=(principalAmount*time*interestRate)/100;
    	return si;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate)
    {
    	double ci=principalAmount*Math.pow(( 1 + interestRate),time) - principalAmount;
    	return ci;
    }
}