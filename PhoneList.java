import java.util.*;
import java.math.*;
import java.io.*;

// https://ru.kattis.com/problems/phonelist

public class PhoneList {
    static boolean IS_PREFIX = false;
    
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);
        int t = in.nextInt(); // test cases
        
        for(int i = 0; i < t; i++){
            int n = in.nextInt(); // unique phone numbers
            String[] arr = new String[n];
            String consume = in.nextLine();
            for(int j = 0; j < n; j++){ // fylla fylkid
                String input = in.nextLine();
                arr[j] = input;
            }
            Arrays.sort(arr);
            outerloop:
            for(int k = 0; k < arr.length; k++){ // tjekka a ollu
                String tjekk = arr[k];
                for(int z = k + 1; z < arr.length; z++){
                    //out.println("Checking: " + tjekk + " " + "a prefix of " + arr[z]);
                    //if(tjekk.equals(arr[z])) continue;
                    if(arr[z].startsWith(tjekk)){
                        IS_PREFIX = true;
                        break outerloop;
                    } else {
                        break;
                    }
                }
            }
            if(IS_PREFIX){
                out.println("NO");
            } else {
                out.println("YES");
            }
            IS_PREFIX = false;
        }
    }
    
}