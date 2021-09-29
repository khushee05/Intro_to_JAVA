/*There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, 
determine how many pairs of socks with matching colors there are.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



    
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] hash = new int[300];
        for(int i=0; i<n; i++){
            hash[in.nextInt()]++;
        }
        long ans=0;
        for(int p: hash){
            ans+=p/2;
        }
        System.out.println(ans);
    }

}
