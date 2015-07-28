package string_calc;

import java.util.Scanner;

public class StringGetter {

	public String getString() {
		System.out.print("계산할 문자열을 입력하세요: ");		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		return str;
	}
}
