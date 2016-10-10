package anagrams;

import static org.junit.Assert.*;

import org.junit.Test;

import anagrams.Anagram;

public class AnagramTest {

	@Test
	public void lettersCreateAnagramTest() {
		Anagram test = new Anagram();		
		
		String input1 = "dcba hgfe";
		String expectedResult1 = "abcd efgh";
		assertEquals(expectedResult1, test.createAnagram(input1));
		
		String input2 = "a";
		String expectedResult2 = "a";
		assertEquals(expectedResult2, test.createAnagram(input2));
		
		String input3 = "AbC aBc ABC abc";
		String expectedResult3 = "CbA cBa CBA cba";
		assertEquals(expectedResult3, test.createAnagram(input3));					
	}
	
	@Test
	public void notLettersCreateAnagramTest() {
		Anagram test = new Anagram();					
		
		String input1 = "123 456 789";
		String expectedResult1 = "123 456 789";
		assertEquals(expectedResult1, test.createAnagram(input1));
		
		String input2 = "!@# $%^ &*() _>?.";
		String expectedResult2 = "!@# $%^ &*() _>?.";
		assertEquals(expectedResult2, test.createAnagram(input2));
		
		String input3 = "12345!@#$%";
		String expectedResult3 = "12345!@#$%";
		assertEquals(expectedResult3, test.createAnagram(input3));
	}	
	
	@Test
	public void combinedCreateAnagramTest() {
		Anagram test = new Anagram();					
		
		String input1 = "a1bc2d ab1cd!";
		String expectedResult1 = "d1cb2a dc1ba!";
		assertEquals(expectedResult1, test.createAnagram(input1));
		
		String input2 = "123AbCd4567";
		String expectedResult2 = "123dCbA4567";
		assertEquals(expectedResult2, test.createAnagram(input2));		
	}	
	
	@Test
	public void bigDataCreateAnagramTest() {
		Anagram test = new Anagram();					
		
		String input1 = "Do you want to get started with unit testing in Java?"
				+ " Perhaps you already know a little about JUnit,"
				+ " but you've always wanted to learn more about this useful framework?";
		String expectedResult1 = "oD uoy tnaw ot teg detrats htiw tinu gnitset ni avaJ?"
				+ " spahreP uoy ydaerla wonk a elttil tuoba tinUJ,"
				+ " tub evu'oy syawla detnaw ot nrael erom tuoba siht lufesu krowemarf?";
		assertEquals(expectedResult1, test.createAnagram(input1));		
	}	
	
	@Test
	public void doubleCreateAnagram() {
		Anagram test = new Anagram();					
		
		String input1 = "Do you want to get started with unit testing in Java?"
				+ " Perhaps you already know a little about JUnit,"
				+ " but you've always wanted to learn more about this useful framework?";
		String expectedResult1 = "Do you want to get started with unit testing in Java?"
				+ " Perhaps you already know a little about JUnit,"
				+ " but you've always wanted to learn more about this useful framework?";
		assertEquals(expectedResult1, test.createAnagram(test.createAnagram(input1)));		
	}	
	
	@Test
	public void spaceCreateAnagram() {
		Anagram test = new Anagram();					
		
		String input1 = " d1cba  hgfe!   ";
		String expectedResult1 = " a1bcd  efgh!   ";				
		assertEquals(expectedResult1, test.createAnagram(input1));		
		
		String input2 = "     ";
		String expectedResult2 = "     ";				
		assertEquals(expectedResult2, test.createAnagram(input2));
	}	
	
	
		
	
	@Test(expected = IllegalArgumentException.class)
	 public void CreateAnagramExceptionTest() throws IllegalArgumentException {
		Anagram test = new Anagram();
		
		test.createAnagram(null);
	}

}
