package com.example.longestsubstringwithoutrepeatingcharacters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LongestSubstringWithoutRepeatingCharactersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LongestSubstringWithoutRepeatingCharactersApplication.class, args);
	}

	public static int findTheLengthOfTheLongestSubstring(String string) {
		List<String> characters = string.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.toList();

		String longestSubtring = "";
		String currentSubstring = "";
		int baseIndex = 0;

		for (int i = 0; i < characters.size(); i++) {
			String letter = characters.get(i);
			if (!currentSubstring.contains(letter)) {
				currentSubstring = currentSubstring.concat(letter);
				if (currentSubstring.length() > longestSubtring.length()) {
					longestSubtring = currentSubstring;
				}
			} else {
				i = baseIndex;
				baseIndex++;
				currentSubstring = "";
			}
		}

		return longestSubtring.length();
	}
}
