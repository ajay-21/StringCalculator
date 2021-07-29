package Classes;

import Interfaces.IPerformCalculation;

public class PerformCalculation implements IPerformCalculation {

	public PerformCalculation() {
		// TODO Auto-generated constructor stub
	}

	public int Add(String Input) {
		int Res;
		if (Input.isEmpty()) {
			Res = 0;
		} else {
			String[] NumberArray = Input.split(",");
			if (NumberArray.length == 1)
				Res = Integer.parseInt(NumberArray[0]);
			else
				Res = Integer.parseInt(NumberArray[0]) + Integer.parseInt(NumberArray[1]);
		}
		return Res;
	}
}
