package com.company.Main;


import java.io.*;
import java.util.*;

public class Bachgold_Problem {
    static ArrayList<Integer> divisor =new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static int t =0;
    public static void main(String[] args) throws IOException{
	// write your code here
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        factor(n);
        System.out.println(t);
        System.out.println(sb);

    }

    private static void factor(int n) {

        if (n==3)
        {
            t++;
            sb.append(3);
        }
        if (n>3&&n%2==1) {
            t++;
            sb.append(3 + " ");
            n-=3;
        }
        while (n%2==0&&n!=0)
        {
            t++;
            divisor.add(2);
            sb.append(2);
            n-=2;
            if (n%2==0&&n!=0)
                sb.append(" ");
        }
    }

}
