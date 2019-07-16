import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//java.util.function;

public class StringUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1();
	}

	private static void ex1() {
		// TODO Auto-generated method stub
		String[] strings = {"this", "is", "my", "last", "homework", "problem"};
		List<String> stringsList = Arrays.asList(strings);
		System.out.println(allMatches(stringsList, s->s.length()>4));
	}
	
	public static List<String> allMatches(List<String> allStrings, Predicate<String> condn){
		List<String> returnList = new ArrayList<>();
		for (String s: allStrings) {
			if (condn.test(s)){
				returnList.add(s);
			}
		}
		return returnList;
	}

}
