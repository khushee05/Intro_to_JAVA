package intro_to_java;

import java.util.Scanner;
public class AverageMarks {


	public static void main(String[] args) {
	
        Scanner s = new Scanner(System.in);
		String str;
        str = s.nextLine();
		char c = str.charAt(0);
        int m1,m2,m3;
        int avg =0;
        
        m1= s.nextInt();
        m2= s.nextInt();
        m3= s.nextInt();
        avg = (m1+m2+m3)/3;
        
        System.out.println(c);
        System.out.println(avg);
        
	}

}
