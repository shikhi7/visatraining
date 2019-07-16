package com.visa.training.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		part1();
		part2();
		part3();
	}

	private static void part3() {
		// TODO Auto-generated method stub
		
	}

	private static void part2() {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("hi","hello", "turn","the","radio","on");
//		List<String> words2 = new ArrayList<String>();
		String allUpper = words.stream().reduce("", (s1,s2)->s1.toUpperCase().concat(s2.toUpperCase()));
//		System.out.println(allUpper);
		String allUpper2 = words.stream().map(String::toUpperCase).reduce("", String::concat);
//		System.out.println(allUpper2);
		Optional<String> commaSep = words.stream().reduce((s1,s2)->s1+","+s2);
		System.out.println(commaSep.get());
	}

	private static void part1() {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("hi","hello", "turn","the","radio","on");
//		words.stream().forEach(w->System.out.println(w+"  "));
//		words.stream().forEach(System.out::println);
//		List<String> excitingWords = StringUtils.transformedList(words, s->s+"!");
		List<String> excitingWords = words.stream().map(w->w.concat("!")).collect(Collectors.toList());
//		excitingWords.stream().forEach(System.out::println);
		List<String> excitingWords2 = words.stream().map(w->w.replace("i", "eye")).collect(Collectors.toList());
//		excitingWords2.stream().forEach(System.out::println);
		List<String> excitingWords3 = words.stream().map(w->w.toUpperCase()).collect(Collectors.toList());
//		excitingWords3.stream().forEach(System.out::println);
		List<String> shortWords = words.stream().filter(w->w.length()<4).collect(Collectors.toList());
//		shortWords.stream().forEach(System.out::println);
	}

}
