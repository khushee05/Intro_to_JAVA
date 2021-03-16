/* Write a program to print all the factors of a number other than 1 and the number itself.*/

package intro_to_java;

import java.util.Scanner;
public class Factors {
    
    public static void main(String[] args) {
        
	Scanner s = new Scanner(System.in);	
	int n;
    int i=2;
        n = s.nextInt();
        while(i<n)
        {
            if(n%i==0)
            	System.out.print(i+" ");
            i++;
        }
    }
}