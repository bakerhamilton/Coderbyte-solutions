import java.util.*; 
import java.io.*;

class Function {  
  char[] LetterChanges(String str) {
	  char newString[] = new char[str.length()];
	  str.getChars(0, str.length(), newString, 0);
	  
	  for (int i=0; i < newString.length; i++) {
		  if (!isLetter(newString[i]))
			  continue;
		  
		  if (newString[i] == 'z' || newString[i] == 'Z')
			  newString[i] -= 25;
		  else
			  newString[i] = ++newString[i];
		  
		  if (isVowel(newString[i]))
			  newString[i] -= 32;
	  }
	  return newString;
  }
  
  boolean isLetter(char c) {
	  if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
		  return true;
	  
	  return false;
  }
  
  boolean isVowel(char c) {
	  char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
	  
	  for (int i=0; i < vowels.length; i++)
		  if (c == vowels[i])
			  return true;
	  
	  return false;
  }
}

class LetterChanges {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterChanges(s.nextLine())); 
    
  }
} 