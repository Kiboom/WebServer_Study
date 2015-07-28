package string_calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAnalyzer {
	private String customDelimeter = "";

	public int[] toInt(String[] strNum) {
		int[] intNum = new int[strNum.length];
		for (int i = 0; i < strNum.length; i++)
			intNum[i] = Integer.parseInt(strNum[i]);
		return intNum;
	}

	public String[] parse(String text) {
		text = PatternAnalyzer(text);
		String[] strNum = text.split(",|\n" + customDelimeter);
		return strNum;
	}

	public String PatternAnalyzer(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if (!m.find())	return text;
		customDelimeter = "|" + m.group(1);
		return m.group(2);
	}
}
