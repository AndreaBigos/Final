import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Retirement_Tests {

	@Test
	void AmountToSave_Test() {
		int iYearsToWork=40;
		double dAnnualReturnWorking=.07;
		int iYearsRetired=20;
		double dAnnualReturnRetired=.02;
		double dRequiredIncome=10,000;
		double dMonthlySSI=2,642.00;
		assertTrue(Retirement.AmountToSave()==554.13);
	}
	
	@Test
	void TotalAmountSaved_Test() {
		int iYearsToWork=40;
		double dAnnualReturnWorking=.07;
		int iYearsRetired=20;
		double dAnnualReturnRetired=.02;
		double dRequiredIncome=10,000;
		double dMonthlySSI=2,642.00;
		assertTrue(Retirement.TotalAmountSaved()==1,454,485.55);
	}

}
