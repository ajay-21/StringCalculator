package Classes;

import org.junit.Assert;
import org.junit.Test;

import Classes.PerformCalculation;
import Interfaces.IPerformCalculation;

public class PerformCalculationTest {

	@Test
	public void Given_Input_As_1_When_AddString_Called_Then_Verify_result_1() {
		// Given Input as "1"
		String Input = "1";
		// When I Called AddString Method
		IPerformCalculation _IPerformCalculation = new PerformCalculation();
		int ActualResult = _IPerformCalculation.Add(Input);
		// Then I Verify ActualResult is 1
		Assert.assertEquals(ActualResult, 1);
	}

	@Test
	public void Given_Input_As_empty_When_AddString_Called_Then_Verify_result_0() {
		// Given Input as ""
		String Input = "";
		// When I Called AddString Method
		IPerformCalculation _IPerformCalculation = new PerformCalculation();
		int ActualResult = _IPerformCalculation.Add(Input);
		// Then I Verify ActualResult is 0
		Assert.assertEquals(ActualResult, 0);
	}

	@Test
	public void Given_Input_As_1_comma_2_When_AddString_Called_Then_Verify_result_3() {
		// Given Input as "1,2"
		String Input = "1,2";
		// When I Called AddString Method
		IPerformCalculation _IPerformCalculation = new PerformCalculation();
		int ActualResult = _IPerformCalculation.Add(Input);
		// Then I Verify ActualResult is 3
		Assert.assertEquals(ActualResult, 3);
	}

}
