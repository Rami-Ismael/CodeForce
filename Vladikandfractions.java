package com.company.Main;

import java.util.Scanner;

public class Vladikandfractions {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        if (n!=0)
        System.out.println(n+" "+(n+1)+" "+n*(n+1));
        else
            System.out.println(-1);
    }
}
