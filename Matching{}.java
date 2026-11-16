/*program to verify if the given input string, combinations of characters '{' and '}', is well formed.
1. {} - Matching
2. {{}} - Matching
3. {}{} - Matching
4. {}}{ - Not Matching*/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n=0;
		int match=0;
		for(char x : str.toCharArray()){
		    if(x =='{') n++;
		    else if(x == '}') n--;
		    if (n < 0) break;  
	    }
	    if(n==0){
	        System.out.println("Matching");
	    }else{
	        System.out.println("Not Matching");
	    }
	}
}
