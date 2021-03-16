package intro_to_java;
import java.util.Scanner;
import java.lang.Math;
public class Total_salary {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int bs=s.nextInt();
		String str=s.next();
		char c=str.charAt(0);
		int all;
		if(c==65)
		{
			all=1700;
		}
		else if(c==66)
		{
			all=1500;
		}
		else
		{
			all=1300;
		}
		double ts=((bs+(0.20*bs)+(0.50*bs)+all)-(0.11*bs));
		double p=Math.round(ts);
		int h=(int)(p);
		System.out.println(h);
        /*Scanner s = new Scanner(System.in);
        double tot=0;
        int bs;
        bs=s.nextInt();
        String str = s.nextLine();
        int c= str.charAt(0);
        int a;
        double h = 0.2*bs;
        double d = 0.5*bs;
        if(c=='A')
            a=1700;
        else if(c=='B')
            a=1500;
        else
            a=1300;
        double pf = 0.11*bs;
        tot= (bs+h+d+a-pf);
        double salary=0;
        salary = (Math.round(tot));
        System.out.println((int)salary);*/
	}
}
