import java.util.*; 
import java.io.*;

class Function {  
  int FirstFactorial(int num) { 
 		for (int i=num-1; i>0; i--) {
			num *= i;	 			
		} 
       
  	return num;
  }      
}

class FirstFactorial {
  public static void main (String[] args) {  
   
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
	System.out.print(c.FirstFactorial(8));
//    System.out.print(c.FirstFactorial(s.nextLine())); 
    
  }
} 
