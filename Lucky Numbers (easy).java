//https://codeforces.com/problemset/problem/96/B
import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
static int n ;
static TreeSet<Long> sets = new TreeSet<>();
    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        //get the amount of digits that n has
        int numberOfDigit = 0;
        while (Math.pow(10,numberOfDigit)<=n)
            numberOfDigit++;
        //get all the possible of the number
        for (int i=2;i<=10;i+=2)
        luckyNumber(0,0,"",i);
       int i=0;
       boolean stop = true;
        Iterator<Long> it = sets.iterator();
        while(it.hasNext()&&stop){
            long u = it.next();
            if(u>=n) {
               pw.write( String.valueOf(u));
                stop = false;
            }
        }
        pw.flush();

    }

    private static void luckyNumber(int seven, int four, String s,int size) {
        if (s.length() == size&&four==size/2&&seven==size/2) {
            sets.add(Long.parseLong(s));

        }
        else if(four<size&&seven<size) {
            String temp = s+"4";
            String seventemp = s+"7";
            //toogle
            luckyNumber(seven+1,four,seventemp,size);
            luckyNumber(seven,four+1,temp,size);
        }
    }

    }
