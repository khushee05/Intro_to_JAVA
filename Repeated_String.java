
/*There is a string, s, of lowercase English letters that is repeated infinitely many times. Given an integer,n, 
find and print the number of letter a's in the first  letters of the infinite string.*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    
    public static long repeatedString(String s, long n) {
    
        if(n==0){
            return 0;
        }
        int len = s.length();
        long repeated = n/len;
        long left = n - (repeated * len);
        long num = 0;
        for(int i =0; i<len; i++){
            if(s.charAt(i) == 'a'){
                num ++;
            }
        }
        int extra = 0;
        for(int i=0; i<left;i++){
            if(s.charAt(i) == 'a'){
                extra++;
            }
        }
        
        long total = (repeated * num) + extra;
        return total;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
