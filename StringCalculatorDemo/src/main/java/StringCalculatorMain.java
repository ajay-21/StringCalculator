import LegacyClasses.AddString;
import LegacyInterfaces.IAddString;

public class StringCalculatorMain {
	private static IAddString _IAddString;

	public StringCalculatorMain() {
		// TODO Auto-generated constructor stub
		_IAddString = new AddString();
	}

	public static void main(String[] args) {
		StringCalculatorMain stringCalculatorMain = new StringCalculatorMain();
		System.out.println(_IAddString.Calculate());

	}

}
