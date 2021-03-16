package intro_to_java;
import java.util.Scanner;
public class Sum_of_Even_and_Odd {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);	
	int n;
    int ev=0;
    int od=0;
        n= s.nextInt();
        while(n>0)
        {
            int m =n%10;
            if(m%2==0)
            {
                ev=ev+m;
            }
            else
            {
                od=od+m;
            }
            n=n/10;
            
        }
        System.out.println(ev+" "+od);
        
	}
}
