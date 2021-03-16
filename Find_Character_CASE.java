package intro_to_java;

import java.util.Scanner;
public class Find_Character_CASE {
    
    public static void main(String[] args) {
        // Write your code here
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch= str.charAt(0);
        int c = ch;
        if(c>=65 && c<= 90)
        {
           System.out.println(1);
            
        }
        else if(c>= 97 && c<= 122)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(-1);
        }
    }
    
}  
