package com.example.longestsubstringwithoutrepeatingcharacters;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LongestSubstringWithoutRepeatingCharactersApplicationTests {

	@Test
	@DisplayName("Valeur abcabcbb égale 3")
	public void algorithmLSWRC_abcabcbb_3() {
		String value = "abcabcbb";
		int result = LongestSubstringWithoutRepeatingCharactersApplication.findTheLengthOfTheLongestSubstring(value);
		assertEquals(3, result);
	}

	@Test
	@DisplayName("Valeur bbbbb égale 1")
	public void algorithmLSWRC_bbbbb_1() {
		String value = "bbbbb";
		int result = LongestSubstringWithoutRepeatingCharactersApplication.findTheLengthOfTheLongestSubstring(value);
		assertEquals(1, result);
	}

	@Test
	@DisplayName("Valeur pwwkew égale 3")
	public void algorithmLSWRC_pwwkew_3() {
		String value = "pwwkew";
		int result = LongestSubstringWithoutRepeatingCharactersApplication.findTheLengthOfTheLongestSubstring(value);
		assertEquals(3, result);
	}

	@Test
	@DisplayName("Valeur cdd égale 2")
	public void algorithmLSWRC_cdd_2() {
		String value = "cdd";
		int result = LongestSubstringWithoutRepeatingCharactersApplication.findTheLengthOfTheLongestSubstring(value);
		assertEquals(2, result);
	}

	@Test
	@DisplayName("Valeur bdb égale 2")
	public void algorithmLSWRC_bdb_2() {
		String value = "bdb";
		int result = LongestSubstringWithoutRepeatingCharactersApplication.findTheLengthOfTheLongestSubstring(value);
		assertEquals(2, result);
	}

	@Test
	@DisplayName("Valeur dvdf égale 3")
	public void algorithmLSWRC_dvdf_3() {
		String value = "dvdf";
		int result = LongestSubstringWithoutRepeatingCharactersApplication.findTheLengthOfTheLongestSubstring(value);
		assertEquals(3, result);
	}
}
