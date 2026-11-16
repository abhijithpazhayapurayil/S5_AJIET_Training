/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("enter the number array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum=0,min=arr[0], max=arr[0];
        for (int x :arr) {
            sum+=x;
            if (x>max) max=x;
            if(x<min) min=x;
        }
        System.out.printf("%d %d %d",sum,min,max);
    	}
}
