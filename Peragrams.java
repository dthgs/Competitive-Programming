
// https://ru.kattis.com/problems/peragrams

import java.util.Scanner;

public class Peragrams {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        int[] cntrs = new int[26];
        int cntr = 0;

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            //System.out.println( (int) a );
            //System.out.println(Character.getNumericValue(a) - 10);
            cntrs[Character.getNumericValue(a) - 10]++;
        }

        for(int i = 0; i < 26; i++) if(cntrs[i] % 2 != 0) cntr++;

        if(cntr <= 0) System.out.println(0);
        else System.out.println(cntr-1);
    }
}