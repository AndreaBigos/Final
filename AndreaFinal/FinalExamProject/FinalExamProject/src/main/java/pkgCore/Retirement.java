package pkgCore;

public class Retirement {

	private int iYearsToWork;
	private double dAnnualReturnWorking;
	private int iYearsRetired;
	private double dAnnualReturnRetired;
	private double dRequiredIncome;
	private double dMonthlySSI;
	
	public Retirement(int iYearsToWork, double dAnnualReturnWorking, int iYearsRetired, double dAnnualReturnRetired,
			double dRequiredIncome, double dMonthlySSI)
	{
		this.iYearsToWork=iYearsToWork;
		this.dAnnualReturnWorking=dAnnualReturnWorking;
		this.iYearsRetired=iYearsRetired;
		this.dAnnualReturnRetired=dAnnualReturnRetired;
		this.dRequiredIncome=dRequiredIncome;
		this.dMonthlySSI=dMonthlySSI;
		
	}
	public double AmountToSave()
	{
		
		double amount = 0;
		amount = (TotalAmountSaved()/iYearsToWork)/12)*dAnnualReturnWorking
		return amount;
	}
	
	public double TotalAmountSaved()
	{
		double total =0;
		if(dAnnualReturnRetired==0)
		{
			total = -1*(dRequiredIncome)/iYearsRetired;
		}
		else
		{
			double rate = dAnnualReturnRetired +1;
			total = (Math.pow(rate, iYearsRetired)*dRequiredIncome+dMonthlyIncome(rate*dMonthlySSI)((Math.pow(rate, n-1)))/dAnnualReturnRetired;
		}
		
		return total;
	}
}
