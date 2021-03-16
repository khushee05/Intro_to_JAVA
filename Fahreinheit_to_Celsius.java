package intro_to_java;

import java.util.Scanner;
public class Fahreinheit_to_Celsius {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int S, E,W;
        int i;
        S = scan.nextInt();
        E = scan.nextInt();
        W = scan.nextInt();
        for(i=S; i<=E; i=i+W)
        {
        	int C=((i-32)*5)/9;
            System.out.println(i+"\t"+C);
        }
		
	}

}

