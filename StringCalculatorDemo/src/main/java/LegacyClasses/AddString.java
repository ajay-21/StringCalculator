package LegacyClasses;

import Classes.PerformCalculation;
import Interfaces.IPerformCalculation;
import LegacyInterfaces.IAddString;
import LegacyInterfaces.IReadInputData;

public class AddString implements IAddString {
	public IReadInputData _IReadInputData;
	public IPerformCalculation _IPerformCalculation;

	public AddString() {
		// TODO Auto-generated constructor stub
		_IReadInputData = new ReadInputData();
		_IPerformCalculation = new PerformCalculation();
	}

	public int Calculate() {
		System.out.println("Flow Started...!");
		String Input = _IReadInputData.Read();
		int Res = _IPerformCalculation.Add(Input);
		System.out.println("Flow Ended...!");
		return Res;

	}

}
