import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface TwoElementPredicate<T>{
	public boolean isFirstBetter(T s1, T s2);
}

interface TwoStringPredicate{
	public boolean isBetterString(String s1, String s2);
}

class Better {
	public static String betterString(String s1, String s2, TwoStringPredicate sp) {
		return sp.isBetterString(s1, s2) ? s1 : s2;
	}
	public static int eChecker(String s1, String s2) {
		if (s1.contains("e") && !s2.contains("e")) {
			return -1;
		} else if (s2.contains("e") && !s1.contains("e")) {
			return 1;
		} else return 0;
	}
	public static <T> T betterElement(T s1, T s2, TwoElementPredicate<T> sp) {
		return sp.isFirstBetter(s1, s2)?s1:s2;
	}
}

public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = {"this", "is", "an","for","practice", "yes", "ear"};
		List<String> stringsList = Arrays.asList(strings);
		Collections.sort(stringsList, (s1, s2) -> (s1.length() - s2.length()));
//		System.out.println(stringsList);
		Collections.sort(stringsList, (s1, s2) -> (s2.length() - s1.length()));
//		System.out.println(stringsList);
		Collections.sort(stringsList, (s1,s2) -> ((int) s1.charAt(0) - (int) s2.charAt(0)));
//		System.out.println(stringsList);
		Collections.sort(stringsList, (s1,s2) -> {
//			if (s1.indexOf('e') > s
			return s2.indexOf('e') - s1.indexOf('e');
		});
		System.out.println(stringsList);
		Collections.sort(stringsList, (s1, s2) -> (s1.length() - s2.length()));
		System.out.println(stringsList);
		Collections.sort(stringsList, Better::eChecker);
		System.out.println(stringsList);
		System.out.println(Better.betterString("hello", "ther", (s1,s2)-> s1.length() > s2.length()));
		System.out.println(Better.betterString("hello", "there", (s1,s2)-> true));
		System.out.println(Better.betterElement("hello", "theres", (s1,s2)-> s1.length() > s2.length()));
		System.out.println(Better.betterElement("hello", "there", (s1,s2)-> true));
	}

}