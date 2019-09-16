package com.company.Main;

import java.util.Scanner;

public class VladikandFraction {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        long n= in.nextLong();
        if (n>=3)
            if (n%2==0)
            {
                System.out.println((((n/2)*(n/2)+1)+" "+((n/2)*(n/2)-1)));
            }
            else
                System.out.println(((n*n)-1)/2+" "+((n*n)+1)/2);
        else
            System.out.println(-1);
    }
}
