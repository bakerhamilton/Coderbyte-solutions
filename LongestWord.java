/*
Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length. Ignore punctuation and assume sen will not be empty. */

import java.util.*; 
import java.io.*;

class Function {  
  String LongestWord(String sen) { 
		String newSentence = new String();
		newSentence = newSentence.copyValueOf(StripPunctuation(sen));
		System.out.println(newSentence);
		String[] splitString = newSentence.split(" ");
		String longest = new String();	

		for (String s:splitString)
			if (s.length() > longest.length())
				longest = s;

    return longest;
  }      

	char[] StripPunctuation(String sen) {
		char newSentence[] = new char[sen.length()];
		sen.getChars(0, sen.length(), newSentence, 0);

		for (int i=0; i < newSentence.length; i++)
			if (newSentence[i] < 'A' || newSentence[i] > 'z')
				newSentence[i] = ' ';

		return newSentence;
	}
}

class LongestWord {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LongestWord(s.nextLine())); 
    
  }
} 
