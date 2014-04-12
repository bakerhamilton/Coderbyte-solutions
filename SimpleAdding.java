import java.util.*; 
import java.io.*;

class AddNumber {  
  int SimpleAdding(String str) { 
	int num = Integer.parseInt(str);
	int sum = 0;
	
	for (int i=0; i <= num; i++)
		sum += i;
	
    return sum;
    
  }      
}

class SimpleAdding {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    AddNumber c = new AddNumber();
    System.out.print(c.SimpleAdding(s.nextLine())); 
    
  }
} 