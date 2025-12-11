package TASK;

import java.util.*;



public class interfaceex2 {
	public static void main(String[] args) {
		List<String> words=Arrays.asList("apple","banana","apple","orange","apple");
		String target="apple";
		long count=words.stream().filter(word->word.equals(target))
				.count();
		System.out.println("The word'"+target+"' appears"+count+"times.");
				
	}

}
                                          