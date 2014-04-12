import java.util.*; 
import java.io.*;

class Function {  
  char[] FirstReverse(String str) { 
    int length = str.length();
    char reversed[] = new char[length];
    
    for (int i=0; i < length; i++)
      reversed[i] = str.charAt((length-1)-i);
    
    return reversed;
  }      
}

class FirstReverse {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.FirstReverse(s.nextLine())); 
    
  }
} 

