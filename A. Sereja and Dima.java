//package com.company;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in
        ));
        PrintWriter pw =new PrintWriter( new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int [] array = new int[n];
        StringTokenizer st= new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++)
            array[i] = Integer.parseInt(st.nextToken());
        int Sereja = 0;
        int Dima = 0;
        int left = 0;
        int right = n-1;
        int i=0;
        while (i<n){
            if (i%2==0){
                //this is Sereja turn
                if (array[left]<array[right]){
                    Sereja+=array[right];
                    array[right] = 0;
                    right--;
                }else{
                    Sereja+=array[left];
                    array[left] = 0;
                    left++;
                }
            }else{
                //this is Dima turn
                if (array[left]<array[right]){
                    Dima+=array[right];
                    array[right] = 0;
                    right--;
                }else{
                    Dima+=array[left];
                    array[left] = 0;
                    left++;
                }
            }
            i++;
        }
        pw.println(Sereja+" "+Dima);
        pw.flush();
    }
}
