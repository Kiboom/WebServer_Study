package string_calc;

public class StringCalculator {
	private int sum=0;
	private StringAnalyzer sa = new StringAnalyzer();
	
	public int add(String str){		
		if(str==null || str.isEmpty()) return 0;
		int[] numbers = sa.toInt(sa.parse(str)); // 주어진 문자열을 구분자로 나눠서 정수형 배열에 담기.		
		for(int i : numbers) sum += i;
		return sum;
	}
}

// 해야할 일: split에서의 처리, 입력한 문자열 예외처리, 커스텀 구분자 지정

