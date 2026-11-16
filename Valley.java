/*Count the number of valleys. 
You are given a string that represent steps in combination of U and D characters.
U represents to take a step up in level. 
D represents to take a step down in level.

You always start at sea level.
A valley is a dip from sea level and back to sea level.

                   *
                *    *
Sea level __ *          *                 * __ sea level
                           *     *     *
                              *     * --> this is a valley, when reached back to sea level */
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter a string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n=0;
		int valley=0;
		for(char x : str.toCharArray()){
		    if(x =='U'){
		        n++;
		        if(n==0){
		            valley++;
		        }
		    }
		    if(x == 'D'){
		        n--;
		    }
	    }
	    System.out.println(valley);
	}
}
