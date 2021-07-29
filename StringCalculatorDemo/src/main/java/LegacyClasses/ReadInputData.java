package LegacyClasses;

import java.util.Scanner;

import LegacyInterfaces.IReadInputData;

public class ReadInputData implements IReadInputData {

	public ReadInputData() {
		// TODO Auto-generated constructor stub
	}

	public String Read() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value...");
		String str = sc.nextLine();
		sc.close();
		System.out.println("Value Readed...");
		return str;
	}
}
