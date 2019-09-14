package com.company.Main;

import java.io.*;
import java.util.*;

public class Lucky_Division {
    static ArrayList<Integer> LuckyNumber = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        luckyNumber(1000);
        int N = Integer.parseInt(br.readLine());
        System.out.println(output(N));
    }

    private static void luckyNumber(int i)
    {
        for (int j=4;j<=i;j++)
        {
            String n = String.valueOf(j);
            if (n.contains("1")||n.contains("2")||n.contains("3")||n.contains("5")||n.contains("6")||n.contains("8")||n.contains("9")||n.contains("0"))
            {
                continue;
            }
            else
                LuckyNumber.add(j);
        }
    }
    static String output(int n)
    {
        int i=0;
        while (i<LuckyNumber.size())
        {
            if (n%LuckyNumber.get(i)==0)
                return "YES";
            i++;
        }
        return "NO";
    }
}