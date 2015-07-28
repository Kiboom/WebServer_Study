package string_calc;

public class StringCalculator_Test {

	public static void main(String[] args) {
		StringCalculator calc = new StringCalculator();	
		//StringGetter sg = new StringGetter();
		//System.out.println("계산결과: " + calc.add(sg.getString()));
		System.out.println("계산결과: " + calc.add("//;\n1,3;2"));
	}
}
